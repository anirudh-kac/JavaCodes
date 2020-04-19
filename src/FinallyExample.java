
public class FinallyExample {
	
	public static void main(String args[]) {
		
		try {
			int a = 100/0;
			//This causes an exception when denominaltor is 0
			System.out.println("Value is" + a);
		} catch(Exception e) {
			System.out.println(e);
		}finally {
			//This code will be executed irrespective of if an exception is raised or not
			System.out.println("Division Process Ended");
			
		}
	}
}
