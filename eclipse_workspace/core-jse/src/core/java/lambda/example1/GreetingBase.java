package core.java.lambda.example1;

public class GreetingBase {

	//Tightly coupled
	public void convayGreetings(String message) {
		System.out.println(message);
	}
	
	//Loosely coupled - By injecting Greetings interface
	public void conveyMessage(String message, Greetings greetings) {
		greetings.sendGreetings(message);
	}
}
