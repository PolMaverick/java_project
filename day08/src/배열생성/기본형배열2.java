package 배열생성;

public class 기본형배열2 {

	public static void main(String[] args) {
		// int[] : int배열을 가르키는 주소가 들어간다는 의미.
		// s : 힙영역에 할당된 저장공간의 주소가 들어간다. 참조형변수
		// = : 힙영역에 할당된 저장공간의 주소를 변수에 넣는다.
		// new : 힙영역에 지정된 타입의 크기만큼 배열을 만들어라.
		// int[10] : 배열로 만들어질 타입과 크기가 설정
		
		int[] s = new int[10];
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " "); // 반복문과 배열이 짝이 이유 
			// 배열은 자동 초기화
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + 1 + " "); // 원핫인코딩 - 0을 1로 바꾸는 코딩 (ex. 영화관 예매, 유튜브 좋아요 싫어요)
		}

	}

}


// 변수의 종류
// - 변수에 저장되는 것
//	1) 기본형변수(값): 정수, 실수, 문자1, 논리  - Primitive variable
//	2) 참조형변수(주소): 나머지 다! (배열, 클래스, ....) - Reference(derived) Variable