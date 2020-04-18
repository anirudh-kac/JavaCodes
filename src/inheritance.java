class A{
	int  i ;
	int j;
	void showij() {
		System.out.println("The value of i and j is :" + i + " " + j);
	}
}


class B extends A{
	int k;
	void showijk() {
		System.out.println("The value of i  , and k is :" + i + " " + j + " " + k);
	}
}

public class inheritance {
	public static void main(String args[]) {
		//Declaring two objects of classes A and B
		A objA = new A();
		B objB = new B();
		// Setting Values of A
		objA.i = 10;
		objA.j = 20;
		// Setting values of B
		objB.i =100;
		objB.j = 200;
		objB.k = 300;
		
		// Calling method of A
		objA.showij();
		// Calling methods of B
		objB.showij();
		objB.showijk();
		
		// Superclass reference to subclass
		A a = objB;
		a.i = 1000;
		a.j = 2000;
		// a.k can't be accessed
		a.showij();
		//a . showijk cant be accessed

	}
}
