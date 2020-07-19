package core.java.lambda.example1;

public class SmsGreetings implements Greetings {

	@Override
	public void sendGreetings(String message) {
		System.out.println(message);
	}

}
