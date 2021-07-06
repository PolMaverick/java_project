package 배열문제풀이;

public class 널포인터익셉션 {

	public static void main(String[] args) {
		String s = null; // 변수는 있지만 스트링은 없는 상황
		System.out.println(s.charAt(0)); // 없는 스트링의 첫째짜리 캐릭터를 가져오라고 해서 에러가 발생
		
		String[] s = new String[10];
		System.out.println(s[0].charAt(0));
		System.out.println("내가 실행되나..");
	}

}
