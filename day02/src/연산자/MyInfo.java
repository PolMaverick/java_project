package 연산자;

public class MyInfo {

	public static void main(String[] args) {
		// 나에 대한 정보
		// 내이름, 내나이, 내키, 성별, 점심 여부
		
		// 부품은 무조건 대문자로
		String name = "변승원"; // 스트링(문자열)
		int age = 100;
		double height = 99.9;
		char gender = 'M';
		boolean food = true; // false, 부울렌
		
		System.out.println(name);
		System.out.println(age + 1);
		System.out.println(height);
		
		// height - 10; <- 출력이 되지 않음. 엡데이트를 해야한다. RAM에 다시 저장되도록 아래처럼 업데이트를 해준다.
		height = height - 10;
		System.out.println(height);
		
		
	}

}
