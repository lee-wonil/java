package editplus;

//입력문
//#1.import문 사용 : 작업파일의 최 상단에 작성한다.
import java.util.Scanner;

class Test07{
	
	public static void main(String[] args){
		
		// #2. Scanner 객체 생성 : 사용하기 전에 한번만 해주면 된다. 다 쓰면 닫아준다.
		Scanner sc = new Scanner(System.in);
		// #3. 입력받기
		System.out.println("인사말을 입력하세요.: "); // 입력할 것을 사용자에게 유도하는 문구 출력
		String str = sc.nextLine();
		
		System.out.println("나이 입력 : ");
		String age = sc.nextLine();

		//출력해서 확인
		System.out.println(str);
		System.out.println(age);
		// #4. 객체 닫기
		sc.close();

	}
}
