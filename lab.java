import java.io.*;

import java.util.Scanner;
public class lab {

	

	

	    public static void main(String[] args) throws IOException {
	    	Scanner in = new Scanner(new File("D:\\Личные папки\\Никита\\школа\\java\\1\\src\\array.txt"));
	    	Scanner inn = new Scanner(new File("D:\\Личные папки\\Никита\\школа\\java\\1\\src\\int.txt"));
	    	PrintWriter out = new PrintWriter (new File ("D:\\Личные папки\\Никита\\школа\\java\\1\\src\\out.txt"));
	    
	    	double l = inn.nextDouble();
	    	for(int g = 0 ; g<32000;g++){
	    	
	        
	    	
	    	
	    	if(l>0){
	  		        
	  	    		out.println(l);
	  	    		
	  	    		l = inn.nextDouble();
	    	}else{
	    		out.println();
	    	}
	    	
	    	}
	    	out.close();
	      	inn.close();
	      	in.close();
	    }
	    
	   
	   
	  
	}