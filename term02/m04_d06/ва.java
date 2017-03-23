package term02.m04_d06;

import java.util.Arrays;



public class ва {

	
	public static void main(String[] args) {
	int[] array = new int[10];
	array[0]=34;
	array[1]=2;
	array[2]=252;
	array[3]=23;
	array[4]=12;
	array[5]=2123;
	array[6]=21231;
	array[7]=0;
	array[8]=2;
	array[9]=132425;
	
		int[] x = mergeSort(array);	
		Arrays.sort(array);

        if (Arrays.equals(array, x)) {
            System.out.println("+");
        } else {
            System.err.println("-");
        }
	}
		
		public static int[] mergeSort(int[] arr) {  
		    if (arr.length <= 1)  return arr;  
		  
		    int mid = arr.length / 2;  
		    int[] left = new int[mid];  
		    int[] right = new int[mid + arr.length%2];  
		  
		    int j = 0;  
		    for (int i = 0; i < arr.length; i++) {  
		        if (i < arr.length / 2) {  
		            left[i] = arr[i];  
		        } else {  
		            right[j++] = arr[i];  
		        }  
		    }  
		    return Merge(mergeSort(left), mergeSort(right));  
		}  
		  
		public static int[] Merge(int[] left, int[] right) {  
		    int a = 0, b = 0;  
		    int[] merged = new int[left.length + right.length];  
		    //забиваем отсортированный массив из левой и правой частей  
		    for (int i = 0; i < left.length + right.length; i++) {  
		        //поочередно берем меньший член из крайних левого и правого  
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