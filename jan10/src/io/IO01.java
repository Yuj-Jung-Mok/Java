package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 자바 입출력
// 외부와 연결
/*
 * 어떤 통로로 연결?
 * 어떻게 주고 받아요?
 * null 값
 * stream
 */

public class IO01 {

	public static void main(String[] args) {
		// 문자 기반 입력 스트림 최상위 클래스인 Reader
		FileReader fr = null;	
		// 위 Reader를 상속 받아서 만들어진 리더들
		BufferedReader br = null;
		
		try {
			fr = new FileReader("/Users/yjm/java/temp.txt");
			br = new BufferedReader(fr);
			String line = null;
			// line : 문자열을 읽어서 출력하기 위해 만듬
			
			while((line = br.readLine()) != null) {	// readLine() : 지정한 파일의 한 줄 읽어옴
				System.out.println(line);
				System.out.println("한 줄");
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽어오지 못했습니다.");
		} finally {
			// 가장 나중에 오픈한 객체를 먼저 닫아줍니다.
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
