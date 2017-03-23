import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyNumberSlevin {

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int a = n/100000;
        int b = (n/10000)-a*10;
        int c = (n/1000)-b*10-a*100;
        int d = (n/100)-c*10-b*100-a*1000;
        int e = (n/10)-d*10-c*100-b*1000-a*10000;
        int f = n-e*10-d*100-c*1000-b*10000-a*100000;
    
        System.out.println(isLucky(a,b,c,d,e,f));}
	    static boolean isLucky(int a, int b, int c, int d, int e, int f) {
	        if (a+b+c==d+e+f) {
	        	return true;
	        			}
	        else {return false;}} 
      
         private static int nextInt() throws IOException {
            return Integer.parseInt(bf.readLine());}

      private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
}
