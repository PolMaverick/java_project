package 문제풀이;

import javax.swing.JOptionPane;

public class 문제생성및풀이 {

	public static void main(String[] args) {
		// 1. 학생ID 입력: 정163
		//    학생ID 중 첫글자가 '생'인경우 '생물학과입니다.'
		//	 				 '물'인 경우 '물리학과입니다.'
		//	 				 '화'인 경우 '화학과입니다.'
		//					 그 외의 경우 '이과대학이 아닙니다.'
		//                   메세지가 뜨도록

		// id 중 두번째, 세번째 글자의 조합이 '16'인 경우 '16학번입니다.'
		//		                        '17'인 경우 '17학번입니다.'
		//		                        '18'인 경우 '18학번입니다.'
		//		                        '19'인 경우 '19학번입니다.'
		//								그 외의 경우 '정확한 학번이 아닙니다.'
		//                 				메세지가 뜨도록

		// id 중 네번째 숫자가 '1'인 경우 '1학년입니다.'
		//          		'2'인경우 '2학년입니다.'
		//					'3'인경우 '3학년입니다.'
		//					'4'인경우 '4학년입니다.'
		//					그 외의 경우 '졸업생입니다.'
		//                   메세지가 뜨도록
		
		String stuid = JOptionPane.showInputDialog("학생 ID를 입력하세요"); // 학생id 입력창
		char major = stuid.charAt(0); // ID 첫자리는 전공
		String clas = stuid.substring(1, 3); // ID 두번째, 세번재 자리는 학번. index 시작점부터 끝점 미만. 보통 언어에서 범위는 미만
		char grade = stuid.charAt(3); // ID 네번째 자리는 학년
		
		
		switch (major) { // 전공 case 중 일치하는 값을 찾아 해당 명령어 처리 
		case '생': // 생인 경우
			JOptionPane.showMessageDialog(null, "생물학과입니다.");; // 생물학과 메세지창
			break;
			
		case '물': // 물인 경우
			JOptionPane.showMessageDialog(null, "물리학과입니다."); // 물리학과 메세지창
			break;
			
		case '화': // 화인 경우
			JOptionPane.showMessageDialog(null, "화학과입니다."); // 화학과 메세지창
			break;

		default: // 그 외의 경우
			JOptionPane.showMessageDialog(null, "이과대학이 아닙니다."); // 이과대학 아니라는 메세지창
			break;
		}
		
		
		switch (clas) { // 학번 case 중 일치하는 값을 찾아 해당 명령어 처리 
		case "16": // 16인 경우
			JOptionPane.showMessageDialog(null, "16학번입니다."); // 16학번 메세지창
			break;
			
		case "17": // 17인 경우
			JOptionPane.showMessageDialog(null, "17학번입니다."); // 17학번 메세지창
			break;
			
		case "18": // 18인 경우
			JOptionPane.showMessageDialog(null, "18학번입니다."); // 18학번 메세지창
			break;
			
		case "19": // 19인 경우
			JOptionPane.showMessageDialog(null, "19학번입니다."); // 19학번 메세지창
			break;
			
		default: // 그 외의 경우
			JOptionPane.showMessageDialog(null, "정확한 학번이 아닙니다."); // 무학번 메세지창
			break;
		}
		
		
		switch (grade) { // 학년 case 중 일치하는 값을 찾아 해당 명령어 처리 
		case '1': // 1인 경우
			JOptionPane.showMessageDialog(null, "1학년입니다."); // 1학년 메세지창
			break;
			
		case '2': // 2인 경우
			JOptionPane.showMessageDialog(null, "2학년입니다."); // 2학년 메세지창
			break;
			
		case '3': // 3인 경우
			JOptionPane.showMessageDialog(null, "3학년입니다."); // 3학년 메세지창
			break;
			
		case '4': // 4인 경우
			JOptionPane.showMessageDialog(null, "4학년입니다."); // 4학년 메세지창
			break;

		default: // 그 외의 경우
			JOptionPane.showMessageDialog(null, "졸업생입니다."); // 졸업생 메세지창
			break;
		}
		
	}

}
