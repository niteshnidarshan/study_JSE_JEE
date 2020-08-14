package core.java.lambda.example1;

public class Application {


	public void instanceMethod(String str) {
		System.out.println("I am from default method : "+str);
	}
	public static void staticMethod(String str) {
		System.out.println("I am from static method : "+str);
	}
	
	public static void main(String[] args) {
		
		//Tightly coupled
		GreetingBase app = new GreetingBase();
		app.convayGreetings("Jai Ram G ki");
		
		//Classical approach of loosely coupled solution
		Greetings emailGreetings = new EmailGreetings();
		Greetings smsGreetings = new SmsGreetings();
		app.conveyMessage("Jai Ram G ki from email!", emailGreetings);
		app.conveyMessage("Jai Ram G ki from sms!", smsGreetings);

		//By overriding anonymous class implementation of Greetings interface
		app.conveyMessage("Jai Ram G ki from anonymous implementatiion!", new Greetings() {
			
			@Override
			public void sendGreetings(String message) {
				System.out.println(message);
			}
		});
		
		
		//FunctionalType ~ functional interface - Without creating any object 
		Greetings greeting = (message) -> System.out.println(message);
		greeting.sendGreetings("Jai Ram G ki from functional interface with lambda!");
		
		app.conveyMessage("Jai Ram G ki by calling Base class method!", greeting);
		
		//It can be written also like (In one line)
		app.conveyMessage("Jai Ram G ki!", message -> System.out.println(message));
		
		
		
		//Variance  of using lambda with one parameter
		Greetings greeting1 = message -> System.out.println(message);
		Greetings greeting2 = (message) -> System.out.println(message);
		Greetings greeting3 = (message) -> {System.out.println(message);}; //Curly parenthesis are optional here.
		Greetings greeting4 = (message) -> {
			//If multi line of implementation
			System.out.println(message); 
			
		}; 
		
		
		
		// :: operator
		/*
		
		Method reference in Java 8 is the ability to use a method as an argument for a matching functional interface.
		:: (double colon) is the operator used for method reference in Java. 
		An interface with only one method is called a functional interface. 
		For example, Comparable, Runnable, AutoCloseable are some functional interfaces in Java.
		:: is used for method referencing and not for scope resolution.
		Syntax: <classname or instancename>::<methodname>
		
		e.g.
		numbers.forEach(x -> System.out.println(x));
		Here, you don't actually need the name x in order to invoke println for each of the elements. 
		That's where the method reference is helpful - the :: operator denotes you will be invoking 
		the println method with a parameter, which name you don't specify explicitly:
		
		numbers.forEach(System.out::println);
		
		*/
		
		Greetings instanceGreet = new Application() :: instanceMethod;
		
		Greetings staticGreet = Application :: staticMethod;
		
		app.conveyMessage("Jai Ram G Ki from local instance method ", instanceGreet);
		app.conveyMessage("Jai Ram G Ki from local static method ", staticGreet);
		
		app.conveyMessage("Jai Ram g ki from randomly!", System.out :: println);
		
	}

}
