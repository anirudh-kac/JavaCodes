package threads;

class MyThread implements Runnable{
	//run
	public void run() {
		System.out.println("HElloooaoaos");
	}
	
	//we create a thread object from inside the class 
	
	//constructor
	MyThread(){
		//pass the current instance using this
		Thread t = new Thread(this,"Hello Thread");
		System.out.println("Thread : "+t);
		t.start();
		
	}
}

public class ImplementingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread AnirudhsThread = new MyThread();

	}

}
