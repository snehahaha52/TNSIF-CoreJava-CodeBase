package Thread;

public class ThreadMethodDemo {
            ChildThread t1=new ChildThread(5,"first");
            
            ChildThread t2=new ChildThread(10,"second");
            
            t1.start();
            t2.start();
            
            Thrad.currentThread().setName("parent thread");
            Thrad.currentThread().setPriority(Thread.MIN_PRIORITY);
            
            System.out.println("current thread"+thread.currentThread);
            try {
            	t1.join();
            	t2.join();
            }
            catch(InterruptedException e)
            {
            	Thread.currentThread().interrupt();
            	System.err.println("thread interrupted"+e.getMessage());
            }
            System.out.println("end of the program");
            
}
}
