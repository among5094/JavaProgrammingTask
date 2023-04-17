public class BitShiftOperator2261013 {
	public static void main(String[] args) {
		
		short a=(short)0x15ff;
		short b=(short)0x75ff;
		
		//비트연산
		System.out.println("[비트연산 결과]");
		System.out.printf("%04x\n", (short)a&b);//%x는 int형 변수를 16진수로 표시해주는 것
		//%4x는 16진수를 표시하되 4자리를 맞춰서(오른쪽정렬) 표시
		
		System.out.printf("%04x\n", (short)a|b);//a|b -> a와b OR 연산
		System.out.printf("%04x\n", (short)a^b);//a^b -> a와b AND 연산
		System.out.printf("%04x\n", (short)~a);//not a이다. 1을 0으로, 0을 1로
		
		byte c=20;
		byte d=-8;
		
		System.out.println("[시프트 연산 결과]");//시프트연산
		System.out.println(c<<6);//c의 각 비트를 왼쪽으로 6번 시프트한다.
		System.out.println(c>>5);//c의 각 비트를 오른쪽으로 5번 시프트한다.
		System.out.println(d>>4);//c의 각 비트를 오른쪽으로 4번 시프트한다.
		System.out.printf("%x\n", (d>>>3));//d비트를 오른쪽으로 3번 시프트하기. 0삽입
		
	}//main method 
}//class닫기
