package term02.m04_d06;

import java.util.Arrays;
import java.util.Random;

/*
Требуется реализовать mergeSort и получить сообщение "correct".
Существующий текст изменять запрещается.
 */

public class MergeSort {

    public static void main(String[] args) {
        int[] array = generateArray(MAX_LENGTH);
        int[] sorted = array.clone();

        mergeSort(array);
        Arrays.sort(sorted);

        if (Arrays.equals(array, sorted)) {
            System.out.println(CORRECT_MESSAGE);
        } else {
            System.err.println(INCORRECT_MESSAGE);
        }
    }

    final private static int MAX_LENGTH = 10000000;
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

    private static void mergeSort(int[] array) {
    	long start = System.currentTimeMillis();
    	mergeSort(array, 0, array.length-1);
    	long finish = System.currentTimeMillis();
		long time = finish - start;
		System.out.println(time);
    }

    private static void mergeSort(int[] array, int left, int right) {
    	if (left < right) {
    	      
    	      int mid =(right + left) / 2;
      	      mergeSort(array,left, mid);	      
    	      mergeSort(array, mid + 1, right);
    	      merge(array,left, mid, right);
    	    }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        if (right > mid){ 
        	int[] tmp = new int[array.length];       
        	for (int i = left; i != mid + 1; i++) { 
        		tmp[i] = array[i]; 
        	} 
        	for (int i = mid + 1; i != right + 1; i++) { 
        		tmp[i] = array[right + mid + 1 - i]; 
        	}        
        	int k = left;
        	int j = right; 
        	for (int i = left; i != right + 1; i++) { 
        		if (tmp[k] <= tmp[j]){
        			array[i] = tmp[k++];
        		}else{ array[i] = tmp[j--];
        			  }
        	}
       }
   } 
}
