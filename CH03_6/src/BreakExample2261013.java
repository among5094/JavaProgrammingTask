import java.util.Scanner;//스캐너 쓰기 위해
public class BreakExample2261013 {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");

		while(true)
		{
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))// "exit"가 입력되면 반복 종료			
				break; // while 문을 벗어남
		}
		System.out.println("종료합니다...");
		scanner.close();
	}
}