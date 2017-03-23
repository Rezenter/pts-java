import java.util.Scanner;

public class Choose {

    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
       
        System.out.println(choose(sc.nextInt(), sc.nextInt()));
    }

    private static int choose(int n, int k) {
        if (n == k){
        	return 1;
        }else{
    	return (n/(n-k))*(choose(n-1,k));
        /*
         *При фиксированном значении k биномиальные коэффициенты могут быть вычислены по данной формуле.
         *http://ru.wikipedia.org/wiki/%D0%91%D0%B8%D0%BD%D0%BE%D0%BC%D0%B8%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9_%D0%BA%D0%BE%D1%8D%D1%84%D1%84%D0%B8%D1%86%D0%B8%D0%B5%D0%BD%D1%82 
         */
        }
    }   
}

