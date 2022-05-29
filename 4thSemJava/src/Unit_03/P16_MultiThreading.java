package Unit_03;

import java.util.Scanner;

/*
 * multi-processing->one by one say to process every process...program in running state
 * -sequential multiprocessing-> one by one ..only when one process is done then 2nd is processed
 * -parallel multiprocessing->side by side ...one cpu for each process....more the core more r processing unit
 * -concurrent multiprocessing(in hands of OS)->context switch to any process randomly....if a process is taking time then we leave it nd 
 * proceed to next(burst time-3ms)
 * 
 * multi-tasking
 * -sequential tasking->if task is bound and following the sequence
 * -parallel tasking->not possible
 * -concurrent tasking->in the hands of user+JVM
 * 
 * individual tasks are written in individual threads which is known as multi-threading
 * parallel processing is best but its expensive 
 * JVM will do the context switch and decide whether code will execute or not
 *  
 * CPU(control of the processing units)->processing units(management by OS, like priority)->program counter(holds address of next 
 * instruction)
 * process initiation is in user's hand i.e. assigns work load
 * OS manages the work load given by user
 * yo
 */
public class P16_MultiThreading {
	public static void main(String args[]) {
		//Thread obj = new Thread();
		//C1 obj = new C1();
		//C2 obj1 = new C2();
		//obj.show1();
		//obj1.show2();
		
		Thread t1 =new Thread(new T1(),"T1");
		Thread t2= new Thread(new T2(), "T2");
		Thread t3 = new Thread(new T3(),"T3");
		t1.start();
		t2.start();
		t3.start();
		
		//obj.threadConcept();
		//obj.threadSynchronization();
		//obj.interThreadCommunication();
		//obj.ProducerConsumerProblems();
		//obj.Wait_And_Notify();
	}

}

class C1{
	void show1() {
		Scanner obj=new Scanner (System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("done with show1()!");
		obj.close();
		
	}
}

class T1 extends Thread{
	@Override
	public void run() {
		Scanner obj=new Scanner (System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("done with show1()!");
		obj.close();
		
	}
}
class C2{
	void show2() {
		for(int i=0;i<10;i++) {
			System.out.println(i+ "-Hey_2!");
		}
	}
}

class T2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+ "-Hey_2!");
	}
	}	
}

class T3 implements Runnable{
	@Override
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+ "-Hey_3!");
			//System.out.println (Thread.currentThread().getName());//gives name of the thread
	}
}
}