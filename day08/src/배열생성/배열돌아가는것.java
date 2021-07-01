package 배열생성;

public class 배열돌아가는것 {

	public static void main(String[] args) {
		int[] s = new int[5]; // {0, 0, 0, 0, 0}
							  // s[0], s[1], s[2], ~~
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		s[0] = 0;
		s[1] = 1;
		s[2] = 2;
		s[3] = 3;
		s[4] = 4;
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}

	}

}
