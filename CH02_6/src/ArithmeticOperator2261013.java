import java.util.Scanner; //스캐너를 쓰기위한 임포트문
public class ArithmeticOperator2261013 {
	public static void main(String[] args) {//메인 메소드 시작
		Scanner sc = new Scanner(System.in);

			System.out.print("연도를 입력하세요: ");
	        int year = sc.nextInt();
	        
	        /*/와 %를 이용하여 윤년판별하기 
	         조건1. 연도가 4의 배수이면서 100의 배수가 아닌 경우
	         조건2. 연도가 400의 배수인 경우 */
	        
	        if (year % 4 == 0){
	            if (year % 100 != 0 || year % 400 == 0)
	            	System.out.println(year + "년은 윤년입니다.");
	       }
	       else
	           System.out.println(year + "년은 윤년이 아닙니다.");
	        
	        sc.close(); //메모리 해제
	}//메인 메소드 끝 
}//class끝

