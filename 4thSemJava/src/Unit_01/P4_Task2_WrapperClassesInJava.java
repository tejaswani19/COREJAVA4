package Unit_01;

/*the wrapper class in java provides the mechanism to convert primitive into object and object to primitive
 * why?
 * becuz we want to use predefined methods of those objects
 * -boolean data types ->boolean obj; ->obj.toString();
 *  
 */
public class P4_Task2_WrapperClassesInJava {
	public static void main(String[] args) {
		//converting int into integer
		int a=20;
		
		String s = "" + a + "";
		
		Integer i=Integer.valueOf(a);//converting int into integer explicitly
		Integer j=a;//autoboxing,now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+" "+i+" "+j);
		System.out.println(i.toString());
		//a.toString() can not be done due to a is not object
		//Autoboxing: Converting primitives into objects
		byte b=10;
		Byte byteobj=b;
		System.out.println(byteobj);
		
		//unboxing:converting objects to primitives
		byte bytevalue= byteobj;
		System.out.println(bytevalue);
	}

}