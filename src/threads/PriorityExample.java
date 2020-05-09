package threads;

class counter implements Runnable{
	Thread t;
	long count = 0;
	public volatile boolean running = true;
	
	counter(int p){
		t = new Thread(this,"Clicker");
		t.setPriority(p);
		t.start();
	}
	
	public void run() {
		while(running) {
			count++;
		}
	}
	
	public void stop() {
		running  =false;
	}
}
public class PriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		counter cLow = new counter(Thread.MIN_PRIORITY);
		counter cHigh = new counter(Thread.MAX_PRIORITY);
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		cLow.stop();
		cHigh.stop();
		
		try {
			cLow.t.join();
			cHigh.t.join();
			System.out.println("Low counts : " + cLow.count);
			System.out.println("High counts : " + cHigh.count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
