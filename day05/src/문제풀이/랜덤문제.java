package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제 {

	public static void main(String[] args) { // 주석을 달 때 무엇을 의미하는지가 아닌 함수, 기능에 중점을 둬서 달기!!!!!!!
		// 1. 랜덤문제
		// 랜덤한 숫자를 2개 발생시켜서
		// 첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요!
		// 두번째 랜덤한 숫자가 더 크면 두번째가 더 커요!
		Random r = new Random(); // new를 통해 ram에 랜덤값을 계속 쓸 수 있도록 복사해서 부품을 만들어 준 것!!!!
		int num = r.nextInt(100); // 0-99의 숫자 중 랜덤 값을 변수 num에 저장
		int num2 = r.nextInt(100); // 두번째 숫자의 범위
		System.out.println(num); // 첫번째 숫자의 출력
		System.out.println(num2); // 두번째 숫자의 출력
		
		if (num > num2) { // 첫번째가 두번째보다 크다면
			System.out.println("첫번째가 더 커요!"); // 첫번째가 더 크다는 메세지창
		}
		if (num2 > num) { // 두번째가 첫번째보다 크다면
			System.out.println("두번째가 더 커요!"); // 두번째가 더 크다는 메세지창
		}
		
	}
	
}
