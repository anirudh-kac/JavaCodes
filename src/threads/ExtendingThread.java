package threads;

class MeraThread extends Thread{
	public void run() {
		try {
			for(int i =0 ;i<5;i++) {
				System.out.println(i);
				Thread.sleep(500);
			}
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

public class ExtendingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeraThread t = new MeraThread();
		t.start();
		
		try {
			for(int j = 0 ;j<=50;j+=10) {
				System.out.println(j);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
