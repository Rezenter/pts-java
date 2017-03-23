import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	
	public static void main(String[] args) throws IOException {
	
	int n = nextInt();
	int a = 0;
	int b= 1;
	int i=0;
	int x=1;
	while( x <= n){
		a=b;
		b=i;
		x++;
		i=a+b;
	  }
	 System.out.println(i);
	}
	private static int nextInt() throws IOException {
        return Integer.parseInt(bf.readLine());}

  private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
}
