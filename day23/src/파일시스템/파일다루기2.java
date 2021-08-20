package 파일시스템;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291"); // \\는 두개, /는 1개 쓰기
		// jdk 폴더 아래 몇개가 있는지 프린트
		// 무엇이 있는지 프린트해보고, 폴더인지/파일인지 프린트
		boolean result = file.exists();
		if (result) {
			System.out.println("파일이나 폴더 존재");
			if (file.isDirectory()) {
				System.out.println("폴더");
			} else {
				System.out.println("파일");
			}
		} else {
			System.out.println("파일이나 폴더 존재하지 않음");
		}
		
		File[] list = file.listFiles();
		System.out.println(list.length);
		for (File file2 : list) {
			System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("폴더");
			} else {
				System.out.println("파일");
			}
		}
		
	} // 메인

} // 클래스
