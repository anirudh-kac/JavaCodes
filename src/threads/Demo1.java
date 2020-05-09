package threads;

//implemening Runnable
class Implementing1 implements Runnable{
	public void run() {
		for(int i = 0;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a new thread , pass an instance of the implementing class
		Thread t = new Thread(new Implementing1(),"Demo1");
		t.start();
		
		//main thread 
		try {
			for(int j=0;j<50;j+=10) {
				System.out.println(j);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}

