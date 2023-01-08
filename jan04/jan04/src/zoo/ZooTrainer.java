package zoo;

public class ZooTrainer {
	
	public void feed(Predetor predetor) {	
		System.out.println(predetor.getNameppp() + "에게 밥을 줍니다.");
		
	}
	
	public static void main(String[] args) {
	
		Cat jerry = new Cat();
		jerry.setName("제리");
		
		Lion lion = new Lion();
		lion.setName("레오");
		
		ZooTrainer trainer = new ZooTrainer();
		trainer.feed(jerry);
		trainer.feed(lion);
				
	
	}
	
}
