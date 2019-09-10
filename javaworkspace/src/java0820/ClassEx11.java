package java0820;

import java.util.Scanner;

/*
Tv 기능 구현
클0. 필요한변수 : 채널, 볼륨, 파워, 
클1. 채널 = 배열[10] 생성후, 랜덤값 10개 생성하여 배열에 낮은값 부터 대입 // 범위는 마음대로 
클2. 채널(up,down)= 배열의 현재 위치에서 증감
클3. 채널값을 입력받아 변경(채널에 맞는 값이 아닌 경우 변경 못함)
클4. 볼륨은 0~10 까지 증감
클5. 볼륨 음소거 기능 vol = 0;
클6. TV 정보기능 : 메소드 호출하면 Tv 상태 출력 (채널, 볼륨, 전원상태)
클7. 전원이 꺼져 있는 동안 모든 기능 동작 안하게
---> 구조 만들기 (변수) -> 필요한 기능하나씩 메서드로 이름 짓고 만들기
*/

public class ClassEx11 {
	public static void main(String[] args) {
		MyTv t1 = new MyTv();
		Scanner sc = new Scanner(System.in);
		t1.setCh();
		t1.getCh();
		System.out.println();	
		System.out.println("채널 업 호출!");
		t1.chUp();
		System.out.println("채널 다운 호출!");
		t1.chDown();
		System.out.println("채널 변경 호출을 위해 숫자를 입력하세요");
		int ch = Integer.parseInt(sc.nextLine());
		t1.changeCh(ch);
		System.out.println("볼륨업 호출!");
		t1.volUp();
		System.out.println("음소거 호출!");
		t1.mute();
		System.out.println("볼륨다운 호출!");
		t1.volDown();		
		System.out.println("TV정보 호출");
		t1.tvinfo();
		System.out.println("전원의 상태를 변경합니다.");
		t1.power();
		System.out.println("채널 업 호출!");
		t1.chUp();
		System.out.println("채널 다운 호출!");
		t1.chDown();
		System.out.println("채널 변경 호출을 위해 숫자를 입력하세요");
		ch = Integer.parseInt(sc.nextLine());
		t1.changeCh(ch);
		System.out.println("볼륨업 호출!");
		t1.volUp();
		System.out.println("음소거 호출!");
		t1.mute();
		System.out.println("볼륨다운 호출!");
		t1.volDown();
		System.out.println("TV정보 호출");
		t1.tvinfo();
		t1.power();
		t1.chUp();
		sc.close();
	}

}
