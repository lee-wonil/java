package java0820;

public class MyTv {
	private boolean power=false;
	private int ch[]= new int[10];
	private int chcount=0;
	private int vol=0;
	void setCh() { // 채널 랜덤 생성 및 정렬
		for(int i=0;i<ch.length;i++) {
			ch[i]=(int)(Math.random()*20)+1;//1~20까지 채널생성후 임시변수
			for(int j=0;j<i;j++) {
				if(ch[j]>ch[i]) {
					int tmp=ch[i];
					ch[i]=ch[j];
					ch[j]=tmp;
				}
				if(ch[j]==ch[i]) {//채널이 중복이 된 경우 i를 1감소 시켜 새로 수를 뽑아 비교한다..
					i--;
					break;
				}
				
			}
		}
	}
	void getCh() {
		System.out.println("채널 리스트를 출력합니다.");
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
	}
	void chUp() {
		if(power) {
			if(chcount<ch.length-1)
				System.out.println("현재 채널 :"+ch[++chcount]);
			else {//만약 배열의 끝에서 증감할 시 오류 발생하기 때문에 첫번째 자리로 이동
				chcount=0;
				System.out.println("현재 채널 :"+ch[chcount]);
			}
		}
		else {
			System.out.println("power가 꺼져 있습니다.");
		}
	}
	void chDown() {
		if(power) {
			if(chcount>0) {
				System.out.println("현재 채널 :"+ch[--chcount]);
			}
			else {
				chcount=ch.length-1;
				System.out.println("현재 채널 :"+ch[chcount]);
			}
		}
		else {
			System.out.println("power가 꺼져 있습니다.");
		}
		
	}
	void tvinfo() {
		System.out.println("채널 : "+ch[chcount]+"\t볼륨 : "+vol+"\t전원상태 :"+(power?"On":"Off"));
	}
	void changeCh(int num) {
		if(power) {
			boolean find=false;
			for(int i=0;i<ch.length;i++) {
				if(num==ch[i]) {
					find = true;
					chcount=i;
					System.out.println("채널이 변경되었습니다. 현재 채널은 "+ch[i]+"입니다.");
					break;
				}
			}
			if(!find) {
				System.out.println("채널을 찾을수 없습니다.");
			}
		}
		else {
			System.out.println("power가 꺼져 있습니다.");
		}
	}
	void volUp() {
		if(power) {
			if(vol>=10) {
				System.out.println("더이상 볼륨을 올릴 수 없습니다.");
			}
			else {		
				System.out.println("볼륨업 현재 볼륨은"+(++vol)+"입니다.");
			}
		}
		else {
			System.out.println("power가 꺼져 있습니다.");
		}
			
	}
	void volDown() {
		if(power) {
			if(vol<=0) {
				System.out.println("더이상 볼륨을 내릴 수 없습니다.");
			}
			else {
				System.out.println("볼륨다운 현재 볼륨은"+(--vol)+"입니다.");
			}
		}
		else {
			System.out.println("power가 꺼져 있습니다.");
		}
	}
	void mute() {
		if(power) {
			System.out.println("음소거 되었습니다.");
			vol=0;
		}
		else {
			System.out.println("power가 꺼져 있습니다.");
		}
	}
	void power() {
		if(power) {
			System.out.println("전원 OFF");
			power=!power;
		}
		else {
			System.out.println("전원 ON");
			power=!power;
		}			
	}
	boolean isPower() {
		return power;
	}

}
