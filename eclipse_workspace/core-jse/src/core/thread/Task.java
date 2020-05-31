package core.thread;

public class Task implements Runnable{
	public void run()
	{
		System.out.println("I am from run!");
		go();
	}
	
	public void go()
	{
		System.out.println("I am from go!");
	}
}
