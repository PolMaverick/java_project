package shop.ui;

import javax.swing.JOptionPane;
import shop.db.게시판DAO;
import shop.dto.게시판bag;


public class 게시판정보UI {

	public static void main(String[] args) {
		// 1. 게시판 정보 입력 받아서,
		// 2. 가방을 만들어서, 입력받은 데이터를 넣으세요.
		// 3. DAO를 만들어서 DAO에게 create 기능을 호출 (가방을 전달)
		
		// 1.
		String id = JOptionPane.showInputDialog("게시판 id");
		String title= JOptionPane.showInputDialog("게시판 title");
		String content = JOptionPane.showInputDialog("게시판 content");
		String writer = JOptionPane.showInputDialog("게시판 writer");
		
		// 2.
		게시판bag bag = new 게시판bag();
		bag.setId(id);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		
		// 3.
		게시판DAO dao = new 게시판DAO();
		dao.create(bag);
		System.out.println("DAO의 create() 하고 연이어 실행됨");

	}

}
