package java0904;

import java.io.File;

public class FileEx01 {
	public static void main(String[] args) {
		// ���� ��ü ���� :  ������ �����ϴ� ���� ���
		File f = new File("c:\\windows\\system.ini"); 
		//����ۼ��� �������� �ΰ� (�̽������� ���ڷ� �ν����� �ʰ�)
		// ���� ũ��
		long size = f.length();
		System.out.println(size);
		
		// ���� �̸�
		String name = f.getName();
		System.out.println(name);
		
		//���� ���
		String path = f.getPath();
		System.out.println(path);
		
		String absPath = f.getAbsolutePath();
		System.out.println(absPath);
		// ���� ���� : �θ� ���丮
		String parent = f.getParent();
		System.out.println(parent);
		// ���� Ÿ�� �Ǻ�
		if(f.isFile()) System.out.println(f.getAbsolutePath()+"�� �����Դϴ�.");
		else if(f.isDirectory()) System.out.println(f.getAbsolutePath()+"�� ���� �Դϴ�.");
		
		System.out.println("����Ӽ� : "+f.isHidden());
		System.out.println("�б�Ӽ� : "+f.canRead());
		System.out.println("����Ӽ� : "+f.canWrite());
		java.util.Date day = new java.util.Date(f.lastModified());
		System.out.println("���� ��¥ : "+day);
		
		// ���ϸ���Ʈ ����
		File f2 = new File("C:\\Windows\\Temp");
		File[] subfiles = f2.listFiles();
		for(int i =0;i<subfiles.length;i++) {
			System.out.print(subfiles[i].getName());
			System.out.println("\t���� ũ�� : " +subfiles[i].length());
		}
		
	}
}
