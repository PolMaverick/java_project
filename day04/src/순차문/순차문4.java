package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		// DB 연결해준 부품은 없기 때문에 mySQL 사용. 일단은 연결되었다 가정하기.
		String id2 = "root"; // 회원가입 시 가입한 ID
		String pw2 = "pass"; // 회원가입 시 가입한 PW
		 // 기본형 데이터가 아니면 연산자를 가지고 비교할 수 없다. 부품을 사용하기.
		System.out.println(id.equals(id2));
		System.out.println(pw.equals(pw2));
		System.out.println(id.equals(id2) && pw.equals(pw2));
		// and 연산자의 경우 중요한 체크를 할 비교를 첫번재에 넣는다. CPU의 부담을 줄여주기 위해.
		// 첫번째 비교에서 false가 나오면, 이후의 비교연산자는 실행되지 않는다.
		// or 연산자는 true가 나올만한 것을 앞에 넣는다. 하나만 맞아도 되기 때문에 뒤의 조건을 체크 하지 않기 때문에.
		
		if (id.equals(id2) && pw.equals(pw2)) {
			JOptionPane.showMessageDialog(null, "로그인 되었습니다."); // int는 없는 의미로 0을 넣고, string은 null을 넣는다.
		} else {
			JOptionPane.showMessageDialog(null, "아이디와 패스워드가 일치하지 않습니다.");
		}
		
		
		
		
		
	} // main

} // class // 마지막에 두개의 }가 있는지 확인하고 }뒤에 main, class 주석 달아주기
