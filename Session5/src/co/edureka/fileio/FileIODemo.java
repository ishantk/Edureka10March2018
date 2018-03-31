package co.edureka.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

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
		
		void writeInFile(){
			try {
				
				File file = new File("/Users/ishantkumar/Downloads","MyFirstProgram.java");
				FileOutputStream fos = new FileOutputStream(file);
				//FileOutputStream fos = new FileOutputStream(file,true);
				
				String code = "class MyFirstProgram{\n\tpublic static void main(String[] args){\n\tSystem.out.println();\n\t}\n}";
				
				fos.write(code.getBytes());
				
				fos.close();
				
				System.out.println("File Write Operation Finished...");
				
			} catch (Exception e) {
				System.out.println("Some Exception: "+e);
			}
		}
		
		void writeInFileAgain(){
			try {
				
				File file = new File("/Users/ishantkumar/Downloads","MyFirstProgram.java");
				//FileWriter fw = new FileWriter(file);
				FileWriter fw = new FileWriter(file,true); // append mode
				
				String code = "class Point{\n\tint x;\n\tint y;}";
				
				fw.write(code);
				
				fw.close();
				
				System.out.println("File Write Operation Finished...");
				
			} catch (Exception e) {
				System.out.println("Some Exception: "+e);
			}
		}
}

public class FileIODemo {

	public static void main(String[] args) {
		
		IOOperations io = new IOOperations();
		//io.readFromFile();
		//io.readFromFileAgain();
		//io.writeInFile();
		io.writeInFileAgain();
	}

}
