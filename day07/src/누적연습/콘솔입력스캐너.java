package 누적연습;
// java.util.a.Test; *로 하위까지 다 불러와주는 것은 아님. 주의!!!!


import java.util.*;
// import java.util.a.Test;

public class 콘솔입력스캐너 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner는 JFrame이나 Random 같이 ()안이 선택이 아닌 필수로 채워줘야한다.
		
		System.out.print("당신의 이름을 입력하시오.>>>>> ");
		String name = sc.next(); // .next();는 String 입력(단어) //next는 한줄을 다 가져오는 것이 아닌 단어만 가지고 오기 때문에 공백이 있으면 공백 뒤로는 무시한다.
		System.out.println("당신의 이름은 " + name);
		
		System.out.print("당신의 소속을 입력하시오.>>>>> ");
		String comp = sc.next(); // .next();는 String 입력(단어) //next는 한줄을 다 가져오는 것이 아닌 단어만 가지고 오기 때문에 공백이 있으면 공백 뒤로는 무시한다.
		System.out.println("당신의 소속은 " + comp);
		
		
	}

}
