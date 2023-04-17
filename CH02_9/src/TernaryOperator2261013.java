import java.util.Scanner;//스캐너 쓰기위한 
public class TernaryOperator2261013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수인지 홀수인지 알려줄게요^ㅡ^");
		System.out.println("숫자를 입력하세요 >>");
		
		int num=sc.nextInt();//정수 입력받기
		String result = (num%2== 0) ? "짝수" : "홀수";

		System.out.println(num+"은(는)"+ result +"입니다.");
		sc.close();
		
	}//메인 메소드 닫기
}//class닫기
