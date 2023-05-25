package java8feature;

public class ThreadWIthLambda
{
	public static void main(String[] args)
	{
		Runnable rn = () -> {
			System.out.println("Thread is running..");
		};
		Thread thread = new Thread(rn);
		thread.start();
	}
}
