package 자바입출력;

public class 기본입출력7 {

	public static void main(String[] args) {
		//시작은 100부터 값. 500이 되기 전까지 전체를 더해보세요!
		int sum = 0; // 모두 더해주는 변수 초기화
		int i = 100; // 카운트 초기값
		while (true) { // 반복할 조건
			sum += i; // 더해주는 식
			i++; // i값 증가
			if (i == 500) break;
		}
		System.out.println(sum);
	}
}
