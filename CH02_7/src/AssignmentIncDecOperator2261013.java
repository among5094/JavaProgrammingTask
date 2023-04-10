public class AssignmentIncDecOperator2261013 {
	public static void main(String[] args) {
		
		int a=3,b=3,c=3;
		a+=7;
		b*=4;
		c%=9;
		System.out.println("a="+a+",b="+b+",c="+c);
		
		int d=2;
		
		a=d++;//후위 연산자: d를 2증가하고 증가 전의 값 반환
		System.out.println("a="+a+",b="+ b);
		a=++d;//전위 연산자: d를 2증가하고 증가된 값 반환
		System.out.println("a="+a+",b="+ b);
		a=d++;
		System.out.println("a="+a+",b="+ b);
		a=d--;//d를 감소하고 감소 전의 값 반환
		System.out.println("a="+a+",b="+ b);
		a=--d;//d를 감소하고 감소된 값 반환
		System.out.println("a="+a+",b="+ b);
		
	}//main method 닫기
}//class 닫기
