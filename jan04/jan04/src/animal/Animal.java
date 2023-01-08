package animal;

public abstract class Animal {

	protected int age;
	protected String name;
	
	// 추상 메소드
	public abstract void sound();
	
	public void eat() {
		System.out.println("EAT!");
	}
	
}
