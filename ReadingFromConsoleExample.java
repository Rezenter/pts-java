import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromConsoleExample {

    public static void main(String[] args) throws IOException {
        int a = nextInt(); 
       
        System.out.println(a); 
        
        int b = a*a-2*a-1;
    System.out.println(b);
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(bf.readLine());}

      private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
} 