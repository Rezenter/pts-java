package term03.m10_d03;

import java.security.NoSuchAlgorithmException;

import term03.integerCollections.IntegerStack;

import term03.m09_d19.IntegerVector;
/**
 * Структура данных "стек", хранящая целые числа (реализация на векторе).
 * (http://docs.oracle.com/javase/6/docs/api/java/util/Stack.html)
 */
public class IntegerStackArrayImpl implements IntegerStack {
    
	IntegerVector vector = new IntegerVector();
	
    
    public boolean push(long element) {
    	vector.add(element);
    	return true;  
    }

   
    public long pop() {
    	return vector.remove(vector.size()-1);
    }

  
    public long peek() {
        return vector.get(vector.size()-1);
    }

   
    public int size() {
        return vector.size();
    }

  
    public boolean isEmpty() {
        return vector.size()==0; 
    }

    
    public void clear() {
       vector.clear();
    }

    
    public boolean add(long element) {
        vector.add(element);
    	return true;
    }

   
    public boolean remove(long element) throws NoSuchAlgorithmException {
    	throw new NoSuchAlgorithmException(); 
    }

   
    public boolean contains(long element) {
        for(int i = 0; i<vector.size();i++){
            if(vector.get(i)==element){
            	return true;
            }
        }
    	return false;  
    }
}
