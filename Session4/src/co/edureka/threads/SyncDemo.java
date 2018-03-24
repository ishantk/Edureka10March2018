package co.edureka.threads;

// Singleton - Only One Object for a class
class Printer{
	
	private static Printer pRef = new Printer(); 
	
	private Printer(){
		
	}
	
	static Printer getPrinter(){
		return pRef;
	}
	
	//synchronized void printDocuments(String eName, int num){
	void printDocuments(String eName, int num){
		for(int i=1;i<=num;i++){
			System.out.println("Printing Document for "+eName+" Document #"+i);
		}
	}
	
	void fun(){
		System.out.println("This Printing was fun...");
	}
	
	//..
	//...
}

class JohnPrinterThread extends Thread{
	
	Printer pRef;
	
	public JohnPrinterThread() {
		pRef = Printer.getPrinter();
	}
	
	public void run(){
		// Synchronized Block
		synchronized (pRef) {
			pRef.printDocuments("==John==", 10);
			pRef.fun();
		}
	}
}

class JenniePrinterThread extends Thread{
	
	Printer pRef;
	
	public JenniePrinterThread() {
		pRef = Printer.getPrinter();
	}
	
	public void run(){
		synchronized (pRef) {
			pRef.printDocuments("==Jennie==", 10);
		}
	}
}

// For Multiple Threads working on Same Single OBJECT, Asynchronization is no good. We need to bring in Synchronization on threads

public class SyncDemo {

	public static void main(String[] args) {

		//Printer pRef = new Printer(); err
		//Printer pRef = Printer.getPrinter();
		//pRef.printDocuments("John", 5);

		JohnPrinterThread jRef = new JohnPrinterThread();
		JenniePrinterThread jeRef = new JenniePrinterThread();
				
		jRef.start();
		/*try {
			jRef.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		jeRef.start();
		
		
		//...
		//....
		
	}

}
