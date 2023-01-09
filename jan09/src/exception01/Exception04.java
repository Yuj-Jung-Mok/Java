package exception01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// p422
public class Exception04 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/yjm/java/temp.txt");
			
			while(true) {
				int data = fr.read();
				if(data == -1) break;
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		}
		
	}
	
}
