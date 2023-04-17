public class DoWhileSample2261013 {
	public static void main(String[] args) {
			
		char a='\u326D';//㉭, 유니코드 0x326D  
			
		do {
			
			System.out.print(a);
			a=(char)(a-1);
			
		}while(a>='\u3260'); //3260 -> ㉠
	}//main class닫기
}

