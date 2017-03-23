import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class splitBeta {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
       
        System.out.println(
            java.util.Arrays.toString(
            s.split("\\s+")));
        System.out.println(
                java.util.Arrays.toString(
                		splitByBlank(s)));

        System.out.println(Arrays.deepEquals(s.split(" "), splitByBlank(s)) ? AC_MESSAGE : WA_MESSAGE);
    }

    private static String AC_MESSAGE = "accepted";
    private static String WA_MESSAGE = "wrong answer";
    private static char BLANK = ' ';


    private static String[] splitByBlank(String s) {
    	
    	
    	int n=1;
    	for (int i=0;i<s.length()-1;i++){
      		if(s.charAt(i)== BLANK){
      			if(s.charAt(i+1)!=BLANK){
      			n++;
      			}   		
    		}
      		
    	}

 	    	String[] a = new String[n];
    	int k=0;
    	int c=0;
    	for(int i=0;i<s.length()-1;){
         	  if( s.charAt(i) == BLANK && s.charAt(i+1)!= BLANK){ 
              a[c]=s.substring(k, i);
              if(s.charAt(i)!= BLANK){
            	  k=i;}
              c++;}             
         	  
         	  i++;}
    	
    	 if (s.charAt(s.length()-1) != BLANK){
    		a[c]=s.substring(k+1,s.length());
    	}
    	
    	return a;
    }
}
