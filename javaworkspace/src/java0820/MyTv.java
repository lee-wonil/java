package java0820;

public class MyTv {
	private boolean power=false;
	private int ch[]= new int[10];
	private int chcount=0;
	private int vol=0;
	void setCh() { // ä�� ���� ���� �� ����
		for(int i=0;i<ch.length;i++) {
			ch[i]=(int)(Math.random()*20)+1;//1~20���� ä�λ����� �ӽú���
			for(int j=0;j<i;j++) {
				if(ch[j]>ch[i]) {
					int tmp=ch[i];
					ch[i]=ch[j];
					ch[j]=tmp;
				}
				if(ch[j]==ch[i]) {//ä���� �ߺ��� �� ��� i�� 1���� ���� ���� ���� �̾� ���Ѵ�..
					i--;
					break;
				}
				
			}
		}
	}
	void getCh() {
		System.out.println("ä�� ����Ʈ�� ����մϴ�.");
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
	}
	void chUp() {
		if(power) {
			if(chcount<ch.length-1)
				System.out.println("���� ä�� :"+ch[++chcount]);
			else {//���� �迭�� ������ ������ �� ���� �߻��ϱ� ������ ù��° �ڸ��� �̵�
				chcount=0;
				System.out.println("���� ä�� :"+ch[chcount]);
			}
		}
		else {
			System.out.println("power�� ���� �ֽ��ϴ�.");
		}
	}
	void chDown() {
		if(power) {
			if(chcount>0) {
				System.out.println("���� ä�� :"+ch[--chcount]);
			}
			else {
				chcount=ch.length-1;
				System.out.println("���� ä�� :"+ch[chcount]);
			}
		}
		else {
			System.out.println("power�� ���� �ֽ��ϴ�.");
		}
		
	}
	void tvinfo() {
		System.out.println("ä�� : "+ch[chcount]+"\t���� : "+vol+"\t�������� :"+(power?"On":"Off"));
	}
	void changeCh(int num) {
		if(power) {
			boolean find=false;
			for(int i=0;i<ch.length;i++) {
				if(num==ch[i]) {
					find = true;
					chcount=i;
					System.out.println("ä���� ����Ǿ����ϴ�. ���� ä���� "+ch[i]+"�Դϴ�.");
					break;
				}
			}
			if(!find) {
				System.out.println("ä���� ã���� �����ϴ�.");
			}
		}
		else {
			System.out.println("power�� ���� �ֽ��ϴ�.");
		}
	}
	void volUp() {
		if(power) {
			if(vol>=10) {
				System.out.println("���̻� ������ �ø� �� �����ϴ�.");
			}
			else {		
				System.out.println("������ ���� ������"+(++vol)+"�Դϴ�.");
			}
		}
		else {
			System.out.println("power�� ���� �ֽ��ϴ�.");
		}
			
	}
	void volDown() {
		if(power) {
			if(vol<=0) {
				System.out.println("���̻� ������ ���� �� �����ϴ�.");
			}
			else {
				System.out.println("�����ٿ� ���� ������"+(--vol)+"�Դϴ�.");
			}
		}
		else {
			System.out.println("power�� ���� �ֽ��ϴ�.");
		}
	}
	void mute() {
		if(power) {
			System.out.println("���Ұ� �Ǿ����ϴ�.");
			vol=0;
		}
		else {
			System.out.println("power�� ���� �ֽ��ϴ�.");
		}
	}
	void power() {
		if(power) {
			System.out.println("���� OFF");
			power=!power;
		}
		else {
			System.out.println("���� ON");
			power=!power;
		}			
	}
	boolean isPower() {
		return power;
	}

}
