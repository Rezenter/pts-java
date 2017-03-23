package term02.m03_d02;


import java.io.*;
import java.util.*;

public class Sorts {
	
    public static void main(String[] args) throws IOException {
    	
    	Generator.main(args);
    	
    	int[] array = readArray();
        
        int[] select = selectionSort(array, args);
        int[] bubble = bubbleSort(array, args);
        int[] insertion = insertionSort(array, args);

        Arrays.sort(array);
        printlnVerdict(array, select, SORTS[0]);
        printlnVerdict(array, bubble, SORTS[1]);
        printlnVerdict(array, insertion, SORTS[2]);
    }
    
    final private static String FORMAT = "%s sort: %s\n";
    final private static String CORRECT = "correct";
    final private static String INCORRECT = "incorrect";
    final private static String[] SORTS = {"Selection", "Bubble", "Insertion"};

    private static void printlnVerdict(int[] pattern, int[] candidate, String name) {
        System.out.printf(FORMAT, name, Arrays.equals(pattern, candidate) ? CORRECT : INCORRECT);
    }

    private static int[] readArray() throws IOException {
    	Scanner in = new Scanner (new File ("array.txt"));
        int n = in.nextInt();
        int[] unsort = new int[n];
        for(int i = 0; i < unsort.length; i++){
    		unsort[i] = in.nextInt();
    	}
      	in.close();
    	return unsort;
    }

    private static int[] selectionSort(int[] array, String[] args) throws IOException {
        return Selection.main(args);
    }

    private static int[] bubbleSort(int[] array, String[] args) throws IOException {
       	return Bubble.main(args);
    }

    private static int[] insertionSort(int[] array, String[] args) throws IOException {
        return Insertion.main(args);
    }
}