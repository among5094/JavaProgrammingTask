import java.util.Scanner;
public class ScoreAverage2261013{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scores[][] = new int[1][3];// 2차원 배열 생성

        // 성적 입력 받기
        System.out.println("국어,영어,수학 성적을 입력하세요.");
        for(int i = 0; i < 3; i++)
            scores[0][i] = sc.nextInt();
       
        // 평균 계산
        int sum = 0;
        for (int j = 0; j < 3; j++)
            sum = sum +scores[0][j]; //sum+=scores[0][j];
        
        double avg = (double)sum / 3;
        System.out.println("국영수 평균은 " + avg + " 입니다.");
        sc.close();
    }
}