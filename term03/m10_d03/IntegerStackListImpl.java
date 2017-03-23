package term03.m10_d03;


import java.util.NoSuchElementException;

import term03.integerCollections.IntegerStack;

/**
 * Структура данных "стек", хранящая целые числа (реализация на списке).
 * (http://docs.oracle.com/javase/6/docs/api/java/util/Stack.html)
 */
public class IntegerStackListImpl implements IntegerStack {

	private class Node{
		public long element;
		public Node next;
		public Node(long element,Node next){
			this.element=element;
			this.next=next;
		}
	}
	private Node head;
	private int size;
	
	
    public boolean push(long element) {
		head = new Node(element,head);
		size++;
		return true;
    }

   
    public long pop() {
    	long result;
    	if(isEmpty()){
       		throw new NoSuchElementException("Empty");
       	}else{
        result = head.element;
    	head = head.next;
    	size--;
    	}
        return result;  
    }

    
    public long peek() {
    	
    	if(isEmpty()){
    		throw new NoSuchElementException("Empty");
    	}else{
    		 
    	return head.element;
    	}
   }

    
    public int size() {
        return size;  
    }

    
    public boolean isEmpty() {
        return head == null;  
    }

   
    public void clear() {
        size = 0;
        head = null;
    }

    
    public boolean add(long element) {
        push(element);
    	return true;  
    }

    
    public boolean remove(long element){
    Node tmp=head;
    if(head.element == element){
    	head=head.next;
    	size--;
    	return true;
    }else{
    	Node next=head.next;
    	for(; next.next!=null;tmp=tmp.next){
    		next = tmp.next;
    		if(next.element==element){
    			tmp.next=next.next;
    			size--;
    			return true;
    		}
    	}
    }
    return false;
    }
    
    
    

   

    
    
      public boolean contains(long element){
        Node tmp = head;
        for(int a = 0; a < size; a++){
        	if(tmp.element==element){
        		return true;
          	}
            tmp=tmp.next;
        }
    	return false;
    }
     
     
}

	