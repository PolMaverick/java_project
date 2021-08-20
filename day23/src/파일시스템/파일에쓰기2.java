package 파일시스템;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class 파일에쓰기2 {

	public static void main(String[] args) {
		try {
			// 1. test2.txt 스트링을 file 객체로 만들어준다.
			// 2. test2.txt 파일과 java 프로그램간에 stream까지 만들어준다.
			String day = JOptionPane.showInputDialog("날짜입력");
			String title = JOptionPane.showInputDialog("제목입력");
			String content = JOptionPane.showInputDialog("내용입력");
			String weather = JOptionPane.showInputDialog("날씨입력");
			FileWriter file = new FileWriter(day + ".txt");// 파일을 불러오며 저장까지. 반대는 FileReader
			// 3. stream으로 데이터를 보내면 된다.
			file.write(day + "\n"); // \n -> 엔터 입력
			file.write(title + "\n"); // \n -> 엔터 입력
			file.write(content + "\n"); // \n -> 엔터 입력
			file.write(weather + "\n"); // \n -> 엔터 입력
			file.close(); // 끝났다고 인식하고 내용을 저장한다. 반드시 닫기!!!
			JOptionPane.showMessageDialog(null, "일기가 기록됨");
		} catch (IOException e) {
			System.out.println("파일 저장하는 동안 에러가 발생함");
		}
		
	}

}
