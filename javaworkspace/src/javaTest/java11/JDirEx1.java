package javaTest.java11;
import java.io.*;
import java.util.*;
class  JDirEx1{
	public static void main(String[] args)throws Exception {
		if(args.length != 1){
			System.out.println("사용법 : java JDirEx c:\\abx.txt");
			System.exit(1);
		}
		File file = new File(args[0]);
		if(!file.exists()){
			System.out.println(args[0]+" 파일이 존재하지 않습니다.");
			System.exit(1);
		}
		System.out.println("절대 경로 : "+file.getAbsolutePath());
		System.out.println("상대 경로 : "+file.getCanonicalPath());
		System.out.println("생성일 : "+new Date(file.lastModified()));
		if(file.isDirectory()){
			File [] list = file.listFiles();
			System.out.println(args[0] + " 디렉토리 파일 목록 출력 ====== ");
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
			System.out.println(args[0] + " 디렉토리 파일 목록 출력 ====== ");
			System.out.println("파일크기 : "+file.length());
			System.out.println("일기속성 : "+file.canRead());
			System.out.println("쓰기속성 : "+file.canWrite());
			System.out.println("파일경로 : "+file.getParent());
			System.out.println("숨김속성 : "+file.isHidden());
		}
	}
}
