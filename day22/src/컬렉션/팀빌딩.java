package 컬렉션;

import java.util.HashSet;

public class 팀빌딩 {

	public static void main(String[] args) {
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("디자이너");
		System.out.println(team.size());
		System.out.println(team);
	}

}
