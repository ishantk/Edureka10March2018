package co.edureka.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

class IOOperations{
	
	void readFromFile(){
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/WrapperDemo.java");
			File file = new File("/Users/ishantkumar/Downloads","WrapperDemo.java");
			
			// Read file in the form of bytes
			FileInputStream fis = new FileInputStream(file);
			
			int ch = 0;
			int count = 0;
			int count1 = 0;
			while((ch = fis.read()) != -1){
				
				char chr = (char)ch;
				if(chr=='{'){
					count++;
				}
				if(chr=='}'){
					count1++;
				}
				System.out.print(chr);
			}
		
			fis.close(); // Releasing the memory resources. Its Important
			
			System.out.println("{ occurs "+count+" times");
			System.out.println("} occurs "+count1+" times");
			
			if(count == count1){
				System.out.println("No Compiler issue for braces { } ");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
		
		void readFromFileAgain(){
			
			try {
				
				//File file = new File("/Users/ishantkumar/Downloads/WrapperDemo.java");
				File file = new File("/Users/ishantkumar/Downloads","WrapperDemo.java");
				
				// Read file in the form of characters
				FileReader reader = new FileReader(file);
				BufferedReader buffer = new BufferedReader(reader);
				
				String line = "";
				int count = 0;
				
				while((line = buffer.readLine()) != null){
					System.out.println(line);
					if(line.contains("new")){
						count++;
					}
				}
				
				System.out.println("Total Object Created in WrapperDemo.java: "+count);
				
				// Releasing the memory resources
				buffer.close();
				reader.close();
				
			} catch (Exception e) {
				System.out.println("Some Exception: "+e);
			}
		
		
		
	}
}

public class FileIODemo {

	public static void main(String[] args) {
		
		IOOperations io = new IOOperations();
		//io.readFromFile();
		io.readFromFileAgain();

	}

}
