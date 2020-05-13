package threads;

import java.util.Random;


class Data{
	int num;
	int squared;
	double cube;
	boolean nextNumGenerated = false;
}

class randGen implements Runnable{
	Data d;
	randGen(Data d){
		Thread t = new Thread(this,"Random Generator");
		t.start();
		this.d =d;
	}
	
	public void run() {
		Random r = new Random();
		d.num = r.nextInt(42);
		
		while(d.nextNumGenerated) {
			try {
				wait();
			}catch(Exception e) {
				System.out.println("Interrupt");
			}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.num = r.nextInt();
		d.nextNumGenerated = true;
		notify();
	}
}

class Squaring implements Runnable{
	Data d;
	Squaring(Data d){
		Thread t = new Thread(this,"Square");
		this.d=d;
		t.start();
	}
	public void run() {
		while(!d.nextNumGenerated) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(d.num*d.num);
		notify();
	}
}

class Cubing implements Runnable{
	Data d;
	Cubing(Data d){
		Thread t = new Thread(this,"Cube");
		this.d=d;
		t.start();
	}
	public void run() {
		d.cube = Math.pow(d.num, 3);
	}
}

public class ThreadCalc {

	public static void main(String[] args) {
		
		Data d = new Data();
		randGen r  = new randGen(d);
		Squaring sq = new Squaring(d);
		Cubing c = new Cubing(d);
//		System.out.println(d.num);
//		System.out.println(d.squared);
//		System.out.println(d.cube);

	}

}
