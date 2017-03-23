import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minOld {

    public static void main(String[] args) throws IOException {
        int a = nextInt(); 
        int b = nextInt2();
        int c = nextInt3();
     
if (a>=b){
	if(b>=c){
		System.out.println(c);
	}
	else{
		System.out.println(b);
	}
}
	else {
		if(a<=c){
			System.out.println(a);
	}
		else{
			System.out.println(c);
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