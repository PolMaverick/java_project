package 자바심화;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class 친구추가문제 {

	public static void main(String[] args) {
		// 친구목록 들어갈 리스트
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김길동");
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
				System.out.println("친구 목록은 " + list);
				System.out.println();
			}else if (choice == 2) { // 2. 친구 추가
				System.out.print("추가할 친구의 이름을 입력해주세요. >> ");
				String add = sc.next();
				int size1 = list.size(); // 넣기 전에 크기
				list.add(add);
				int size2 = list.size(); // 넣은 후에 크기
				if (size2 > size1) {
					System.out.println("친구가 추가 되었습니다.");
				}
				System.out.println("친구 목록은 " + list); // 목록 확인할 경우 사용
				System.out.println();
			}else if (choice == 3) { // 3. 친구 삭제
				System.out.println("삭제할 친구의 이름을 골라주세요.");
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + "번: " + list.get(i));
				}
				System.out.print("삭제할 친구의 번호을 입력해주세요. >> ");
				int num1 = sc.nextInt();
				String name = list.get(num1 - 1);
				list.remove(num1 - 1);
				if (!list.contains(name)) {
					System.out.println("삭제가 완료되었습니다.");
				}
				System.out.println("친구 목록은 " + list);
				System.out.println();
			}else if (choice == 4) { // 4. 이름 변경
				System.out.println("변경할 친구의 이름을 골라주세요.");
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + "번: " + list.get(i));
				}
				System.out.print("변경할 친구의 순서를 번호로 입력하세요 >> ");
				int index = sc.nextInt() - 1;
				System.out.print("친구의 변경할 이름을 입력하세요 >> ");
				String rev = sc.next();
				list.set(index, rev);
				System.out.println("친구 목록은 " + list);
				System.out.println();
			}else { // 1-4, 9도 아닌 경우
				JOptionPane.showInputDialog(null, "해당 숫자가 없습니다. 다시 입력하세요");
				System.out.println();
			}
			
		}
		sc.close();
	}
}
