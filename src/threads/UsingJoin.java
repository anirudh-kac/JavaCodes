package threads;


class MThread implements Runnable{
	Thread t;
	public void run() {
		System.out.println("BAJBJKHJ");
	}
	
	MThread(String name){
		t = new Thread(this,name);
		t.start();
	}
}
public class UsingJoin {

	public static void main(String[] args) {
		MThread m1 = new MThread("One");
		MThread m2 = new MThread("Two");
		
		
		try {
			m1.t.join();
			m2.t.join();
			System.out.println(m1.t.isAlive());
			System.out.println(m2.t.isAlive());
			System.out.println(Thread.currentThread().isAlive());
			System.out.println("Main Thread !!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
