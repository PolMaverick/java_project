package 조건문;

public class 조건문1 {

	public static void main(String[] args) {
		// 1. 입력
		int grade = 66;
		
		// 2. 처리
		String result = null; // 선언: 형식 쓰고 이름 붙이기. 램에 공간이 할당. 4바이트 만들어짐.
		// null을 넣어서 램 공간을 아주 깨끗하게 할당.
		// 처음에 공간을 할당할 때 쓰레기 값이 들어있는 공간이 할당이 됨.
		// 쓰레기 값은 프린트도 안되고, 연산도 불가능
		// 공간을 깨끗하게 작업을 처음에 초기에 해두는 것이 좋다.
		// 이를 '변수의 초기화 라고 한다.
		// System.out.println(result); syso으로 수시로 찍어보며 확인
		if (grade >= 90) {
			result = "A학점";
		}else if (grade >= 80) {
			result = "B학점";
		}else if (grade >= 70) {
			result = "C학점";
		}else {
			result = "F학점";
		}
		
		// 3. 출력
		System.out.println("당신의 학점은 " + result + " 입니다.");

	}

}
