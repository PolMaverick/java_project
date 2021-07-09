package 클래스사용;

public class BbsDB {
	// 메서드 만들 때 고려점 1)입력값, 2)반환값
	// 입력값에서 정확하게 맞추어하는 것 1)개수, 2)타입, 2)순서
	
	// BbsDB.java 생성.
	// crud에 해당하는 메서드를 정의하세요.
	//
	// 1. 게시물등록.java를 만들어서 입력 후에 BbsDB의 create메서드를 호출하여 전달된 값 프린트
	// 2. 게시물삭제.java를 만들어서 입력 후에 BbsDBd의 delete메서드를 호출하여 삭제되었다고 프린트


	public void create(String title, String contents, String pw1) {
		System.out.println("제목이 " + "'" + title + "'" + " 입니다.");
		System.out.println("내용이 " + "'" + contents + "'" + " 입니다.");
		System.out.println("수정과 삭제를 위한 비밀번호는 " + "'" + pw1 + "'" + "입니다");
		System.out.println("'" + title + " - " + contents + "'" + " 글이 작성되었습니다. 비밀번호는 " + pw1 + "입니다");
	}

	public void delete(String id1, String pw1) {
		if (id1.equals("apple") && pw1.equals("1111")) {
			System.out.println(id1 +"님의 게시물이 삭제 되었습니다.");
		} else {
			System.out.println("게시물 삭제를 실패했습니다.");
		}
		
	}
}
