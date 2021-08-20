package 자바심화2;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		int kang = 0;
		int cheon = 0;
		int paju = 0;
		int jeju = 0;
		int chung = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------콘도 예약을 진행합니다.------------");
			System.out.println("");
			System.out.println("원하는 지역을 신청해주세요(각 지역은 2명까지 신청가능)");
			System.out.println("-----------------------------------------");
			System.out.println("1) 강원도 2) 전라도 3) 파주 4)제주도 5)충청도");
			System.out.println("1)   "+ kang + "  2)   " + cheon + "  3)   " + paju + "  4)  " + jeju + "  5)  " + chung);
			System.out.println("=========================================");
			System.out.print("원하시는 지역코드를 입력하세요. (종료는 0) >> ");
			int option = sc.nextInt();
			if (option == 0) {
				System.out.println("시스템이 종료되었습니다..");
				break;
			} else if (option == 1) {
				if (kang >= 2) {
					System.out.println("이미 인원이 초과되어 신청이 불가능 합니다.");
					System.out.println("다른 지역을 신청해주세요.");
					System.out.println("");
				} else if (kang < 2) {
					kang++;
					System.out.println("신청 가능합니다.");
					System.out.println("신청 완료되었습니다.");
					System.out.println("");
				}
			}else if (option == 2) {
				if (cheon >= 2) {
					System.out.println("이미 인원이 초과되어 신청이 불가능 합니다.");
					System.out.println("다른 지역을 신청해주세요.");
					System.out.println("");
				} else if (cheon < 2) {
					cheon++;
					System.out.println("신청 가능합니다.");
					System.out.println("신청 완료되었습니다.");
					System.out.println("");
				}
			} else if (option == 3) {;
				if (paju >= 2) {
					System.out.println("이미 인원이 초과되어 신청이 불가능 합니다.");
					System.out.println("다른 지역을 신청해주세요.");
					System.out.println("");
				} else if (paju < 2) {
					paju++;
					System.out.println("신청 가능합니다.");
					System.out.println("신청 완료되었습니다.");
					System.out.println("");
				}
			} else if (option == 4) {
				if (jeju >= 2) {
					System.out.println("이미 인원이 초과되어 신청이 불가능 합니다.");
					System.out.println("다른 지역을 신청해주세요.");
					System.out.println("");
				} else if (jeju < 2) {
					jeju++;
					System.out.println("신청 가능합니다.");
					System.out.println("신청 완료되었습니다.");
					System.out.println("");
				}
			} else if (option == 5) {
				if (chung >= 2) {
					System.out.println("이미 인원이 초과되어 신청이 불가능 합니다.");
					System.out.println("다른 지역을 신청해주세요.");
					System.out.println("");
				} else if (chung < 2) {
					chung++;
					System.out.println("신청 가능합니다.");
					System.out.println("신청 완료되었습니다.");
					System.out.println("");
				}
			}
		}
		sc.close();
	}
}
