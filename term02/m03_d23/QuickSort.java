package term02.m03_d23;

import java.util.Arrays;
import java.util.Random;

/*
Требуется реализовать quickSort и получить сообщение "correct".
Существующий текст изменять запрещается.
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] array = generateArray(MAX_LENGTH);
        int[] sorted = array.clone();

        quickSort(array);
        Arrays.sort(sorted);

        if (Arrays.equals(array, sorted)) {
            System.out.println(CORRECT_MESSAGE);
        } else {
            System.err.println(INCORRECT_MESSAGE);
        }
    }

    final private static int MAX_LENGTH = 10000;
    final private static String CORRECT_MESSAGE = "correct";
    final private static String INCORRECT_MESSAGE = "incorrect";

    private static int[] generateArray(int length) {
        int[] result = new int[length];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt();
        }

        return result;
    }

    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
       	if(left <= right){
    		int mid = partition(array, left, right);
    		quickSort(array, left, mid - 1);
    		quickSort(array, mid + 1, right);
    	}
       	
    }

    private static int partition(int[] array, int left, int right) {
    	int i = left;
    	int j = right;
    	int x = array[(i + j)/2];
    	while(true){
    		while(array[i] < x){
    			i++;
    		}
    		while(j > 0 && array[j] > x){
    			j--;
    		}   			
      		if(i < j){
    			swap(array, i, j);
      		}else{
    			return (j);
    		}
       	}
    }

	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
		
	}
}