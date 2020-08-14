package core.java.lambda.example3;

public class LambdaWithRunnable {
 
	public static void main(String[] args) {
		
		//With Runnable reference
		Runnable runnable = () -> { 
		    
			//logic of run starts
			for(int i = 0; i<3; i++) {
		    	System.out.println("Jai Ram G ki -- From Runnable reference.");
		    	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
			//logic of run ends
		};
		Thread t = new Thread(runnable);
		t.start();
		
		
		//Without Runnable reference
		Thread t1 = new Thread(() -> {
			//logic of run starts
			for(int i = 0; i<3; i++) {
		    	System.out.println("Jai Ram G ki From No Runnable reference.");
		    	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
			//logic of run ends
		});
		t1.start();
		
		//without an references
		new Thread(() -> {
			//logic of run starts
			for(int i = 0; i<3; i++) {
		    	System.out.println("Jai Ram G ki From No reference.");
		    	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
			//logic of run ends
		}).start();
		

	}

}
