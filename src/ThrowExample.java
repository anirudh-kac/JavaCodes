
public class ThrowExample {
	
	static void throwingMethod() {
		
		// A thrown exception must be handled or a throws clause must be added
		try {
			throw new Exception("Thrown Exception");
		}catch(Exception e) {
			System.out.println("Catching Exception");
		}
		
	}
	
	public static void main(String args[]) {
		try {
			throwingMethod();
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
}
