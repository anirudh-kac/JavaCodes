package innnterfaces;


interface switches{
	void turnOn();
	void turnOff();
	
	//we can also specify shared constsnts
	int time = 8;
	int temp = 35;
}

class Lights implements switches{
	//Methods that implement an interface must be made public
	public void turnOn() {
		System.out.println("Lights All Around");
	}
	
	public void turnOff() {
		System.out.println("Andhera hi Andhera. Raat ke "+ time + "baje");
	}
}

class Fan implements switches{
	public void turnOn() {
		System.out.println("Its " + temp + "degrees, We needed the fan");
	}
	
	public void turnOff() {
		System.out.println("Dont turn off the fan, Its only"+time);
	}
}
	
public class SimpleInterface {
		
	public static void main(String[] args) {
		Lights l = new Lights();
		Fan f = new Fan();
		l.turnOn();
		l.turnOff();
		f.turnOn();
		f.turnOff();
	}

}
