package dto;

public class DTOTest2 {

	public static void main(String[] args) {
		// 게시판Bag을 2개 만들어서, 값들을 넣어보시고, 넣은 값들을 프린트 해보세요. toString()
		// 그림 그려보세요.
		// 메모리 그림
		// bag[주소] <---- id[null] -> [게시번호]
		//				  title[null] -> [제목]
		//				  content[null] -> [내용]
		//				  writer[null] -> [글쓴이]
		게시판bag bag = new 게시판bag();
		bag.setId("게시번호");
		bag.setTitle("제목");
		bag.setContent("내용");
		bag.setWriter("글쓴이");
		System.out.println(bag);
		
		게시판bag bag2 = new 게시판bag();
		bag2.setId("게시번호2");
		bag2.setTitle("제목2");
		bag2.setContent("내용2");
		bag2.setWriter("글쓴이2");
		System.out.println(bag2);

	}

}
