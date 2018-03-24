package co.edureka.threads;

/*class Task{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("**Task** "+i);
		}
	}
}*/

// Task is a Thread now
class MyTask extends Thread{
	public void run(){ // Jobs of a child thread should be mentioned in run method
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000); // 1sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println("**MyTask** "+i);
		}
	}
}

class YourTask extends Thread{
	
	public void run(){ // Jobs of a child thread should be mentioned in run method
		
		//MyTask mRef = new MyTask();
		//mRef.start();
		
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000); // 1sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("@@YourTask@@ "+i);
		}
	}
}

class A{
	
}

//class OurTask extends A,Thread{ // err, Multiple Inheritance Not Supported
class OurTask extends A implements Runnable{
	
	public void run(){ // Jobs of a child thread should be mentioned in run method
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000); // 1sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("##OurTask## "+i);
		}
	}
	
}


public class ThreadsDemo {

	public static void main(String[] args) {
		System.out.println("--Main Started--"); // J1
		
		//Task tRef = new Task();
		//tRef.executeTask();
		
		MyTask mtRef = new MyTask();
		YourTask ytRef = new YourTask();
		
		Runnable r = new OurTask(); // Shape s = new Circle(); | RTP
		Thread otRef = new Thread(r);
				
		
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); //5
		mtRef.setPriority(Thread.MIN_PRIORITY); // 1
		otRef.setPriority(Thread.MAX_PRIORITY); // 10
		ytRef.setPriority(Thread.NORM_PRIORITY); // 5
		
		mtRef.start(); // start method will execute run method of Thread internally
		try {
			mtRef.join(); // Immediatley after start method call join method
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ytRef.start();
		ytRef.yield();
		
		otRef.start();
		
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000); // 1sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("==Main Thread== "+i);
		}
		
		
		mtRef.setName("John");
		otRef.setName("Jennie");
		ytRef.setName("Jim");
		Thread.currentThread().setName("Harry");
		
		System.out.println("MyTask Name is: "+mtRef.getName()+" Priority: "+mtRef.getPriority());
		System.out.println("YourTask Name is: "+ytRef.getName()+" Priority: "+ytRef.getPriority());
		System.out.println("OurTask Name is: "+otRef.getName()+" Priority: "+otRef.getPriority());
		System.out.println("Main Name is: "+Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());
		
		System.out.println("--Main Finished--"); // Jn
		
		System.out.println("mtRef state is: "+mtRef.getState());
	}

}
