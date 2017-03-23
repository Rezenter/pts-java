import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Min {

	public static void main(String[] args) throws IOException {
    int n = nextInt();
    int i =0;
    double x=nextDouble();
    while(i<n-1){
    double p = nextDouble();
    x=Math.min(p,x);
    i++;
     }
     System.out.println(x);
	}
		
	private static double nextDouble() throws IOException {
        return Double.parseDouble(bf.readLine());}
	 private static int nextInt() throws IOException {
         return Integer.parseInt(bf.readLine());}
	

  private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 
}