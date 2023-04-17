public class ReturnArray2261013 {
	static int[] makeArray() {
		
		int temp[] = new int[4]; //배열 생성
		for(int i=0; i<temp.length; i++)
			temp[i]=i;
		
		return temp; //배열 리턴
	}
	
	//메인 메소드
	public static void main(String[] args) {
		
		int intArray[]; //또 다른 이름(레퍼런스) 생성
		intArray=makeArray(); //레퍼런스 치환이 일어남. 이름이 2개가 됐다는 뜻
		
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i]+" ");
	}
}
