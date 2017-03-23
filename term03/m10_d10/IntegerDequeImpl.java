package term03.m10_d10;

import java.util.NoSuchElementException;

import term03.integerCollections.IntegerDeque;

/**
 * Структура данных "дек", хранящая целые числа (реализация на списке).
 * (http://docs.oracle.com/javase/6/docs/api/java/util/Deque.html)
 */
public class IntegerDequeImpl extends IntegerQueueImpl implements IntegerDeque {

	IntegerQueueImpl queue = new IntegerQueueImpl();

	private DequeNode head, tail;

	private class DequeNode extends Node {
		public Node prev;

		public DequeNode(long value, Node next, Node prev) {
			super(value, next);
			this.prev = prev;
		}
	}

	public boolean offerFirst(long element) {
		if (size == 0) {
			head = new DequeNode(element, null, null);
			tail = head;
		} else {
			DequeNode tmp = head;
			head = new DequeNode(element, tmp, null);
			tmp.prev = head;
		}
		size++;
		return true;
	}

	public long pollFirst() {
		return queue.poll();
	}

	public long peekFirst() {
		return queue.peek();
	}

	public boolean offerLast(long element) {
		return queue.offer(element);
	}

	@Override
	public long pollLast() {
		if (!isEmpty()) {
			long out = tail.value;
			tail = (DequeNode) tail.next;
			size--;
			return out;
		} else {
			throw new NoSuchElementException("Empty");
		}
	}

	@Override
	public long peekLast() {
		return tail.value; 
	}
}