package apple;

public class AppleBuyer {
	// 가지고 있는 돈, 사과의 수
	int buyerMoney = 5000;
	int appleCount;		// 인스턴스가 생성되면 기본 값을 가져갑니다.
	
	
	// 사과를 사는 행동, 정보를 말하는 행동
	public void buyApple(AppleSeller seller, int money) {
		buyerMoney -= money;
		appleCount += seller.saleApple(money);
	}
	
	public void tellBuyer() {
		System.out.println("구매한 사과는 " + appleCount + "개 입니다.");
		System.out.println("남은 돈은 " + buyerMoney + "원 입니다.");
	}
}