package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// FileWriter = String 사용 가능

public class IO04 {

	public static void main(String[] args) {
		
		// 특정 파일 선택
		File file = new File("/Users/yjm/java/fileWriter.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			fw.write("이거 입력 되나요?\n");
			fw.write("저장 되나요?\n");
			
			fw.flush();	// 저장	: 출력 버퍼에 있는 값 다 저장
			fw.close();	// 닫기
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
	
}
