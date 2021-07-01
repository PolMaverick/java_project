package 문제풀이;

public class 점프해서누적 {

	public static void main(String[] args) {
		// 1. 33-222까지 모두 더하기
		// 2. 55-4500까지 2씩 점프하면서 더하기
		// 3. 0-6000까지 5씩 점프하면서 더하기
		int sum1 = 0; // 변수명을 sum과 함께 total도 많이 사용한다.
		for (int i = 33; i <= 222; i++) { // i++; => i = i +1;
			sum1 = sum1 + i;
			System.out.println(i + ":" + sum1); // for문이 돌아가는 동안 제대로 값이 나왔는지 확인용. 실무에선 쓸 일이 많이 없음.
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
			System.out.println(i + ":" + sum2);
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 = sum3 + i;
			System.out.println(i + ":" + sum3);
		}
		System.out.println(sum3);

	}

}
