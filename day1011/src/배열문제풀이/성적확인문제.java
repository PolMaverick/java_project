package 배열문제풀이;

public class 성적확인문제 {

	public static void main(String[] args) {
		String[] subject = { "컴퓨터", "국어", "수학", "영어", "체육" };
		int[] term1 =  {77, 88, 99, 80, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		
		// 1. 성적이 2학기 향상된 과목의 수를 카운트해보세요.
		int improve = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				improve++;
			}
		}
		System.out.println("2학기에 향상된 과목수는 " + improve + "과목");
		
		// 2. 성적이 1, 2학기 동일한 과목의 수를 카운트해보세요.
		int same = 0;
		int location = -1; // 아래 for문의 i를 저장해주는 변수 선언. 
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				same++;
				location = i; // for문 안에 있는 i를 for문 밖에 있는 변수 location에 넣어주는 작업!!!!
			}
		}
		System.out.println("1, 2학기 성적이 동일한 과목수는 " + same + "과목");
		
		// 3. 성적이 1, 2학기 동일한 과목명을 프린트해보세요.
		if (location != -1) {
			System.out.println("1, 2학기 성적이 동일 과목명은 " + subject[location]); // 여러개일 때 인식을 못하니 그럴땐 위의 for안으로 넣어준다.
			// 없을 경우엔 위의 location에 절대 올수없는 수를 넣는다. ex)-1
		} else {
			System.out.println("동일한 과목이 없습니다.");
		}
		
	}
	
}
