package Assignment_01;
import java.util.Scanner;


public class Ques_10 {
	public static void main(String[] args) {
		City arr[]=new City[4];
		
		Scanner obj= new Scanner(System.in);
		String a;
		int b,c,d,e;
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the name of the city");
			a=obj.nextLine();
			
			System.out.println("Enter no of Maruti-K10, Zen-Astelo, WagonR and Maruti-SX4");
			b=obj.nextInt();
			c=obj.nextInt();
			d=obj.nextInt();
			e=obj.nextInt();
			
			obj.nextLine();
			
			arr[i]= new City(a,b,c,d,e);
		}
		//reusing variables as number of cars sold in total
		b=c=d=e=0;

		for(int i=0;i<4;i++)
		{
			b+=arr[i].maruti_k10;
			c+=arr[i].zen_astelo;
			d+=arr[i].wagnor;
			e+=arr[i].maruti_sx4;
		}
		System.out.println("No of Maruti-K10 :\t"+b);
		System.out.println("No of Zen-Astelo :\t"+c);
		System.out.println("No of WagonR :\t\t"+d);
		System.out.println("No of MarutI_SX4 :\t"+e);		
		obj.close();
	}
}

class City{
	String city_name;
	int maruti_k10;
	int zen_astelo;
	int wagnor;
	int maruti_sx4;
	 
	City(String city_name,int maruti_k10,int zen_astelo,int wagnor,int maruti_sx4)
	{
		this.city_name = city_name;
		this.maruti_k10 = maruti_k10;
		this.zen_astelo = zen_astelo;
		this.wagnor = wagnor;
		this.maruti_sx4 = maruti_sx4;
	}
}