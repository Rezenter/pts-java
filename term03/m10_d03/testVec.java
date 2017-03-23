package term03.m10_d03;

public class testVec {
	public static void main(String[] args){
	
	IntegerStackArrayImpl stack = new IntegerStackArrayImpl();
	System.out.println(stack.isEmpty());
	System.out.println(stack.push(1));
	System.out.println(stack.peek());
	System.out.println(stack.add(2));
	System.out.println(stack.push(3));
	System.out.println(stack.pop());
	System.out.println(stack.peek());
	System.out.println(stack.isEmpty());
	System.out.println(stack.contains(2));
	System.out.println(stack.contains(1));
	stack.clear();
	System.out.println(stack.contains(2));
	System.out.println(stack.isEmpty());
}
}
