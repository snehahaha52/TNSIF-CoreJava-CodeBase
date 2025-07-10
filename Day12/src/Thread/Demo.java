package Thread;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThreadLifecycleDemo myThread = new ThreadLifecycleDemo();
        System.out.println("before Runnable state threda is alive"+myThread.isAlive());
	
	try {
		sleep(500);
	}
	catch(InterruptedException e) {
		System.err.println("thread interrupted....");
	}
	
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
}
