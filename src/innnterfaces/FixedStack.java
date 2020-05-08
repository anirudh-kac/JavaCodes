package innnterfaces;


//StackInt.java contains a public interface
class Stack implements StackInt{
	public void push(int i) {
		System.out.println("Assume we pushed " + i);
	}
	
	public int pop() {
		return 10;
	}
}
public class FixedStack {
	public static void main (String args[]) {
		Stack stacks10 = new Stack();
		stacks10.push(100);
		stacks10.push(200);
		
	}

}

