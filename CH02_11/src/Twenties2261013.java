import java.util.Scanner;
public class Twenties2261013 {
	public static void main(String[] args) {
		
		Scanner scanner_name = new Scanner(System.in); //스캐너 쓰기 위해
		
		System.out.print("나이를 입력하세요>> ");
		int age=scanner_name.nextInt();
		
		if((age>=20)&&(age<30)) {
			System.out.println("20대입니다.");
			System.out.println("20라서 행복합니다! 키키키");
		}
		else
			System.out.println("20대가 아닙니다.");
		
		scanner_name.close();//반환
		
	}//메인메소드 닫기
}//class반환
