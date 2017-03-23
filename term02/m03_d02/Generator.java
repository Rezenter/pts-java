package term02.m03_d02;

import java.io.*;
import java.util.Random;

public class Generator {

    public static void main(String[] args) throws IOException {
    	int n = nextInt();
    	int k = nextInt();
    	Random random = new Random();
     	PrintWriter out = new PrintWriter (new File ("array.txt"));
     	out.println(n);
     	for(int i = 0; i < n; i++){
        out.println (random.nextInt(k));
        }
      	out.close();
    }
    
   
    private static int nextInt() throws IOException {
        return Integer.parseInt(bf.readLine());}

  private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
}