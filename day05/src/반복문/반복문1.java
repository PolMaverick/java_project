package 반복문;

public class 반복문1 {

	public static void main(String[] args) {
		// 반복문 안에 들어가는 변수는 횟수를 카운트할 때도 사용하고
		// 변수에 들어있는 값을 가지고 처리할 대도 사용한다.
		// 2가지 경우가 있음.
		// i++ ==> i = i + 1
		// 1부터 5까지 반복해서 찍어보자.
		for (int i = 1; i <= 5; i++) { // 횟수가 보이는 코드가 좋은 코드.
			System.out.println(i);
		}
		
		// 1부터 10까지 중 2씩 점프해서 찍어보자.
		for (int i = 1; i <= 10; i = i + 2) { // 횟수가 보이는 코드가 좋은 코드.
			System.out.println(i);
		}
		
		// 1부터 100까지 중 5씩 점프해서 찍어보자.
		for (int i = 1; i <= 100; i = i + 5) { // 횟수가 보이는 코드가 좋은 코드.
			System.out.println(i);
		}
		
		// 100부터 1까지 1씩 점프해서 찍어보자.
		for (int i = 100; i >= 1; i--) { // 줄어들 때엔 부등호를 반대로 해준다.
			System.out.println(i);
		}
		
		// 1000부터 0까지 8씩 점프해서 찍어보자.
		for (int i = 1000; i >= 0; i = i - 8) {
			System.out.println(i);
		}
	}

}
