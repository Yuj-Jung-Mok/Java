package dog;

import java.util.HashSet;
import java.util.Set;

import animal.Animal;
import animal.Human;

public class Dog extends Animal {
	
	// 1 - 45 숫자 6개를 뽑아주는 개
	public Set<Integer> lotto() {
		Set<Integer> lotto = new HashSet<Integer>();	// 중복 제거
		
		while(lotto.size() < 6) {
			// 이경우 무한루프 (Set은 자동으로 중복 제거해주는데 1만 중복으로 나와서 lotto 사이즈가 증가되지 않아 무한 루프)
			//lotto.add( (int) Math.random() * 45  + 1 ); 
			lotto.add( (int) ( Math.random() * 45 ) + 1 );
		}
		
		return lotto;
	}
	
	public void sound() {
		//super.sound();
		System.out.println("멍멍");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Human human = new Human();
		
		Set<Integer> lotto = dog.lotto();
		System.out.println(lotto);
		
	}
	
}
