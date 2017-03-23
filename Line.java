import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Line {
    public static void main(String[] args) throws IOException {
    	System.out.println("абсцисса 1");
    	int x1 = nextInt(); 
        System.out.println("ордината 1");
        int y1 = nextInt();
        System.out.println("абсцисса 2");
        int x2 = nextInt();
        System.out.println("ордината 2");
        int y2 = nextInt();
        int a = (y1-y2)/(x1-x2);
        int b = y1-a*x1;
        System.out.println("абсцисса 3"); 
        int x3 = nextInt();
        System.out.println("ордината 3");
        int y3 = nextInt();
        int f = a*x3+b;
      if(a==0) {
    	  if(y3>f) {
    		  System.out.println("сверху");
    	     	  }
    	  else{
    		  if(y3<f) {
    			  System.out.println("снизу");
    		               }
    		  else{
    			  System.out.println("лежит на прямой");
    		  }
    	  }
      }
      else {  
      if (y3>f) {
        	System.out.println("слева");
        			}
        else {
        	 if (y3<f) {
 	        	System.out.println("справа");
 	        			}
 	        else {
 	        	System.out.println("лежит на прямой");}
        	 } 
        }
        	
    }
    private static int nextInt() throws IOException {
     return Integer.parseInt(bf.readLine());}
      private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
} 