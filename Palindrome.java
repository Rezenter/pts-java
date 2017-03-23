import java.util.Scanner;

public class Palindrome {

    private static Scanner sc;
    private static int n=0;
	public static void main(String[] args) {
        sc = new Scanner(System.in);
   
        System.out.println(isPalindrome(sc.nextLine()) ? "yes" : "no");
    }
	
    private static boolean isPalindrome(String s) {
    	   
        if (res(s,n) == 1){
    	    return true;
    	}else{
    		return false;
    	}
     }
     
	private static int res(String s,int n) {
		
		if (n >= s.length()){
			return 0;
		}else{
			if (s.charAt(n) == (s.charAt(s.length() - 1) - n)){
				return 1;
			}
		}
		return res(s,n+1);
	}
}