

//Using an abstract class figure

abstract class Figure{
	
	// two member variables
	double dimension1;
	double dimension2;
	
	// methods to be implemented by subclasses
	abstract double area();
	abstract double perimeter();
	
	//concrete method
	
	void show() {
		System.out.println("The dimension are : " + dimension1 + " " + dimension2);
	}
	
	//Constructor
	
	Figure(double d1 , double d2){
		dimension1 = d1;
		dimension2 = d2;
	}
	
}

class Rectangle extends Figure{
	//All abstract methods of Figure must be implemented or the class should be made abstract
	
	Rectangle(double length,double breadth){
		super(length,breadth);
	}
	
	double area() {
		return dimension1*dimension2;
	}
	
	double perimeter() {
		return 2*(dimension1 + dimension2);
	}
}


public class AbstractClasses {
	
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(20,30);
		System.out.println("The area of rectangle is " + r1.area());
		System.out.println("The perimenter of rectangle is " + r1.perimeter());
	}
	
	

}
