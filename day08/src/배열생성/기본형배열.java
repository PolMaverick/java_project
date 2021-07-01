package 배열생성;

public class 기본형배열 {

	public static void main(String[] args) {
		// int[] 변수명; int로 만들어진 배열을 가르키는 주소가 변수명에 들어간다. 지역변수 <-> 전역변수. 지역변수는 문제가 생기지 않도록 반드시 초기화한다.
		int[] s = new int[10]; // [] 나오면 배열
		double[] s2 = new double[5];
		String[] s3 = new String[100];
		// main을 벗어날 수 없다. main은 시동만 걸어주는 역할이니 main을 넘어가게 되면 이 배열을 사용불가.
		
		// 배열은 자동초기화 시켜줌.
		System.out.println(s); // 주소가 나온다.
		System.out.println(s[0]); // 주소가 나온다.
		System.out.println(s2); // 주소가 나온다.
		System.out.println(s3); // 주소가 나온다.
		System.out.println(s3[0]); // 공간만 잡고 아무 것도 넣지 않아서 null이라고 뜬다.
	}

}
