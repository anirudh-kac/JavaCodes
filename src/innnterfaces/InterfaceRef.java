package innnterfaces;

interface behaves{
	void helloes();
}

class obbb implements behaves{
	public void helloes() {
		System.out.println("Hellllooooo");
	}
}

public class InterfaceRef {
	public static void main(String args[]) {
		behaves o =new obbb();
		o.helloes();
	}

}
