import java.util.Scanner;
public class LogicalOperator2261013 {
	public static void main(String[] args) {//비교연산자 응용하기
		
		System.out.println("세 수를 입력받아 가장 큰 수 출력하기");
		Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력해주세요>> ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 수를 입력해주세요>> ");
        int num2 = sc.nextInt();

        System.out.println("세 번째 수를 입력해주세요>> ");
        int num3 = sc.nextInt();

        int max = num1; //최대값에 일단 임의의 수 넣어두기

        if (num2 > max)
            max = num2;
      
        if(num3 > max)
            max = num3;
       
        System.out.println("가장 큰 수는 " + max + "입니다.");
        sc.close();
	}//메인 메소드 닫기
}//메인 클래스 닫기
