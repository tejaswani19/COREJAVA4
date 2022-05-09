package Unit_01;

public class P5_Task2_MethodsInJava {
	
	public static void main(String[] args) {
		ABC3 obj = new ABC3();
		
		//Calling display method definition
		obj.display2();
		System.out.println(ABC3.a);
		
	}
}

class ABC3 {
	
	static int a = 10;
	
	/* Actual method definition
	 
	   Datatype methodNmae(DataType2 p1, DataType2 p2){
	   
	   methodBody;
	   
	   return value // if required
	   
	   }
	   
	 */
	static void display() {
		
		int b = 10;
		int a = 10;
		System.out.println(b);
		System.out.println(a);
		
	}
	
	int display2() {
		
		System.out.println(a);
		//As a was a local variable so we can't access it outside the method
		//System.out.println(b);
		
		return a;
		
	}
}