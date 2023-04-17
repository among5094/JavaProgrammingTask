public class TypeConversion2261013 {
	public static void main(String[] args) {
		
		byte b=120; //byte는 1바이트이다. 범위는 -128~127까지임.
		int i=3000;
		
		System.out.println("선언한 값>> "+"byte b="+b+" "+"int i="+i);
		System.out.println("-- 타입 변환 -- ");
		System.out.println(b+i); //1바이트와 4바이트면 큰 쪽(4byte) 따라간다.
		System.out.println(33/4); //소수점 뒷자리가 안 나온다. 정수끼리 나눴기 때문
		System.out.println(33.0/4); //double형 vs int형 하면 double 따라간다.
		System.out.println((char)0x12340042);
		//0x1234 -> 16진수로 표현된 정수값, 0041-A
		
		System.out.println("-- 강제 형변환해서 데이터가 손실된 사례 --");
		System.out.println((byte)(b+i));
		//1byte는 8bit이고 2의7승=128이고 여기서 -1해서 127까지 저장가능하다. 
		//127까지 저장가능한데 227을 저장하려고 해서 데이터 손실이 일어났다. 
		
		System.out.println("-- 형변환 -- ");
		System.out.println((int)3.0+5.6);
		System.out.println((int)(3.0+5.6));
		System.out.println((int)3.0+(int)5.6);
		System.out.println((double)3/(double)5);
		
	}//main method 닫기
}//class닫기
