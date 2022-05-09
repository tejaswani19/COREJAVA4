package Unit_01;

import java.util.Scanner;

/*when user takes input from the console!
 * nextLine()           read user input [to read strings]
 * next()               read next token from the input entered by the user
 * 
 * nextBoolean()        reads a boolean value from the user
 * nextByte()           reads a byte from the user
 * nextDouble()         reads a double value from the user
 * nextFloat()          reads a float value from the user
 * nextInt()            reads a int value from the user 
 * nextLine()           reads the string value from the user
 * nextLong()           reads a long value from the user
 * nextShort()          reads a short value from the user
 */
public class P4_Task3_ScannerClassInJava {
	
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);  //create a scanner object
		Scanner myObj2 = new Scanner(System.in);
		
		//read the 1st token: (_ space bar)
		String firstName = myObj1.next();
		System.out.println("Name is: "+ firstName + "\n");
		
		String name = myObj2.nextLine();  //(\n)
        String name2 = myObj2.nextLine();   //(\n)
        System.out.println("Name is: " + name + "\n");
        System.out.println("name is: "+ name2 + "\n");
        
        boolean b=myObj2.nextBoolean();
        System.out.println(b + "\n");
        myObj1.close();
        myObj2.close();
     }
}