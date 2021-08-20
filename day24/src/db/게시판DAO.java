package db;

import dto.게시판bag;

public class 게시판DAO {

	public void create(게시판bag bag) {
		System.out.println("전달 받은 ID는 " + bag.getId());
		System.out.println("전달 받은 title는 " + bag.getTitle());
		System.out.println("전달 받은 content는 " + bag.getContent());
		System.out.println("전달 받은 writer는 " + bag.getWriter());
	}
	
}
