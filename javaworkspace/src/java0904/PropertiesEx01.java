package java0904;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx01 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		//Ű, �� ����
		prop.setProperty("Ʈ����", "ź���");
		prop.setProperty("Altoids", "��Ʈ����");
		prop.setProperty("������", "Xs");
		prop.setProperty("�ڹ�", "OOP");
		
		// prop�� ����� ��Ҵ� Enumeration�� �̿��ؼ� ���
		Enumeration e= prop.propertyNames();
		while(e.hasMoreElements()) {
			// Object o = e.nextElement(); 
			String str =(String)e.nextElement();
			System.out.println(str+"="+prop.getProperty(str));
		}
		// ������ ������ Ű�� �����ϸ� ���� ����� �ȴ�.
		prop.setProperty("Ʈ����", "����Ŭ�� ����");
		System.out.println("Ʈ���� : "+prop.getProperty("Ʈ����"));
	}
}
