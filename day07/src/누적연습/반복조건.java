package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {
		// 1-10에서 3의 배수를 모두 더하라
		int sum1 = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				sum1 = sum1 + i;
			}
			
		}
		System.out.println(sum1);

		// 1-10에서 3의 배수만 빼고 모두 더하라
		int sum2 = 0; // 초기화가 되니 sum1으로 써도 되는데 코드가 길어지게 되면 엉킬 확률이 높아서 권장하지 않는다.
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				continue; // 반복문을 계속 하긴 하는데 패스하라는 의미. 자주 사용하진 않지만 기초적인 내용이니 알아둬야한다.
				// 반복문을 계속하라는 의미
				// 조건에 맞는 경우 아래에 있는 코드는 더이상 실행 x
				// 쉽게말해 exclude, 제외의 의미.
			}
			if (sum2 > 20) {
				System.out.println("20보다 합이 크므로 stop!");
				break;
			
			}
			sum2 = sum2 + i;
			
		}
		System.out.println(sum2);
		
	}

}
