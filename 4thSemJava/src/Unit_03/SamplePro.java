package Unit_03;

public class SamplePro {

	public static void main(String[] args) {
		
		
		try {
		
			int a = 100/0;
			System.out.println(a);
			
		}
		
		catch(IndexOutOfBoundsException e) {
			System.out.println("Handled");
			
		}
		
		catch(Exception e) {
			System.out.println("Handled"); 
		}
	}
		
	//	finally {
	//		System.out.println("The try catch is finished ");
	//	}
} 
		
