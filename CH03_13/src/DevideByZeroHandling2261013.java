import java.util.Scanner; //스캐너 쓰기위한 임포트문
import java.util.InputMismatchException;
public class DevideByZeroHandling2261013 {
	public static void main(String[] args) {
		
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in); 
		
		int dividend;// 나뉨수
		int divisor; //나눗수
		
		try {
			System.out.print("나뉨수를 입력하시오: ");
			dividend = sc.nextInt(); //나뉨수 입력
			System.out.print("나눗수를 입력하시오: ");
			divisor = sc.nextInt(); //나눗수 입력
			System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+dividend/divisor+" 입니다.");
		}
		catch(ArithmeticException e) {
			System.out.print("0으로 나눌 수 없습니다.");
		}
		catch (InputMismatchException e) {
	            System.out.print("정수를 입력해주세요.");
	    } 
		finally{
			sc.close();
		}//finally 닫기	
	}//메인 메소드 닫기
}//class닫기
