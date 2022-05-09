package Unit_02;

/*
 * abstract class:
 * -an abstract class must be declared with an abstract keyword.
 * 
 * -abstraction is a process of hiding the implementation details and showing only functionality[function declaration] to the user.
 * -cannot make object of abstract class directly, but through derived class[cannot be insta
 * 
 * -example of abstract method?
 * -abstract class may contain abstract and non-abstract methods
 * -(0-100%) abstarct methods can be there!
 * 
 * in case of interface: 100% abstract methods should be there!
 * 
 * final class:
 * -the main purpose of using a class being declared as final is to prevent the class from being 
 *  -if a class is marked as final then no class can inherit any feature from the final class
 *  -you cannot extend a final class. if u try it gives you a compile time error.
 *  
 */

abstract class Bike{
	int a;
	Bike(){
		System.out.println("Inside Bike Constructor: " +a+ "\n");
	}
	abstract void run();  //abstract method()!  90-100%)
	
	void display() {
		System.out.println("this is display method!");
		
	}
}

class Honda4 extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class P09_Task_01_AbstractAndFinalClassInJava {
    public static void main(String[] args) {
    	Bike obj= new Honda4();
    	//obj.run();
    	obj.display();
    	
    	//cannot be instantiated
    	//Bike obj2= new Bike();
    }
}
//final class
final class Super{
	public int data=30;
	void display() {
		System.out.println(data);
	}
}

/*  public class Sub extends Super{
  
   void display2(){
   display();
}
}*/