package 배열생성;

public class 목록값들을처음에알고있는경우 {

	public static void main(String[] args) {
		// 배열을 만들 때는 처음부터 값들을 알고있는 경우 / 모르고 있는 경우 다르게 써야한다.
		// foreach문은 값을 넣어줄 수 없다. 출력용으로 꺼낼 때 사용한다. 더 선호.
		String[] names = {"홍길동", "송길동", "정길동", "박길동", "장길동"}; // 알고 있는 경우 {}를 사용.
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String s : names) {
			System.out.println(s);
		}
		
		
		int[] ages = {100, 88, 55, 10, 4};
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		for (int x : ages) { // 여기서 i는 index가 아니고 int여서 헷갈리기 때문에 x로 바꿔준다. foreach는 반복이라 다음으로 넘어감. 1번의 선언과 5번의 처리.
			System.out.println(x);
		}
		
		
		double[] eyes = {2.0, 1.5, 1.2, 0.8, 1.0};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		for (double d : eyes) {
			System.out.println(d);
		}
		
		
		char[] genders = {'남', '여', '남', '여', '남'};
		for (int i = 0; i < genders.length; i++) {
			System.out.println(genders[i]);
		}
		for (char c : genders) {
			System.out.println(c);
		}
		
		
		boolean[] food = {true, false, true, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		for (boolean b : food) {
			System.out.println(b);
		}
		
		
	}

}
