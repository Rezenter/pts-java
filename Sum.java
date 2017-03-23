import java.util.Scanner;

public class Sum {

    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println(sumOfDigits(sc.nextInt(),i));
    }
    final int d (int n){
    	if (n>=0){
    		if (n==0){
    			return 0;
    		}else{
    			return  n;
    		 }
    		}else{
    			return -n;
    		}
    	}
   
    private static int i = 10;
    private static int sumOfDigits(int d,int i) {
    	 
    	if (d<i){
    		return 0;
    	} 
   
        return d%i+(sumOfDigits(d,i*10)*10/i);
    }

}