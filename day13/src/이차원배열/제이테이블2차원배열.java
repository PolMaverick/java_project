package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 제이테이블2차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		// 제목
		String[] title = { "컴퓨터", "영어", "수학", "체육" };

		// 내용
		String[][] contents = {
				{ "100", "88", "99", "77" },
				{ "68", "78", "86", "89" },
				{ "80", "75", "90", "93" },
				{ "92", "95", "94", "89" },
				{ "100", "88", "99", "77" },
				{ "68", "78", "86", "89" },
				{ "80", "75", "90", "93" },
				{ "92", "95", "94", "89" },
				{ "100", "88", "99", "77" },
				{ "68", "78", "86", "89" },
				{ "80", "75", "90", "93" },
				{ "92", "95", "94", "89" },
				{ "100", "88", "99", "77" },
				{ "68", "78", "86", "89" },
				{ "80", "75", "90", "93" },
				{ "92", "95", "94", "89" },
				{ "100", "88", "99", "77" },
				{ "68", "78", "86", "89" },
				{ "80", "75", "90", "93" },
				{ "92", "95", "94", "89" }
		};
		JTable table = new JTable(contents, title);
		JScrollPane scroll = new JScrollPane(table); // scroll이 없으면 title이 사라진다. table을 scroll에 끼우고 scroll을 f에 add해준다.
		f.add(scroll);
		f.setVisible(true);
	}

}
