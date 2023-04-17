import java.util.Scanner;//Scanner쓰기 위해서 선언
public class ScannerEx2261013 {
	
	public static void main(String[] args) {
		Scanner scanner_a = new Scanner(System.in); //Scanner객체 생성
		
		System.out.println("당신의 이름은 무엇입니까?"+ "");
		String name = scanner_a.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		
		System.out.println("당신이 좋아하는 영화는 무엇입니까?"+ "");
		String movie = scanner_a.next();
		System.out.println("좋아하는 영화는 "+movie+" 입니다.");
		
		System.out.println("당신이 좋아하는 숫자는 무엇입니까?"+ "");
		int number = scanner_a.nextInt(); //int형으로 입력받기
		System.out.println("당신이 좋아하는 숫자는 "+number+"입니다.");
		
		System.out.println("당신의 몸무게는 몇kg입니까?(소수점 뒷자리도 입력해주세요)");
		double weight = scanner_a.nextDouble();//Double형으로 입력받기
		System.out.println("당신의 체중은"+weight+"입니다.");
		System.out.println("질문에 대답해주셔서 감사합니다\u2764");
		scanner_a.close(); //쓸모없는 개체는 없애기 -> 메모리 해제하는 것
	}//메인 메소드 끝
}//class 끝
