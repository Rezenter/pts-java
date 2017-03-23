package term03.m10_d10;

import java.util.NoSuchElementException;



public class TesterQ {
	public static void main(String[] args){
		IntegerQueueImpl queue = new IntegerQueueImpl();
		
		System.out.println(queue.offer(1));
		System.out.println(queue.offer(2));
		System.out.println(queue.offer(3));
		System.out.println(queue.offer(4));
		System.out.println(queue.offer(5));
		System.out.println(queue.remove(2));
		System.out.println(queue.remove(1));
		System.out.println(queue.remove(6));
		System.out.println(queue.remove(4));
		
		
		
		System.out.println(queue.poll());
		
			System.out.println(queue.peek());
		
		try{
			System.out.println(queue.poll());
		
			System.out.println(queue.poll());
			}
			catch(NoSuchElementException e){
				System.out.println("свободная касса");
			}
		
		
}
}
