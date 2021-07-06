package 배열문제풀이;

public class 참조형복사 {

	public static void main(String[] args) {
		// 변수에 들어있는 주소를 복사
		// 참조형 복사를 얕은 복사라 한다. (배열의 주소만 복사) -> 원본을 복사하는 깊은 복사가 되어야 한다.
		int[] x = { 1, 2, 3 };
//		int[] y = x; // 참조형 복사 (얕은 복사: 주소만 복사)
		int[] y = x.clone(); // 참조형 복사 (깊은 복사: 주소가 가르키는 값들의 목록을 복사)
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n--원본 x값 수정 후--"); //  \n, \t 엔터나 탭키. \를 escape문자라고 한다.
		x[0] = 9;
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
	}

}
