
public class TryCatch {
	
	public static void main(String args[]) {
		int a =10;
		int b = 0;
		//The commented code will raise ArithmeticException
//		int c = a/b;
//		System.out.println(" Value of C is"  + c);
		
		// Handling Exception using try catch block
		
		try {
			int c = a/b;
			System.out.println(" Value of C is"  + c);		
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Inside Catch Block");
		}
	}
}
