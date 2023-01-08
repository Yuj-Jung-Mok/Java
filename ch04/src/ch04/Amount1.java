package ch04;

public class Amount1 {
	public static void main(String[] args) {
		
		String title = "매출현황";
		String[] subject = {"제품명", "1월", "2월", "3월", "4월", "합계", "평균"};
		String[] name = {"냉장고", "테레비", "청소기"};
		int[][] amt = {{250, 170, 300, 780}, {170, 120, 150, 220}, {450, 230, 400, 250}};
		int[] tot = new int[amt[0].length];
		int len = 51, sum = 0;
		
		System.out.println(title);
		
		System.out.println();
		
		for(String sub : subject) { System.out.print(sub + "\t"); }
		System.out.println();
		for(int i = 0; i < len; i++) {System.out.print("=");}
		System.out.println();
		
		for(int i = 0; i < amt.length; i++) {
			sum = 0;
			System.out.print(name[i] + "\t");

			for(int j=0; j < amt[i].length; j++) {
				sum += amt[i][j];
				tot[j] += amt[i][j];
				System.out.print(amt[i][j] + "\t");
			}
			System.out.println(sum + "\t" + (sum / amt[i].length));
		}
		
		for(int i = 0; i < len; i++) {System.out.print("=");}
		System.out.println();
		
		System.out.print("월합계 \t");
		
		sum = 0;
		
		for(int i=0; i < tot.length; i++) {
			sum += tot[i];
			System.out.print(tot[i] + "\t");
		}
		System.out.print(sum + "\t" + ((sum / tot.length) / name.length));
		
	}
}
