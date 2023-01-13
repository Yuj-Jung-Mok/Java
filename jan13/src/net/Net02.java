package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Net02 {

	public static void main(String[] args) {
		
		URL url = null;
		BufferedReader br = null;
		String addr = "https://blog.naver.com/wisejia";
		
		try {
			url = new URL(addr);
			InputStream ins = url.openStream();
			br = new BufferedReader(new InputStreamReader(ins));
			
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			System.out.println("URL 오류");
		} catch (IOException e) {
			System.out.println("스트림 오류");
		}
	}
	
}