package Synchronization;

public class UsingRunnable implements Runnable {
             Thread t;
             int end,start;
             String msg;
             
             //para
			 public UsingRunnable(int end, int start, String msg) {
				super();
				this.t = t;
				this.end = end;
				this.start = start;
				this.msg = msg;
			 }
             
             public void run() {
            	 for(int i=end;i>start;i--) {
            		 try {
            			 Thread.sleep(500);
            		 }
            		 catch(InterruptedException e)
            		 {
            			 System.err.println(i+msg);
            		 }
            	 }
             }
}
