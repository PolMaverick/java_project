package 조건문;

public class 조건문1 {

	public static void main(String[] args) {
		// 1. 입력
		int grade = 30;
		
		// 2. 처리: 학점 부여.
		// 처리에서 syso 처리 하지 않고 변수로 넣어 주는 이유는 수많은 샘플이 있을 경우 모두 일일이 바꿔줘야 하지만 변수로 넣어주면 출력만 한번 바꿔주면 되기 때문
		// 왜 if를 계속 반복하는 방법으로 안하는지? 그럴 경우 마지막까지 모두 다 확인하기 때문에. 위에서 만족해서 그만 두는 경우라면 else if로 가야한다.
		String result = null; // 변수를 선언할 때 깔끔하게 처리 되도록 초기값을 넣어주는 것이 좋다. 기본형이 아니면 깨끗하다는 의미로 null을 입력. 변수의 초기화를 해주는 습관기르기!!!
		if (grade >= 90) {
			result = "A학점";
		}else if (grade >= 80) {
			result = "B학점";
		}else if (grade >= 70) {
			result = "C학점";
		}else {
			result = "D학점";
		}
		
		
		// 3. 출력
		System.out.println(result);

	}

}
