package jan10;

public class What01 {
	char[][] data;
	
	int createRandom() {
		int random = 0;
		
		do {
			random = (int) (Math.random() * 10) + 1;
		} while(random < 4);
		
		return random;
	}
	
	void createMap() {
		char[][] wall = new char[createRandom()][createRandom()];
		
		for(int i = 0; i < wall.length; i++) {
			for(int j = 0; j < wall[i].length; j++) {
				if((i == 0 || i == wall.length -1) && (j == 0 || j == wall[i].length - 1) ) {
					wall[i][j] = '+';
				} else if((i == 0 || i == wall.length - 1)) {
					wall[i][j] = 'ㅡ';
				} else if((j == 0 || j == wall[i].length - 1)){
					wall[i][j] = '|';
				} else {
					wall[i][j] = '　';
				}
			}
		}
		
		data = wall;
	}
	
	void createDoor() {
		int cnt = 0;
		
		do {
			int xLen = (int) (Math.random() * data[0].length);
			int yLen = (int) (Math.random() * data.length);
			
			if( (yLen > 0 && yLen < data.length - 2) ) {
				if(xLen == data[0].length - 1 || xLen == 0) {
					data[yLen][xLen] = '문';
					cnt++;
				}
			} else if(yLen <= 0 || yLen >= data.length - 1){
				if(xLen > 0 && xLen < data[0].length - 1) {
					data[yLen][xLen] = '문';
					cnt++;
				}
			}
		} while(cnt < 5);
		
	}
	
	void showMap() {
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}
	
	// 던전 만들기
	public static void main(String[] args) {
		What01 w = new What01();
		w.createMap();
		w.createDoor();
		w.showMap();
	}
	
}
