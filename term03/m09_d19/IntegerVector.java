package term03.m09_d19;

import java.util.NoSuchElementException;

/**
 * Структура данных "вектор", хранящая целые числа.
 */
public class IntegerVector implements IntegerList {
    
	private static final int EXTERN = 2; /*коэффициент расширения/сжатия*/
    private static int C = 10; /*текущая вместимость массива*/
	private long[] elements = new long[C];
    private int size = 0;

    public int currentCapacity() {
    	return C;
    }
    
    
    
    @Override
    public long get(int index) {
        if (0 <= index && index < size()) {
            return elements[index];
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public long set(int index, long element) {
    	
    	if (0 <= index && index < elements.length) {
            long result = elements[index];

            elements[index] = element;

            return result;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void add(int index, long element) throws Exception {
    	 ensureCapacity();
    	 if(index > size){
    		 throw new Exception();
    	 }else{
    		 for(int a = size;a >= index;a --){
    			set(a + 1, elements[a]); 
    		 }
    		 set(index, element);
    	     size++;
    	 }
    }

    @Override
    public long remove(int index) {
        long out = get(index);
        for(int a = index; a < size ; ){
        	set(a, elements[a+1]);
            a++;
        }
        size--;
    	ensureCapacity();       
    	return out;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        elements = new long[C];
        size = 0;
    }

    @Override
    public boolean add(long element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity() {
    	if(size() >= elements.length){
    		C = C*EXTERN;
    		long[] tmp = new long[C];
    		for(int a = 0; a < size(); a++){
    			tmp[a] = elements[a];
    		}
    		elements = tmp;
    	}else{ 
    		if(size() < elements.length / (EXTERN * EXTERN)){
    			C = C / EXTERN;
    			long[] tmp = new long[C];
    			for(int a = 0; a < size(); a++){
        			tmp[a] = elements[a];
        		}
        		elements = tmp;
    	        }
        }
    }

    @Override
    public boolean remove(long element) {
        for(int a = 0; a < size(); ){
        	if(get(a) == element){
        		remove(a);
        		return true;
        	}
        	a++;
        }
    	return false;
    }

    @Override
    public boolean contains(long element) {
    	 for(int a = 0; a < size(); ){
         	if(get(a) == element){
         		return true;
         	}
         	a++;
         }
     	return false; 
    }
}