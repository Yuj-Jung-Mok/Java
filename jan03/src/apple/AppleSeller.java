package apple;
// 사과장수
public class AppleSeller {
	// 필요한 정보는?
	// 사과 갯수, 사과 가격, 가지고 있는 돈
	int appleCount = 100;			// 카멜 표기법
	final int APPLE_PRICE = 1000;	// 상수 처리, final 수정 불가
	int sellerMoney = 0;
	
	// 필요한 메소드는?
	// 사과 판매 행동, 정보를 말하는 행동
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		sellerMoney += money;
		appleCount -= num;
		return num;	// 결과값을 되돌려 줍니다.
	}
	
	public void tellSeller() {
		System.out.println("남은 사과는 " + appleCount + "개 입니다.");
		System.out.println("수익은 " + sellerMoney + "원 입니다.");
	}
}
