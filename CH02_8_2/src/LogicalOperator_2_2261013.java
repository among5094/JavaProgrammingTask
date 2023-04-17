import java.util.Scanner;
public class LogicalOperator_2_2261013 {
	public static void main(String[] args) {//논리연산자 응용하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 점수가 평균에 속하는지 아닌지 판별해줍니다!! ");
		System.out.print("점수를 입력하세요>> ");
		 int score = sc.nextInt();

		 if (score <= 80 && score > 60)
			 System.out.println("당신의 성적은 평균에 속합니다.");
	    else
	    	System.out.println("당신은 평균에 속하지 않습니다. 노력합시다!");
	    
	
	
		sc.close();
	}//main method닫기
}//class닫기
