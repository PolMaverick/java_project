package 알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 랜덤최소값 {

	public static void main(String[] args) {
		// ** 1-1000까지의 값을 랜덤하게 10000개 만들어서
		// 1. 최소값을 찾아보세요!
		// 2. 개수를 세어보세요!
		// 3. 위치값을 찾아보세요!
		
		Random r = new Random(100);
		int[] s = new int[10000]; 
//		int min = s[0];
//		int count = 0;
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000) + 1;
//			if (s[i] < min) {
//				min = s[i];
//			}
		}
		int min = s[0];
		int count = 0;
		for (int i = 1; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		System.out.println("최소값은 " + min);
		
		String result = "";
		for (int i = 0; i < s.length; i++) { // 다시 찾는 이유는 위의 for문에서는 min의 값이 계속 갱신하기 때문에 밑에 다시 써줘서 count를 구한다.
			if (s[i] == min) {
				count++;
				result += i + " "; // result = result + i + ""; 와 같다.
			}
		}
		System.out.println("최소값인 " + min + "의 개수는 " + count + "개");
		System.out.println(result);
		
		// 파괴함수를 써서 정렬 후 최소값/최대값을 찾아보자.
		Arrays.sort(s);
		System.out.println(s[0]);
		System.out.println(s[s.length-1]);
		
	}

}
