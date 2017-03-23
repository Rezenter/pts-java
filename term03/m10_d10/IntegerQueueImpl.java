package term03.m10_d10;

import java.util.NoSuchElementException;

import term03.integerCollections.IntegerQueue;



/**
 * Структура данных "очередь", хранящая целые числа (реализация на списке).
 * (http://docs.oracle.com/javase/6/docs/api/java/util/Queue.html)
 */
public class IntegerQueueImpl implements IntegerQueue {

	protected Node head, tail;

	protected int size;

	protected class Node {
		public long value;
		public Node next;

		public Node(long value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	public boolean offer(long element) {
		Node tmp = tail;
		tail = new Node(element, null);
		if (isEmpty()) {
			head = tail;
		} else {
			tmp.next = tail;
		}
		size++;
		return true;
	}

	public long poll() {
		if (!isEmpty()) {
			long out = head.value;
			head = head.next;
			size--;
			return out;
		} else {
			throw new NoSuchElementException("Empty");
		}
	}

	public long peek() {
		return head.value;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void clear() {
		head=null;
		tail=null;
		size=0;
	}

	public boolean add(long element) {
		return offer(element);
	}

    public boolean remove(long element){
    Node tmp=head;
    if(head.value == element){
       	head=head.next;
    	size--;
    	return true;
    }else{
    	Node next=head.next;
    	for(; next.next!=null;tmp=tmp.next){
    		next = tmp.next;
    		if(next.value==element){
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
        	if(tmp.value==element){
        		return true;
          	}
            tmp=tmp.next;
        }
    	return false;
    }
}