import java.util.Scanner;
public class Garding2261013 {
		public static void main(String[] args) {
				
			char grade; //학점
			Scanner sc = new Scanner(System.in); //스캐너 쓰기 위해
				
			System.out.print("점수를 입력하세요(0~100): ");
			int score=sc.nextInt(); //점수 읽기
				
			switch(score/10) {
				
				case 9: case 10: //10은 100점인 경우
					grade='A'; break;
				
				case 8:
					grade='B'; break;
						
				case 7:
					grade='C'; break;
					
				case 6:
					grade='D'; break;
						
				default://else에 해당하는 부분
					grade='F';
			
			}//switch문
				
			System.out.println("학점은" + grade + "입니다.");
			sc.close();//반환

		}//메인메소드 닫기
}//class닫기
