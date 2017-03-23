package term02.m03_d16;

import java.io.*;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) throws IOException {
    	int query = nextInt();
    	
    	/*
    	 * N:\\workspace\\hw\\src\\term02\\m03_d02\\array.txt
    	 * D:\\Личные папки\\Никита\\школа\\java\\1\\src\\term02\\m03_d16\\array.txt
    	 */
    	
    	Scanner in = new Scanner (new File ("D:\\Личные папки\\Никита\\школа\\java\\1\\src\\term02\\m03_d16\\array.txt"));
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
    		array[i] = in.nextInt();	
       	}
        Arrays.sort(array);
      	in.close();
      	int num = search(array, query);
      	if (num == -1){
        System.out.println(num);
      	}else{
      		int i;
      	for(i = num; i > 0 && array[num] == array[i]; i-- ){
      	}
      	System.out.println(i);
      	}
    }

    public static int search(int[] array, int query) {
        int l = 0;
        int r = array.length;
        while (l != r){
        	if(l == r-1){
        		return l;
        	}
        	int mid = (l + r)/2;
        	if (array[mid] >= query){
           		r = mid;
              	}else{
        		l = mid;
        	}
        }
        
    	return -1;
    }
       
    private static int nextInt() throws IOException {
        return Integer.parseInt(bf.readLine());}

  private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
}