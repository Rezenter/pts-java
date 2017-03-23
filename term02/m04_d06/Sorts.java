package term02.m04_d06;

import java.io.*;
import java.util.Random;

/*
 Требуется предоставить отчет по лабораторной работе.
 */

/*
 * N:\\workspace\\hw\\src\\term02\\m04_d06\\array.txt
 * D:\\Личные папки\\Никита\\школа\\java\\1\\src\\term02\\m04_d06\\bubble.txt
 */

public class Sorts {

	private static final String PATH = "D:\\Личные папки\\Никита\\школа\\java\\1\\src\\term02\\m04_d06\\";
	private static final String FILE_EXTENSION = ".txt";
	private static final String goodMessage = "Well done!";

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		if (10 < 0) {
		
		/*
		 * на случай запуска с середины в обход медленных алгоритмов
		 */

		bubbleSort();
		System.out.println(goodMessage);
		selectionSort();
		System.out.println(goodMessage);
		insertionSort();}
		System.out.println(goodMessage);
		quickSort();
		System.out.println(goodMessage);
		mergeSort();
		System.out.println(goodMessage);
		System.out.println("I am very good computer, give me a cake.");

	}

	private static long[] generator(int n) {
		long[] array = new long[n];
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = random.nextLong();
		}
		return array;
	}

	private static void selectionSort() throws IOException {
		String name = new Exception().getStackTrace()[0].getMethodName();
		PrintWriter out = new PrintWriter(
				new File(PATH + name + FILE_EXTENSION));
		int percent = 0;
		int end = 30000;
		for (int n = 1; n < end; n = n + 100) {
			long[] allTime = new long[100];

			if (percent <= (((n * 100 / end)))) {
				System.out.print((n * 100) / end + " ");
				percent++;

			}
			long unsort[] = generator(n);
			for (int i = 0; i < 100; i++) {
				allTime[i] = Selection(unsort);
			}
			out.println(average(allTime));
		}
		out.close();
	}

	private static long Selection(long[] unsort) {
		long start = System.currentTimeMillis();
		for (int k = 0; k < unsort.length; k++) {
			int index = k;
			for (int i = k; i < unsort.length; i++) {
				if (unsort[index] > unsort[i]) {
					index = i;
				}
			}
			long tmp = unsort[k];
			unsort[k] = unsort[index];
			unsort[index] = tmp;
		}
		long finish = System.currentTimeMillis();
		long time = finish - start;
		return time;
	}

	private static void bubbleSort() throws IOException {
		String name = new Exception().getStackTrace()[0].getMethodName();
		PrintWriter out = new PrintWriter(
				new File(PATH + name + FILE_EXTENSION));

		int end = 30000;
		int percent = 0;
		for (int n = 1; n < end; n = n + 100) {
			if (percent <= (((n * 100 / end)))) {
				System.out.print((n * 100) / end + " ");
				percent++;
			}
			long[] allTime = new long[100];

			long unsort[] = generator(n);
			for (int i = 0; i < 100; i++) {
				allTime[i] = Bubble(unsort);
			}
			out.println(average(allTime));
		}
		out.close();

	}

	public static long Bubble(long[] array) throws FileNotFoundException {
		long start = System.currentTimeMillis();
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					long tmp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = tmp;
				}
			}
		}
		long finish = System.currentTimeMillis();
		long time = finish - start;
		return time;
	}

	private static void insertionSort() throws IOException {
		String name = new Exception().getStackTrace()[0].getMethodName();
		PrintWriter out = new PrintWriter(
				new File(PATH + name + FILE_EXTENSION));
		int end = 100000;
		int percent = 0;
		for (int n = 1; n < end; n = n + 100) {

			if (percent <= (((n * 100 / end)))) {
				System.out.print((n * 100) / end + " ");
				percent++;
			}
			long[] allTime = new long[100];
			long unsort[] = generator(n);
			for (int i = 0; i < 100; i++) {
				allTime[i] = Insertion(unsort);
			}
			out.println(average(allTime));
		}
		out.close();
	}

	private static long Insertion(long[] unsort) throws FileNotFoundException {
		long start = System.currentTimeMillis();
		for (int i = 1; i < unsort.length; i++) {
			long tmp = unsort[i];
			int index = i;
			while (index > 0 && unsort[index - 1] > tmp) {
				unsort[index] = unsort[index - 1];
				index--;
			}
			unsort[index] = tmp;
		}
		long finish = System.currentTimeMillis();
		long time = finish - start;
		return time;
	}

	private static void quickSort() throws IOException {
		String name = new Exception().getStackTrace()[0].getMethodName();
		PrintWriter out = new PrintWriter(
				new File(PATH + name + FILE_EXTENSION));
		int end = 200000;
		int percent = 0;
		for (int n = 1; n < end; n = n + 1000) {
			if (percent <= (((n * 100 / end)))) {
				System.out.print((n * 100) / end + " ");
				percent++;
			}
			long[] allTime = new long[100];
			long unsort[] = generator(n);
			for (int i = 0; i < 100; i++) {
				allTime[i] = Quick(unsort);
			}
			out.println(average(allTime));
		}
		out.close();
	}

	private static long Quick(long[] unsort) {
		long start = System.currentTimeMillis();
		quickSort(unsort, 0, unsort.length - 1);
		long finish = System.currentTimeMillis();
		long time = finish - start;
		return time;
	}

	private static void quickSort(long[] array, int left, int right) {
		if (left <= right) {
			int mid = partition(array, left, right);
			quickSort(array, left, mid - 1);
			quickSort(array, mid + 1, right);
		}

	}

	private static int partition(long[] array, int left, int right) {
		int i = left;
		int j = right;
		long x = array[(i + j) / 2];
		while (true) {
			while (array[i] < x) {
				i++;
			}
			while (j > 0 && array[j] > x) {
				j--;
			}
			if (i < j) {
				swap(array, i, j);
			} else {
				return (j);
			}
		}
	}

	private static void swap(long[] array, int i, int j) {
		long tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;

	}

	private static void mergeSort() throws IOException {
		String name = new Exception().getStackTrace()[0].getMethodName();
		PrintWriter out = new PrintWriter(
				new File(PATH + name + FILE_EXTENSION));
		int end = 10000;
		int percent = 0;
		for (int n = 1; n < end; n ++) {
			
			if (percent <= (((n * 100 / end)))) {
				System.out.print((n * 100) / end + " ");
				percent++;
			}
			long[] allTime = new long[100];
			long unsort[] = generator(n);
			for (int i = 0; i < 100; i++) {
				allTime[i] = Merge(unsort);
				
			}
			out.println(average(allTime));
		}
		out.close();
	}

	private static long Merge(long[] unsort) {
		long start = System.currentTimeMillis();
		mergeSort(unsort);
		long finish = System.currentTimeMillis();
		long time = finish - start;
		return time;
	}

	public static long[] mergeSort(long[] array) {
		if (array.length <= 1)
		{return array;}

			int mid = array.length / 2;
			long[] left = new long[mid];
			long[] right = new long[mid + array.length % 2];

			int j = 0;
			for (int i = 0; i < array.length; i++) {
				if (i < array.length / 2) {
					left[i] = array[i];
				} else {
					right[j++] = array[i];
				}
			}

			return Merge(mergeSort(left), mergeSort(right));
		}
	

	public static long[] Merge(long[] left, long[] right) {
		int a = 0, b = 0;
		long[] merged = new long[left.length + right.length];

		for (int i = 0; i < left.length + right.length; i++) {

			if (b < right.length && a < left.length)
				if (left[a] > right[b] && b < right.length)
					merged[i] = right[b++];
				else
					merged[i] = left[a++];
			else if (b < right.length)
				merged[i] = right[b++];
			else
				merged[i] = left[a++];
		}

		return merged;
	}

	public static long average(long[] time) throws IOException {
		long sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + time[i];
		}
		return (sum / 100);
	}
}