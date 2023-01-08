package wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 랩퍼 클래스
// 능력 단위 : (비NCS) 웹 표준 기술 
// 능력 단위 요소 : (비NCS) 웹 표준 기술

/*
 * 자료 구조 ? 
 * 컬렉션(자료 구조)은 참조값(레퍼런스, R타입)만 담을 수 있습니다.
 * 
 * P타입은 저장할 수 없습니다.
 * 그래서 랩퍼 클래스로 변환 후 저장합니다.
 * 
 * 기본 자료형의 값을 컬렉션에 저장하기 위해 사용합니다.
 * 모든 기본 자료형에 대해 그에 대응되는 랩퍼 클래스가 있습니다.
 * 
 * 기본 자료형의 값을 멤버 변수에 저장하고 
 * 이 값 주변으로 값을 감싸고 있는 메소드가 있다고 해서
 * 랩퍼 (wrapper, 감싸다) 클래스라고 불립니다.
 * 
 * 기본 타입	랩퍼 클래스명
 * 	byte		Byte
 * 	short		Short
 * 	int			Integer		!
 * 	long		Long
 * 	float		Float
 * 	double		Double
 * 	char		Character	!
 * 	boolean		Boolean
 * 
 * 프로모션 ?
 */

public class Wrapper {
	
	public static void main(String[] args) {
		
		Byte b = new Byte((byte) 127);
		Byte b2 = 127;
		
		Integer iNum = new Integer(127);
		Integer iNum2 = 127;	// 오토 박싱 <-> 언박싱
		
		byte bNum = iNum2.byteValue();	// 캐스팅이 아닙니다.
		short sNum = iNum2.shortValue();
		float fNum = iNum2.floatValue();
		
		System.out.println(Integer.MAX_VALUE);	// 2147483647
		System.out.println(Integer.MIN_VALUE);	// -2147483648
		
		System.out.println(Byte.MAX_VALUE);		// 127
		System.out.println(Byte.MIN_VALUE);		// -128
		
		System.out.println(Double.MAX_VALUE);	// 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);	// 4.9E-324
		
		System.out.println(Byte.MAX_VALUE / Byte.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE / Byte.MAX_VALUE);
		
		// 오토 박싱
		Integer iNum3 = 127;
		Integer iNum4 = new Integer(127);
		// 형변환이 아닙니다. 기본 타입이 참조 타입으로 바뀝니다.
		
		if(iNum3 == iNum4) {
			System.out.println("같아요.");
		} else {
			System.out.println("달라요.");
		}
		
		// R 타입 값 비교 시
		System.out.println(iNum3.equals(127));		// 같으면 true, 다르면 false
		System.out.println(iNum3.compareTo(126));	// 같으면 0, 앞 숫자가 크면 1, 뒤 숫자가 크면 -1
		
		// 오토 언박싱
		int number = iNum3;	// R 타입 값만 가져옴
		// iNum3 참조하고 있는 객체 안에 있는 int 값이 객체 밖으로 나와 number에 들어갑니다.
		System.out.println(number);
		
		// 래퍼 클래스가 아닌 오브젝트 클래스에 10을 대입했기 때문에 자동으로 언박싱 되지 않는다.		
		Object obj = 10;
		System.out.println(obj);
		int result = (int) obj;
		System.out.println(result);
		
		// 형변환
		result = (Integer) obj;	// 래퍼 클래스는 알맞는 기본 자료형은 오토 언박싱이 됩니다.
		result = ((Integer) obj).intValue();
		
		// 컬렌션은 기본 자료형을 담을 수 없기때문에 타입을 래퍼 클래스(기본형 데이터를 참조형 멤버 변수에 저장)로 선언했다.
		Set<Integer> lotto = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map;
		
	}
	
}
