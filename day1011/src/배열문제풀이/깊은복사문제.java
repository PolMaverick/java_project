package 배열문제풀이;

public class 깊은복사문제 {

	public static void main(String[] args) {
		String[] subject = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = { 44, 66, 22, 99, 100 };
		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;
		
		// 0) 전체 1학기, 2학기 성적 프린트
		// 1) 1학기, 2학기 성적 중 동일한 성적과목수
		// 2) 1학기, 2학기 성적 중 오른 과목수
		// 3) 1학기, 2학기 성적 중 오른 과목명
		
		for (int x : term1) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int y : term2) {
			System.out.print(y + " ");			
		}
		
		System.out.println();
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count++;
			}
		}
		System.out.println(count);
		
		int count2 = 0;
		int location = -1;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count2++;
				location = i;
			}
		}
		System.out.println(count2);
		
		if (location != -1) {
			System.out.println(subject[location]);			
		}
		
	}

}
