package term02.m04_d20;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
Реализовать алгоритм поиска k-ой порядковой статистики.

input:
5
4.5 -3.7 2.4 5.6 0.0
3

output:
2.4
 */
public class Search {
	
	
    private static final int length = 1000;
	public static void main(String[] args) throws IOException {
	int k = nextInt();
    double[] array = generator(length);
    System.out.println (searchKth(array, k));
   
	}

    private static double[] generator(int length) {
    	
    	    	double[] array = new double[length];
    	    	Random random = new Random();
    	     	
    	     	for(int i = 0; i < length; i++){
    	        array[i] = random.nextInt(100);
    	        }
    	      	return array;
    	    }

	private static int searchKth(double[] array, int k) {
		 int left = 0;
		 int right = array.length;
		 while (true) {
			 int mid = partition(array, left, right);
			 if(k == mid){
	           return mid;
	         }else{
			 if(k < mid){
				 right = mid;
			 }else{
				 k = k -mid - 1;
			      left = mid + 1;
			 }
			 
	      }
		}
	}

	private static int partition(double[] array, int left, int right) {
		
		  double x = array[left];
		  int i = left;
		  int j = right-1;
		  while (true){
		    while (array[i] < x){
		      i = i + 1;
		    }
		    while( array[j] > x){		    	
		      j = j - 1;
		    }
		  
		    if (i < j){
		    	swap(array[i],array[j]);
		    }else{ 
		    	return j;
		    	}
		    }
	}

	private static void swap(double d, double e) {
		double tmp = d;
	    d = e;
	    e = tmp;
		
	}
private static int nextInt() throws IOException {
        return Integer.parseInt(bf.readLine());}

  private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
}