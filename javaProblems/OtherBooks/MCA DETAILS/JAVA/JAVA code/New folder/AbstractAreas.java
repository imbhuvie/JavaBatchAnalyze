// Using abstract methods and classes.
abstract class Figure
{
	  double dim1;
	  double dim2;
	  Figure(double a, double b)
	  {
		dim1 = a;
		dim2 = b;
	  }
	  // area is now an an abstract method
	  abstract double area();
}
class Rectangle extends Figure
{
	  Rectangle(double a, double b)
	  {
		super(a, b);
	  }
	  // override area for rectangle
	  double area()
	  {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	  }
}
class Triangle extends Figure
{
	  Triangle(double a, double b)
	  {
		super(a, b);
	  }
	  // override area for right triangle
	  double area()
	  {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	  }
}
class AbstractAreas
{
	  public static void main(String args[])
	  {

	  // Figure f = new Figure(10, 10); // illegal now

		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);

		Figure figref; // this is OK, no object is created

		figref = r;
		System.out.println("Area is " + figref.area());
		figref = t;
		System.out.println("Area is " + figref.area());
		}
  }
  class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
		System.out.print("Animal name : "+this.name);
        // System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    private String breed;
    public Dog(String name, String breed) {
        super(name); // calling the constructor of the superclass
        this.breed = breed;
    }
    public void makeSound() {
        super.makeSound(); // calling the makeSound() method of the superclass
        System.out.println("Dog barks");
	}
}
class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Labrador");
        dog.makeSound();
    }
}
