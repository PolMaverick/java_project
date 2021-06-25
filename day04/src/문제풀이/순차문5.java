package 문제풀이;

import javax.swing.JOptionPane;
//import java.lang.*; 생략되어 있을뿐

public class 순차문5 {

	public static void main(String[] args) {
		// 내가 먹고 싶은 음식은? 팥빙수
		// 친구가 먹고 싶은 음식은? 팥빙수
		// 아하! 나랑 친구랑 같아요!
		// 크~! 나랑 친구랑 달라요!
		String me = JOptionPane.showInputDialog("내가 먹고 싶은 음식은?");
		String fr = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");
		
		String me2 = "팥빙수";
		String fr2 = "팥빙수";
		
		System.out.println(me.equals(me2));
		System.out.println(fr.equals(fr2));
		System.out.println(me.equals(me2) && fr.equals(fr2));
		
		if (me.equals(me2) && fr.equals(fr2)) {
			JOptionPane.showMessageDialog(null, "아하! 나랑 친구랑 같아요!");
		} else {
			JOptionPane.showMessageDialog(null, "크~! 나랑 친구랑 달라요!");
		}
		
	} // main

} // class
