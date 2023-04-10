import java.util.Scanner;//Scanner쓰기 위해서 선언
public class ScannerEx2261013 {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 결혼 여부를 빈칸으로 분리하여 입력하시오.");
		//Scanner객체 생성
		Scanner scanner_a = new Scanner(System.in); 
		
		String name = scanner_a.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		
		String city = scanner_a.next();
		System.out.println("당신의 사는 도시는 "+city+"입니다.");
		
		int age = scanner_a.nextInt(); //int형으로 입력받기
		System.out.println("당신의 나이는"+age+"살입니다.");
		
		double weight = scanner_a.nextDouble();//Double형으로 입력받기
		System.out.println("당신의 체중은"+weight+"입니다.");
		
		boolean single = scanner_a.nextBoolean();//Boolean형으로 입력받기
		System.out.println("당신의 결혼 여부는"+ single +"입니다.");
		scanner_a.close(); //쓸모없는 개체는 없애기 -> 메모리 해제하는 것
	}//메인 메소드 끝
}//class 끝
