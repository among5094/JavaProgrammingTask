import java.util.Scanner; //스캐너를 쓰기위한 임포트문

public class ArithmeticOperator2261013 {
	
	public static void main(String[] args) {//메인 메소드 시작
		
		Scanner scanner = new Scanner(System.in);
		//Scanner 클래스란 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스임.
		
		System.out.print("정수를 입력하세요:"); //모니터에 문구를 띄어줌
		
		//변수 선언 영역
		int time = scanner.nextInt(); //정수 입력
		int sec=time%60; //입력받은 정수를 60으로 나눈 '나머지' -> '초'구하기
		int min=(time/60)%60; //입력받은 정수를 60으로 나눈 '몫'을 다시 60으로 나눈 '나머지!!' -> '분'구하기
		int hour=(time/60)/60; //입력받은 정수를 60으로 나눈 '몫'을 다시 60으로 나눈 '몫' -> '시간'구하기
		
		System.out.print(time+"초는 ");
		System.out.print(hour+"시간,");
		System.out.print(min+"분,");
		System.out.println(sec+"초입니다.");
		
		scanner.close(); //메모리 해제
		
	}//메인 메소드 끝 
	
}//class끝

