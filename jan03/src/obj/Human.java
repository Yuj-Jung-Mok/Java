package obj;

public class Human {
		//	필드   : 변수, 정보 저장
		public int age;
		public String name;
		//	생성자 : 인스턴스를 생성하는 코드
		//	메소드 : 펑션, 기능
		Animal ani;
		
		public void show() {
			ani = new Animal();
			ani.setName("홍길동");
			System.out.println(ani.getName());
		}
}

// private 값을 저장, 호출할 때 필요한 getter, setter
class Animal {
	private String name;	// 다른 클래스에서 볼 수 없습니다.
	
	// 클릭으로 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 내부의 비밀스러운 동작을 위해서 외부에서 못 보게 할 때
	private void sleep() {
		System.out.println("비밀스럽게 잡니다.");
	}

}
