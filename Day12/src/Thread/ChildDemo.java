package Thread;

public class ChildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChildThread c= new ChildThread(10,"hello");
        c.start();
        ChildThread c1= new ChildThread(5,"sneha");
        c1.start();
        System.out.println("end of the program");
	}

}
