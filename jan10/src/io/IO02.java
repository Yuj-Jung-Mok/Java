package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

// 쓰기

public class IO02 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("/Users/yjm/java/temp.txt");
			fos = new FileOutputStream("/Users/yjm/java/write.txt");
			int i = 0;
			int data = 0;	// 몇개 읽었습니다.
			byte[] temp = new byte[5];	// 실제 데이터
			while( (data = fis.read(temp)) != -1) {	// 이 문구로 템프에 저장하는가?
				System.out.println((char)temp[i]);
				i++;
				System.out.println("읽은 수 : " + data);
				fos.write(temp, 0, data);
				// 가나다라마바사 -> 가나다라마 = 5 (data 갯수 저장) -> 바사 = 2 (data 갯수 저장)
				// 실제 저장할 데이터, 시작 위치, 끝 위치
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			System.out.println("파일이 잘못 되었습니다.");
		}
		
	}
	
}
