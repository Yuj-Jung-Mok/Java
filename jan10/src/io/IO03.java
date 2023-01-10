package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO03 {

	public static void main(String[] args) {
		
		// 파일을 생성하기 위해서는 FileOutPutStream
		// 객체 생성과 동시에 파일 이름을 적어줍니다.
		
		// 추후 예외 처리를 위해 null 값을 주고 먼저 초기화
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/Users/yjm/java/output.txt");
			
			for(int i = 0; i < 10; i++) {
				String data = i + "번째 줄 입니다.\r\n";
				fos.write(data.getBytes());
			}
			/*
			 * FileOutStream으로 쓰려면 Byte 배열로 써야 합니다. getBytes()
			 * 줄 바꿈 \r\n을 추가 했습니다. (윈도우의 경우)
			 * 유닉스는 \n만 있어도 됩니다. (맥의 경우)
			 * 
			 * FileWriter를 사용하면 문자열을 그대로 쓸 수 있습니다.
			 */
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
