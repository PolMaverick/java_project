package 자바심화;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class 친구추가문제2 {

	public static void main(String[] args) {
		// 친구목록 들어갈 리스트
		HashMap<String, String> friends = new HashMap<>();
		friends.put("홍길동", "010-1234-5678");
		friends.put("김길동", "010-1234-6789");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("--------------------------");
			System.out.println("1. 친구 리스트 출력 ");
			System.out.println("2. 친구 추가 ");
			System.out.println("3. 친구 삭제 ");
			System.out.println("4. 이름 변경 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴를 선택하시오 >> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else if (choice == 1) { // 1. 친구 리스트 출력
				System.out.println("친구 목록은 " + friends);
				System.out.println();
			}else if (choice == 2) { // 2. 친구 추가
				System.out.print("추가할 친구의 이름을 입력해주세요. >> ");
				String add1 = sc.next();
				System.out.print("추가할 친구의 전화번호를 입력해주세요. >> ");
				String add2 = sc.next();
				int size1 = friends.size(); // 넣기 전에 크기
				friends.put(add1, add2);
				int size2 = friends.size(); // 넣은 후에 크기
				if (size2 > size1) {
					System.out.println("친구가 추가 되었습니다.");
				}
				System.out.println("친구 목록은 " + friends); // 목록 확인할 경우 사용
				System.out.println();
			}else if (choice == 3) { // 3. 친구 삭제
				System.out.println("삭제할 친구의 이름을 골라주세요.");
				System.out.println("친구 목록은 " + friends);
				System.out.print("삭제할 친구의 이름으로 삭제하시면 1, 전화번호로 삭제하시면 2를 입력해주세요. >> ");
				int option = sc.nextInt() - 1;
				if (option == 0) {
					System.out.print("삭제할 친구의 이름을 입력해주세요. >> ");
					String del = sc.next();
					friends.remove(del);
					if (!friends.containsKey(del)) {
						System.out.println("삭제가 완료되었습니다.");
					}
				}else if (option == 1) {
					System.out.print("삭제할 친구의 전화번호를 입력해주세요. >> ");
					String del = sc.next();
					friends.values().removeAll(Collections.singleton(del));
					if (!friends.containsKey(del)) {
						System.out.println("삭제가 완료되었습니다.");
					}
				}else {
					System.out.println("해당 숫자가 없습니다. 다시 입력하세요");
				}
				System.out.println("친구 목록은 " + friends);
				System.out.println();
			}else if (choice == 4) { // 4. 전화번호 변경
				System.out.println("변경할 친구의 이름을 골라주세요.");
				System.out.println("친구 목록은 " + friends);
				System.out.print("변경할 친구의 이름을 입력하세요 >> ");
				String name = sc.next();
				System.out.print("변경할 전화번호를 입력하세요 >> ");
				String tel = sc.next();
				friends.put(name, tel);
				System.out.println("친구 목록은 " + friends);
				System.out.println();
			}else { // 1-4, 9도 아닌 경우
				JOptionPane.showInputDialog(null, "해당 숫자가 없습니다. 다시 입력하세요");
				System.out.println();
			}
		}
		sc.close();
	}
}
