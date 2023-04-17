import java.util.Scanner;//스캐너 쓰기 위해
public class Season2261013 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월(1~12)를 입력하세요");
		int month=scanner.nextInt(); //정수로 월 입력
		
		if(month >= 3 && month <= 5)
		    System.out.println("봄입니다.");
		else if(month >= 6 && month <= 8)
		    System.out.println("여름입니다.");
		else if(month >= 9 && month <= 11)
		    System.out.println("가을입니다.");
		else if(month == 12 || month == 1 || month == 2)
		    System.out.println("겨울입니다.");
		else
		    System.out.println("잘못된 입력값입니다.");
		
		scanner.close();
		
	}//메인 메소드 닫기
}//class닫기
