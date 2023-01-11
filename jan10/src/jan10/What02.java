package jan10;

// 제네릭 연습

interface Info {
	int getLevel();
}

class StudentInfo {
	public int grade;
	StudentInfo(int grade) {
		this.grade = grade;
	}
}


class EmployeeInfo implements Info{
	public int rank;
	public EmployeeInfo(int rank) {
		this.rank = rank;
	}
	
	@Override
	public int getLevel() {
		return this.rank;
	}
}
// <> 안에는 참조형만 올 수 있습니다.
class Person<T, S> {
	public T info;
	public S id;
	public Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
	
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

// 여기서 extends는 부모가 누구인지만 찾음 (상속의 개념이 아님)
class Person2<T extends Info> {
	public T info;
	public Person2(T info) {
		this.info = info;
		info.getLevel();	// getLevel() 메소드를 가진 클래스를 특정했기 때문에 사용 가능
	}
	
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class What02 {

	public static void main(String[] args) {
		
//		Person p1 = new Person("부장");
//		EmployeeInfo ei = (EmployeeInfo)p1.info;	// 컴파일 단계에선 오류가 발생하지 않는다.
//		System.out.println(ei.rank);
		
		Integer id = new Integer(1);
		
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
		System.out.println(p1.info + " : " + p1.id.intValue());
		
		// 제네릭 생략
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		
		Person p2 = new Person(e, i); // 생략 가능
		p2.<EmployeeInfo>printInfo(e);
		p2.printInfo(e);			  // 생략 가능
		
		Person2<EmployeeInfo> p3 = new Person2<EmployeeInfo>(new EmployeeInfo(1));
		// Person2<String> p4 = new Person2<String>("부장"); // 부모가 누구인지를 지정했기 때문에 사용할 수 없다.
	}

}