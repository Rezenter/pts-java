package term02.m03_d02;

import java.io.*;
import java.util.Scanner;

public class Selection {

	public static int[] main(String[] args) throws IOException {
		Scanner in = new Scanner (new File ("array.txt"));
        int n = in.nextInt();
        int[] unsort = new int[n];
        for(int i = 0; i < unsort.length; i++){
    		unsort[i] = in.nextInt();
    	}
      	in.close();
    	
      	for(int k = 0; k < unsort.length; k++){
      		int index = k;
       		for(int i = k; i < unsort.length; i++){
      			if(unsort[index] > unsort[i]){
                   index = i;
      			}
      		}
       		int tmp = unsort[k];
		    unsort[k] = unsort[index];
			unsort[index] = tmp;
        }
		return unsort;
	}
}
