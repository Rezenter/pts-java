
	package term02.m04_d06;

	import java.io.*;
	import java.util.Arrays;
	import java.util.Random;

	/*
	 Требуется предоставить отчет по лабораторной работе.
	 */

	/*
	 * N:\\workspace\\hw\\src\\term02\\m04_d06\\array.txt
	 * D:\\Личные папки\\Никита\\школа\\java\\1\\src\\term02\\m04_d06\\bubble.txt
	 */

	public class x {

		
		private static final String goodMessage = "Well done!";
		
		
		public static void main(String[] args) throws IOException {
			
	
			/*
			 * на случай запуска с середины
			 */

			
			mergeSort1(generator (100));
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

		
		private static long[] mergeSort1(long[] array) throws IOException {

		

			for (int n = 100; n <= 100; ) {
				System.out.print(n + " ");
				
				array = generator(n);
				
		            
					
			
			
		

	
		    if (array.length < 1) { 

		    int mid = array.length / 2;
		    long[] left = new long[mid];
		    long[] right = new long[mid + array.length%2];

		    int j = 0;
		    for (int i = 0; i < array.length; i++) {
		        if (i < array.length / 2) {
		            left[i] = array[i];
		        } else {
		            right[j++] = array[i];
		        }
		    }
		    Arrays.sort(array);

	        if (Arrays.equals(array, Merge(mergeSort1(left), mergeSort1(right)))) {
	            System.out.println("+");
	        } else {
	            System.err.println("-");
	        }
		    return Merge(mergeSort1(left), mergeSort1(right));
		}
			
		}
			return null;}

		public static long[] Merge(long[] left, long[] right) {
		    int a = 0, b = 0;
		    long[] merged = new long[left.length + right.length];
		    
		    for (int i = 0; i < left.length + right.length; i++) {
		       
		        if (b < right.length && a < left.length)
		            if (left[a] > right[b] && b < right.length)
		                merged[i] = right[b++];
		            else
		                merged[i] = left[a++];
		        else
		            if (b < right.length)
		                merged[i] = right[b++];
		            else
		                merged[i] = left[a++];
		    }
		    
		    return merged;
		}
	}
