	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class SquareEquationRoots {

		    public static void main(String[] args) throws IOException {
	        int a = nextInt(); 
	        int b = nextInt2();
	        int c = nextInt3();
	        int d = b*b - 4*(a*c);
	     if (a==0){
	    	 System.out.println(1);
	     }
	     else{
	     if (d<0){
	    	 System.out.println(0);
	     }
	     else{
	 	 if (d>0){
	    	 System.out.println(2);
	     }
	 	 else {
	    	 System.out.println(1);
	     }
	     }
	}
}

	    private static int nextInt() throws IOException {
	        return Integer.parseInt(bf.readLine());}
	    private static int nextInt2() throws IOException {
	            return Integer.parseInt(bf.readLine());}
	    private static int nextInt3() throws IOException {
	                return Integer.parseInt(bf.readLine());
	    }

	      private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	} 