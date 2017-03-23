	import java.util.Scanner;
	public class IsSort {

	    private static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        long[] arr = new long[sc.nextInt()];

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextLong();
	        }

	        System.out.print(isSort(arr));
	    }

	    private static boolean isSort(long[] arr) {
	    	boolean a;
	    	int c = arr.length-1;
	    	for(;c>0 && arr[c]<arr[c-1];c--);
	        if (c==0){
	    		a = false;}
	    	else {
	    		a = true;}  		   
		    	return a;
	}
	}