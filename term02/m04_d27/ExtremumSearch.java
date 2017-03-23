package term02.m04_d27;

/*
Требуется реализовать:
1) поиск минимума заданной функции (троичный поиск);
2) поиск максимума заданной функции (поиск с помощью золотого сечения).
 */

import term02.m04_d27.functions.Function;

public class ExtremumSearch {

    public static void main(String[] args) {
    
    }

    private static final double phi = (1 + Math.sqrt(5)) / 2;
	private static final double EPS = 1e-15;
	private static final double resphi = 2 - phi;
	
	
    public static double ternarySearchMin(Function function, double left, double right,double EPS) {
    	
    	if (right - left < EPS){
    		    return (left + right) / 2;
    		    }
        double i = (left * 2 + right) / 3;
        double j = (left + right * 2) / 3;
    		  if (function(i) < function(j)){
    		    return ternarySearchMin(function, left, j, EPS);
    		  }else{
    		    return ternarySearchMin(function, i, right, EPS);
    		  }
    		
    	
    }

    private static double goldenSectionSearchMax(Function function, double left, double right, double EPS) {
    	

    			
    			   double x1 = left + resphi * (right - left);
    			   double x2 = right - resphi * (right - left);
    			   double f1 = function(x1);
    			   double f2 = function(x2);
    			   
    			   while(Math.abs(right - left) > EPS){
    			       if (f1 < f2){
    			           right = x2;
    			           x2 = x1;
    			           f2 = f1;
    			           x1 = left + resphi * (right - left);
    			           f1 = function(x1);
    			       }else{
    			           left = x1;
    			           x1 = x2;
    			           f1 = f2;
    			           x2 = right - resphi * (right - left);
    			           f2 = function(x2);
    			       }
    			   }
    			   
    			   return (x1 + x2) / 2;
    			   
    }
}
