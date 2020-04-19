
public class MultipleCatch {
	
	
	public static void main(String args[]) {
		
		int a =1;
		// a =1 for ArithmeticException , 2 for ArrayIndexOutOfBoundsException
		//Creating Dummy Exceptions to show multiple catch
		
		try{
			
			if(a==1) {
				//This will throw an ArithmeticException if executed
				int x = 25/0;
			}
			if(a==2) {
				int[] c = {1};
				//This will throw an ArrayIndexOutOfBoundsException
				c[20] = 200;
				}
		}catch(ArithmeticException e) {
			//Handle Arithmetic
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			//Handle Out of bounds
			System.out.println(e);
		}
	}
	
}
