package abstract01;

public class Avengers {

	public static void main(String[] args) {
		Ironman ironman = new Ironman();
		Hulk hulk = new Hulk();
		Superman superman = new Superman();
		
		ironman.attack();
		hulk.attack();
		superman.attack();
		
		// 한번에 공격
		Hero[] avan = new Hero[3];

		// 다형성		
		avan[0] = ironman;	// 부모 타입이더라도 생성은 Ironman (오버라이딩된 값을 가져감)
		avan[1] = hulk;
		avan[2] = superman;
		
		for(Hero i : avan) {
			i.attack();
		}
		
		Hero h1 = new Ironman();
		h1.attack();	// 레이저 공격
		h1.defence();
		
		// 형변환으로 자식 클래스 속성 사용 가능
		((Ironman)h1).javis = "";
		((Ironman)h1).callJavis();
		
		Ironman h2 = (Ironman) h1;
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1 == h2);
		
		/*
		 * 다형성
		 * 다형성은 동적 바인딩을 지원해야 합니다.
		 * 
		 * 런타임 때 최종 타입이 결정되는 것.
		 * 
		 * 다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해 가능
		 * 
		 * 런타임 : 메모리에서 구동될 때
		 * 
		 */
	}
	
}
