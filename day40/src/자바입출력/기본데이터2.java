package 자바입출력;

public class 기본데이터2 {

	public static void main(String[] args) {
		byte b = 100;
		int i = b; // 큰 <--- 작, 자동타입변환(자동형변환)

		int i2 = 100;
		byte b2 = (byte)i2; // 작 <--- 큰. 그래서 에러. 강제타입변환(강제형변환)
		
		// 기본형의 캐스팅 
		// 형변환: CPU가 타입을 변환, 캐스팅(casting)
		// RAM에 선언된 타입 변경 불가, 선언할 떄 타입이 결정되기 떄문에 재선언 불가!
		// 캐스팅의 종류 1) 자동, 2) 강제
		
		int i3 = 1000;
		byte b3 = (byte)i3; // byte의 범위에 1000이 포함되지 않아서 캐스팅하면 x.
		System.out.println(b3);
	}

}
