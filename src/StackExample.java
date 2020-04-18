import java.util.*;

class Stack{
	
	int maxSize;
	int stack[];
	int top;
	
	
	Stack(int size){
		top = -1;
		maxSize = size;
		stack = new int[maxSize];
	}
	
	void push(int item) {
		if(!overflow())
			stack[++top]  = item;
		else
			System.out.println("Stack Overflow!");
	}
	
	int pop() {
		if(!underflow())
			return stack[top--];
		else {
			System.out.println("Stack Underflow");
			return -1;
		}
	}

	
	boolean overflow() {
		if(top == maxSize  -1) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean underflow() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	void display() {
		for (int i =0 ;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}
	
	
}




public class StackExample {
	public static void main(String args[]) {
		System.out.println("Stack Operations");
		Stack mystack = new Stack(10);
		
		// Pushing items onto Stack
		
		for(int i = 0 ; i < 12 ;i++) {
			mystack.push(i*100);
			//System.out.println("Pushed " + i*100);
		}
		
		mystack.display();
		
		//Popping Items
		for(int i =0 ;i<13;i++) {
			System.out.println("Popped element is "+ mystack.pop());
		}
	}
}
