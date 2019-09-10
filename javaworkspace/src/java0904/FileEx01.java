package java0904;

import java.io.File;

public class FileEx01 {
	public static void main(String[] args) {
		// 파일 객체 생성 :  기존에 존재하는 파일 담기
		File f = new File("c:\\windows\\system.ini"); 
		//경로작성시 역슬래쉬 두개 (이스케이프 문자로 인식하지 않게)
		// 파일 크기
		long size = f.length();
		System.out.println(size);
		
		// 파일 이름
		String name = f.getName();
		System.out.println(name);
		
		//파일 경로
		String path = f.getPath();
		System.out.println(path);
		
		String absPath = f.getAbsolutePath();
		System.out.println(absPath);
		// 상위 폴더 : 부모 디렉토리
		String parent = f.getParent();
		System.out.println(parent);
		// 파일 타입 판별
		if(f.isFile()) System.out.println(f.getAbsolutePath()+"는 파일입니다.");
		else if(f.isDirectory()) System.out.println(f.getAbsolutePath()+"는 폴더 입니다.");
		
		System.out.println("숨김속성 : "+f.isHidden());
		System.out.println("읽기속성 : "+f.canRead());
		System.out.println("쓰기속성 : "+f.canWrite());
		java.util.Date day = new java.util.Date(f.lastModified());
		System.out.println("수정 날짜 : "+day);
		
		// 파일리스트 열기
		File f2 = new File("C:\\Windows\\Temp");
		File[] subfiles = f2.listFiles();
		for(int i =0;i<subfiles.length;i++) {
			System.out.print(subfiles[i].getName());
			System.out.println("\t파일 크기 : " +subfiles[i].length());
		}
		
	}
}
