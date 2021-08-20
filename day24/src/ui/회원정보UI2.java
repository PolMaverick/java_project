package ui;

import javax.swing.JOptionPane;
import db.회원DAO2;
import dto.회원bag;

public class 회원정보UI2 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("회원 가입 ID 입력");
		String pw = JOptionPane.showInputDialog("회원 가입 PW 입력");
		String name = JOptionPane.showInputDialog("회원 가입 name 입력");
		String tel = JOptionPane.showInputDialog("회원 가입 tel 입력");
		
		회원DAO2 dao2 = new 회원DAO2();
		회원bag bag = new 회원bag();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		dao2.create(bag);
		System.out.println("DAO의 create() 하고 연이어 실행됨."); // 1) 회원정보ui.java의 jop으로 받고 (메인이 회원정보ui.java에 있음)
		 													 // 2) 회원가입DAO dao 변수로 넣고
															 // 3) dao.create() 해달라 요청
															 // 4) 회원가입dao 가서 순차적으로 실행 (회원정보ui.java는 db처리가 불가능이니까)
														     // 5) 다시 회원가입ui.java로 돌아와서 출력 (반복)

	}

}
