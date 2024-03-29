package core.thread;

import java.util.concurrent.TimeUnit;
/**
 * Daemon Thread 		- 	Background thread for task such as Garbage Collector(gc)
 * Non Daemon Thread 	- 	Created within application
 * 							main thread - created by JVM to run main() - In java always one thread exists i.e. main thread
 * JVM will not be terminated if at least one non-daemon thread is running. 
 * 
 * 
 * @author niteshnidarshan
 *
 */
public class MyFirstThread {

	public static void main(String[] args) { //main thread
		Task task = new Task();
		Thread thread = new Thread(task);//Another thread - New state
		thread.start();//run() completely executed successfully - Now it is in Dead state
		thread.start();//throws IllegalThreadStateException because now we are invoking a dead state thread
		try{
			Thread.sleep(1000);//sleeps main() thread
			TimeUnit.SECONDS.sleep(3);// Another way to sleep
		}catch(Exception e){}
		System.out.println("I am from main!");
	}

}
/**Program Result**
I am from main!
I am from run!
I am from go!
*/