package threads;

public class MainThread {

	public static void main(String[] args) {
		Thread t  =Thread.currentThread();
		System.out.println("Main thread"+t);
		t.setName("Anirudh's Thread");
		System.out.println("Main thread"+t);
		
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(i);
				t.sleep(1000);
			}
			
		}catch(InterruptedException e) {
			System.out.println(e);
		}

	}

}
