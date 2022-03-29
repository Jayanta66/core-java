package exceptionhandling.thread;

public class Threadd {

	public static void main(String[] args) throws InterruptedException, MyThreadExeption {

		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {
			throw new MyThreadExeption("My Thread Exception");
		}
	}

}
