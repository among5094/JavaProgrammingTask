public class ContinueExample2261013 {
	public static void main(String[] args) {
		
		System.out.println("3의 배수만 출력하지 않기!");
		for (int i = 0; i <= 50; i++) {
			
			// i가 3의 배수일 때는 다음 반복으로 건너뜀.
			if (i%3 == 0)
			  continue; 
			  
			System.out.print(i);
			System.out.print(" ");
		}//for문 닫기
	}//메인 메소드 닫기
}//class닫기
