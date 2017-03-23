package term02.m03_d02;

import java.io.*;
import java.util.Scanner;

public class Bubble {


	public static int[] main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("array.txt"));
        int n = in.nextInt();
        int[] unsort = new int[n];
        for(int i = 0; i < unsort.length; i++){
    		unsort[i] = in.nextInt();
    	}
      	in.close();
    	
      	for(int k = 0; k < unsort.length; k++){
      		for(int i = 0; i < unsort.length - 1; i++){
      			if(unsort[i] > unsort[i+1]){
      	            int tmp = unsort[i+1];
      				unsort[i+1] = unsort[i];
      				unsort[i] = tmp;
      			}
      		}
      	}
       return unsort;

	}

}
