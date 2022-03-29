package threadBasicRunner;

class Task1 extends Thread {
	public void run() {
		System.out.println("Task1 Started ");
		for(int i=101; i<=199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 complete");
	}	
}

public class ThreadBasicsRunner {
	public static void main(String[] args) {

		
		Task1 task1 = new Task1();
		task1.start();

		for(int i=200; i<=300; i++) {
			System.out.print(i + " ");
		}
		
		
		System.out.println("\nTask2  complete");

		for(int i=300; i<=400; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 complete");
		System.out.println("\nMain complete");
	}	
}
