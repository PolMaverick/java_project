package 클래스사용;

import javax.swing.JOptionPane;

public class 게시물삭제 {

	public static void main(String[] args) {
		//BbsDB.java 생성.
		//crud에 해당하는 메서드를 정의하세요.
		//1. 게시물등록.java를 만들어서 입력후에 BbsDB의 create메서드를 호출하여 전달된 값 프린트
		//2. 게시물삭제.java를 만들어서 입력 후에 BbsDBd의 delete메서드를 호출하여 삭제되었다고 프린트
		String id1 = JOptionPane.showInputDialog("확인을 위해 아이디를 입력해주십시오.");
		String pw1 = JOptionPane.showInputDialog("확인을 위해 글 작성시 입력한 비밀번호 숫자 네자리를 입력해주십시오.");
		
		BbsDB del = new BbsDB();
		del.delete(id1, pw1);
	}

}
