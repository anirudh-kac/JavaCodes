
public class NestedTry {
	
	public static void main(String args[]) {
		try {
			//Inside Try
			try {
				int a = 5/0;
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}catch(Exception e) {
			System.out.println("Caught By Outer Exception");
		}
	}
}
