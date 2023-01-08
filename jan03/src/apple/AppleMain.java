package apple;

public class AppleMain {
	public static void main(String[] args) {
		
		AppleSeller seller = new AppleSeller();
		AppleBuyer buyer = new AppleBuyer();
		
		buyer.buyApple(seller, 3000);
		
		seller.tellSeller();
		System.out.println("=========================");
		buyer.tellBuyer();
		
	}
}
