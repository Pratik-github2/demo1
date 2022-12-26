package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
	
		public static void main(String[] args) {
			File f=new File("Hello.txt");
			if(!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			FileOutputStream fileOutputStream=null;
			try {
				fileOutputStream=new FileOutputStream(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String Message="Hello World";
			try {
				fileOutputStream.write(Message.getBytes());
				fileOutputStream.flush();
				fileOutputStream.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("done...");
		}
	
}
