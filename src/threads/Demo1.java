package threads;

//implemening Runnable
class Implementing1 implements Runnable{
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println(i);
		}
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a neew thread , pass an instance of the implementing class
		Thread t = new Thread(new Implementing1(),"Demo1");
		t.start();
		

	}

}

