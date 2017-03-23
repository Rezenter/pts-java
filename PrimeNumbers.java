
import java.util.Scanner;

/*
��������� ����������� ������ ���������� �� 1 �� n: sieve[i] == true, ���� ����� i + 1 �������. ����� 1 ������� �������.
���� ������� main �������� ���������.
 */

public class PrimeNumbers {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[] isPrime = sieveOfEratosthenes(sc.nextInt());

        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    private static boolean[] sieveOfEratosthenes(int n) {
        boolean[] sieve = new boolean[n];
        for(int k =2;k<n;){
            for(int i = 0;i<n;i++){
             if(i%k==0 || i==1){
              sieve[i]=true; 
             }
             else{sieve[i]=false;
             }
             if(i<=n){
            	continue;
             }
             else{
            	 i=0;
            	 k++; 
            	 sieveOfEratosthenes(sc.nextInt());
              }
             }
           
            }
        
        return sieve;
    }
}

               
               
                

