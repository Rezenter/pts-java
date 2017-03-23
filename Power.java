import java.util.Scanner;

public class Power {

    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println(isPowerOf2(sc.nextInt()) ? "yes" : "no");
    }

    private static boolean isPowerOf2(int n) {
       if (res(n) == 2){
    	   return true;
    	}
       return false;     
    }

	private static int res(int n) {
		if (n == 1){
			return 2;
		}
		if (n%2 != 0){
		    return 0;
		}else{
		if (n == 2){
			return 2;
		    }
		}
		return res(n/2);
	}
}