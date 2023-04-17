public class foreachEx2261013 {
	public static void main(String[] args) {//메인 메소드
		
		//Int 활용부분
		System.out.println("[ int 활용 ] ");
		int n[]= {1,2,3,4,5}; //배열 선언
		int sum=0;
		for(int k:n) {
			System.out.print(k+" ");
			sum += k;
		}
		System.out.println("합은 "+sum);
		
		//String 활용부분
		System.out.println("[ String 활용 ] ");
		String f[]= {"사과", "배", "바나나", "블루베리", "메론", "딸기"};
		for(String s:f)
			System.out.print(s+" ");
		System.out.println(" ");
		
		//Double 활용부분
		System.out.println("[ double 활용 ] ");
		double d[]= {1.4,2.2,9.3,7.4,1.5, 6.8};
		for(double d_for:d)
			System.out.print(d_for+" ");
		System.out.println(" ");
		
		//Char 활용부분
		System.out.println("[ Char 활용 ] ");
		char c[]= {'a', 'b', 'c','h','Y'};
		for(double c_for:c)
			System.out.print(c_for+" ");
		
	}//main메소드 닫기
}
