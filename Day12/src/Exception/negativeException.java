package Exception;

public class negativeException extends Exception{
	
	public negativeException(String string)
	{
		super(string);
	}
	public negativeException()
	{
		super("per show not be negative");
	}

	
}
