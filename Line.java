import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Line {
    public static void main(String[] args) throws IOException {
    	System.out.println("�������� 1");
    	int x1 = nextInt(); 
        System.out.println("�������� 1");
        int y1 = nextInt();
        System.out.println("�������� 2");
        int x2 = nextInt();
        System.out.println("�������� 2");
        int y2 = nextInt();
        int a = (y1-y2)/(x1-x2);
        int b = y1-a*x1;
        System.out.println("�������� 3"); 
        int x3 = nextInt();
        System.out.println("�������� 3");
        int y3 = nextInt();
        int f = a*x3+b;
      if(a==0) {
    	  if(y3>f) {
    		  System.out.println("������");
    	     	  }
    	  else{
    		  if(y3<f) {
    			  System.out.println("�����");
    		               }
    		  else{
    			  System.out.println("����� �� ������");
    		  }
    	  }
      }
      else {  
      if (y3>f) {
        	System.out.println("�����");
        			}
        else {
        	 if (y3<f) {
 	        	System.out.println("������");
 	        			}
 	        else {
 	        	System.out.println("����� �� ������");}
        	 } 
        }
        	
    }
    private static int nextInt() throws IOException {
     return Integer.parseInt(bf.readLine());}
      private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
} 