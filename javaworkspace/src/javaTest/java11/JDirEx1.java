package javaTest.java11;
import java.io.*;
import java.util.*;
class  JDirEx1{
	public static void main(String[] args)throws Exception {
		if(args.length != 1){
			System.out.println("���� : java JDirEx c:\\abx.txt");
			System.exit(1);
		}
		File file = new File(args[0]);
		if(!file.exists()){
			System.out.println(args[0]+" ������ �������� �ʽ��ϴ�.");
			System.exit(1);
		}
		System.out.println("���� ��� : "+file.getAbsolutePath());
		System.out.println("��� ��� : "+file.getCanonicalPath());
		System.out.println("������ : "+new Date(file.lastModified()));
		if(file.isDirectory()){
			File [] list = file.listFiles();
			System.out.println(args[0] + " ���丮 ���� ��� ��� ====== ");
			for(int i = 0; i < list.length ; i++){
				if(list[i].isFile()){
					System.out.println(list[i].getName()+"\t"+list[i].length());
					System.out.println();
				}else{
					System.out.println(list[i].getName()+"\t"+list[i].length());
					System.out.println();
				}
			}
		}else{
			System.out.println(args[0] + " ���丮 ���� ��� ��� ====== ");
			System.out.println("����ũ�� : "+file.length());
			System.out.println("�ϱ�Ӽ� : "+file.canRead());
			System.out.println("����Ӽ� : "+file.canWrite());
			System.out.println("���ϰ�� : "+file.getParent());
			System.out.println("����Ӽ� : "+file.isHidden());
		}
	}
}
