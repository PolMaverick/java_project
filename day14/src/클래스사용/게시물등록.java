package 클래스사용;

import javax.swing.JOptionPane;

public class 게시물등록 {

	public static void main(String[] args) {
		// BbsDB.java 생성.
		// crud에 해당하는 메서드를 정의하세요.
		// 1. 게시물등록.java를 만들어서 입력후에 BbsDB의 create메서드를 호출하여 전달된 값 프린트
		// 2. 게시물삭제.java를 만들어서 입력 후에 BbsDBd의 delete메서드를 호출하여 삭제되었다고 프린트
		String title = JOptionPane.showInputDialog("제목 입력하십시오.");
		String contents = JOptionPane.showInputDialog("내용 입력하십시오.");
		String pw1 = JOptionPane.showInputDialog("비밀번호 숫자 네자리 입력하십시오.");
		
		BbsDB write = new BbsDB();
		write.create(title, contents, pw1);
	}

}
