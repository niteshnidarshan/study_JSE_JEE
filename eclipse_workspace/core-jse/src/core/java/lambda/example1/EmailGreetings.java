package core.java.lambda.example1;

public class EmailGreetings implements Greetings{

	@Override
	public void sendGreetings(String message) {
		System.out.println(message);
	}

}
