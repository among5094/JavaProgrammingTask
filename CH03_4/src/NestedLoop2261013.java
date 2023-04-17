public class NestedLoop2261013 {
	public static void main(String[] args) {
		
		System.out.println("구구단을 외자~");
		
		for(int j=1; j<10; j++){
			
			for(int i=1; i<10; i++){
				
				System.out.print(i+"*"+j+"=" + i*j);
				System.out.print('\t');//탭으로 밀기
			}
			System.out.println(); //다음줄로 
		}//큰 for문 종료
		
		
	}//메인 메소드 종료
}//class종료
