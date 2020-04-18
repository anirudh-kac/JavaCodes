import java.util.*;
// Box and Colored box show first use of super
class Box{
	private double length;
	private double width;
	private double height;
	
	// Default constructor
	
	Box(){
		length = width = height = -1;
	}
	
	//Parameterized constructor
	
	Box(double l , double w , double h){
		length = l;
		width = w;
		height = h;
	}
	
	//Copy Constructor
	
	Box(Box bo){
		length = bo.length;
		width = bo.width;
		height = bo.height;
	}
	
	//Volume method
	
	double volume() {
		return length*width*height;
	}
	
	
}


class ColoredBox extends Box {
	private String color;
	
	//Default constructor
	
	ColoredBox(){
		super();
		color = "White";
	}
	
	// Parameterized  constructor
	ColoredBox(double l , double w , double h , String col){
		super(l,w,h);
		color = col;
	}
	
	//PAssing an object
	
	ColoredBox(ColoredBox cb){
		super(cb);
		color = cb.color;
	}
}


// Class A and B show another use of super 

class A1{
	int i;
}

class B1 extends A1{
	int i ; // this leads to hiding of i in A
	
	B1(int a , int b){
		super.i = a;
		i = b;
	}
	
	void show() {
		System.out.println("The values are : " +super.i + " " + i);
	}
}
public class usingSuper {
	
	public static void main(String args[]) {
		
		// First use
		Box b1 = new Box(2,4,3);
		System.out.println("Volume of the box b1 is" + b1.volume());
		
		ColoredBox bcol  = new ColoredBox(10,2,3,"Yellow");
		System.out.println("Volume of the colored box  is" + bcol.volume());
		
		
		//Second use
		
		B1 objB = new B1(10,20);
		objB.show();
		
		
		
	}
}
