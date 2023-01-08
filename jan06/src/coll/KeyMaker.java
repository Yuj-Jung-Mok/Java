package coll;

//시리얼키 만들기
//W269N-WFGWX-YVC9B-4J6C9-T83GX 형식

public class KeyMaker extends SerialNumber {
	
	public static void main(String[] args) {
		SerialNumber serialNumber = new SerialNumber();
		
		// MY
		long sTime = System.currentTimeMillis();

		String serial = serialNumber.makeMySerial();
		System.out.println(serial);
		
		long eTime = System.currentTimeMillis();
		System.out.println("makeMySerial() 걸린 시간 : " + (eTime - sTime));
		
		// UR
		sTime = System.currentTimeMillis();
		
		serial = serialNumber.makeUrSerial();
		System.out.println(serial);
		
		eTime = System.currentTimeMillis();
		System.out.println("makeUrSerial() 걸린 시간 : " + (eTime - sTime));
	}
	
	
	
}

interface FSerialNumber {
	String makeMySerial();
	String makeUrSerial();
}

class SerialNumber implements FSerialNumber {
	final static char[] alpha = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 
								  'H', 'I', 'J', 'K', 'L', 'N', 'M', 
								  'O', 'P', 'Q', 'R', 'S', 'T', 'U', 
								  'V', 'W', 'X', 'Y', 'Z' };
	
	
	public String makeMySerial() {
		String key = "";
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				int ran = (int)(Math.random() * 2);
				int rNum = (int)(Math.random() * 10);
				int rKey = (int) (Math.random() * 26);
				
				if(ran == 0) { key += alpha[rKey]; }
				else { key += rNum; }
			}
			
			key += "-";
		}
		
		key = key.substring(0, key.length() - 1);
		return key;
	}
	
	final static String PATTERN = "annna" + "aaaaa" + "aanan" + "anana" + "nnaan";
	
	public String makeUrSerial() {
//		String key = "";
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i < PATTERN.length(); i++) {
			int ran = (int)(Math.random() * 2);
			int rNum = (int)(Math.random() * 10);
			int rKey = (int) (Math.random() * 26);
			
			if(PATTERN.charAt(i) == 'a') { sb.append(alpha[rKey]); }
			else { sb.append(rNum); }
			
			if((i+1) % 5 == 0) sb.append("-");
		}
		
		
		return sb.substring(0, sb.length() - 1);
	}
}
