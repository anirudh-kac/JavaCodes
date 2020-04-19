
public class ThrowsExample {
	
	static void throwing() throws IllegalAccessException {
		//Throwing a chcecked exception
		throw new IllegalAccessException("Raised by throwing method");
		//Since the above exception isn't being handled by the method, a throws clause has been added
	}
	
	public static void main(String args[]) {
		//throwing(); will cause error because the exception thrown isn't being handed
		
		try {
			throwing();
		}catch(IllegalAccessException e) {
			System.out.println("Exception handled in main");
		}
	}
}
