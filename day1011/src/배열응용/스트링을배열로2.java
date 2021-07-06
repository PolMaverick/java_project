package 배열응용;

import java.util.Arrays;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		// String에 포함되어 있는 공백을 제거할 때는 trim을 사용해라.
		String s1 = "    감자    ";
		System.out.println(s1.length()); // 3글자. 공백 제거해야한다.
		String s2 = s1.trim(); // 공백제거
		System.out.println(s2.length());
		
		// String에 포함되어 있는 공백을 공백 없음으로 대체할 때엔 replace 사용해라
		String s3 = s1.replace("    ", "");
		System.out.println(s3.length());
		
		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파  ";
		// 비파괴함수 (원본을 건드리지 않음)
		System.out.println(data.length());
		String data2 = data.trim(); // 비파괴 함수. 대부분이 비파괴 함수.
		System.out.println(data2);
		System.out.println(data2.length());
		String data3 = data2.replace(" ", ""); // 비파괴 함수. 대부분이 비파괴 함수.
		System.out.println(data3);
		
		int[] num = {1, 2, 5, 10, 4, 20};
		Arrays.sort(num); // sort라는 함수가 원본을 바꿔버린다. 파괴함수. 몇개 없음.
		for (int i : num) {
			System.out.print(i + " ");
		}
		
	}

}