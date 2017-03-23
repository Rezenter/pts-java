package term02.m03_d02;

import java.io.*;
import java.util.Scanner;

public class Insertion {

	public static int[] main(String[] args) throws IOException {
		Scanner in = new Scanner (new File ("array.txt"));
        int n = in.nextInt();
        int[] unsort = new int[n];
        for(int i = 0; i < unsort.length; i++){
    		unsort[i] = in.nextInt();
    	}
      	in.close();
    	
      	for (int i = 1; i < unsort.length; i++) {
	            int tmp = unsort[i];
	            int index = i;
	            while(index > 0 && unsort[index - 1] > tmp) {
	                  unsort[index] = unsort[index - 1];
	                  index--;
	            }
	            unsort[index] = tmp;
	      }
		return unsort;
	}

}
