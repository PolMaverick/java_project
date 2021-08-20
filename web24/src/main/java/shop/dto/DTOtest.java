package shop.dto;

public class DTOtest {

	public static void main(String[] args) {
		회원bag bag = new 회원bag();
//		bag.id = "apple"; bag.java에서 setters getter를 사용해서 이렇게 쓰면 에러나고 받아오지 못한다. 
//		bag.pw = "apple"; 
//		bag.name = "apple"; 
//		bag.tel = "apple"; 
		bag.setId("apple");
		bag.setPw("apple");
		bag.setName("apple");
		bag.setTel("apple");
		System.out.println(bag);
		
		회원bag bag2 = new 회원bag();
//		bag2.id = "melon"; 
//		bag2.pw = "melon"; 
//		bag2.name = "melon"; 
//		bag2.tel = "melon"; 
		bag2.setId("melon");
		bag2.setPw("melon");
		bag2.setName("melon");
		bag2.setTel("melon");
		System.out.println(bag2);

	}

}
