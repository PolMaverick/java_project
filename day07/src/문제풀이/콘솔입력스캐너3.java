package 문제풀이;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 콘솔입력스캐너3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 수학 점수는 얼마입니까?>>> ");
		int math = sc.nextInt();
		double math2 = (math * 0.3);
		System.out.println(math2);
		
		System.out.print("당신의 과학 점수는 얼마입니까?>>> ");
		int sci = sc.nextInt();
		double sci2 = (sci * 0.5);
		System.out.println(sci2);
		
		System.out.print("당신의 영어 점수는 얼마입니까?>>> ");
		int eng = sc.nextInt();
		double eng2 = (eng * 0.2);
		System.out.println(eng2);
		
		double total = (math2 + sci2 + eng2);
		System.out.println(total);
		
		if (total >= 90) {
			JOptionPane.showMessageDialog(null, total + "점 최우수입니다.");
		} else if (total >= 80) {
			JOptionPane.showMessageDialog(null, total + "점 우수입니다.");
		} else if (total >= 70) {
			JOptionPane.showMessageDialog(null, total + "점 우수입니다.");			
		} else {
			JOptionPane.showMessageDialog(null, total + "점 미달입니다.");
		}
	}

}
