import java.util.Scanner;

public class GreatestCommonDivisor {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(gcd(sc.nextInt(), sc.nextInt()));
    }

    public static int gcd(int a, int b) {
    	int c = Math.min(a,b);
    	for(;c>0;c--){
        	if (a%c==0 && b%c==0){ 		     				
              			break;
        			}
          }           
       return c;
     }
    } 
           




