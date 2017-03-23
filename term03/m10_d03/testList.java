package term03.m10_d03;


public class testList {
	public static void main(String[] args){
		IntegerStackListImpl stack = new IntegerStackListImpl();
		
		System.out.println(stack.push(0));
		System.out.println(stack.push(1));
		System.out.println(stack.push(2));
		System.out.println(stack.push(3));
		System.out.println(stack.remove(1));
		System.out.println(stack.remove(2));
		System.out.println(stack.remove(3));
		System.out.println(stack.peek());
		
		System.out.println(stack.size());
}
}