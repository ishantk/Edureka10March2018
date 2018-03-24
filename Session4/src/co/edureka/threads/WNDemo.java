package co.edureka.threads;

class Message{
	
	private static Message mRef = new Message();
	
	String msg;
	
	private Message(){
		msg = "No Message Available";
	}
	
	void writeMessage(String what){
		msg = what;
		System.out.println("Message Written: "+msg);
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
	
	static Message getMessage(){
		return mRef;
	}
}

class ReaderThread extends Thread{
	
	Message mRef;
	
	ReaderThread(){
		mRef = Message.getMessage();
	}
	
	public void run(){
		synchronized (mRef) {
			
			try {
				mRef.wait();
				//mRef.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			mRef.readMessage();
		}
	}
}

class WriterThread extends Thread{
	
	Message mRef;
	
	WriterThread(){
		mRef = Message.getMessage();
	}
	
	public void run(){
		synchronized (mRef) {
			mRef.writeMessage("Be Exceptional !!");
			//mRef.notify();
			mRef.notifyAll();
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {

		ReaderThread rRef1 = new ReaderThread();
		ReaderThread rRef2 = new ReaderThread();
		WriterThread wRef = new WriterThread();
		
		rRef1.start();
		rRef2.start();
		
		wRef.start();

	}

}
