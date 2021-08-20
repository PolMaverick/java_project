package 파일시스템;

import java.io.FileWriter;
import java.io.IOException;


public class 파일에쓰기 {

	public static void main(String[] args) {
		try {
			// 1. test2.txt 스트링을 file 객체로 만들어준다.
			// 2. test2.txt 파일과 java 프로그램간에 stream까지 만들어준다.
			FileWriter file = new FileWriter("test2.txt");// 파일을 불러오며 저장까지. 반대는 FileReader
			// 3. stream으로 데이터를 보내면 된다.
			file.write("hello" + "\n"); // \n -> 엔터 입력
			file.write("hi" + "\n");
			file.close(); // 끝났다고 인식하고 내용을 저장한다. 반드시 닫기!!!
		} catch (IOException e) {
			System.out.println("파일 저장하는 동안 에러가 발생함");
		}
		
	}

}
