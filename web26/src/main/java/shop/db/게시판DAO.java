package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import shop.dto.게시판bag;

public class 게시판DAO {
	Connection con; // 전역변수, 클래스 아래에 선언한 변수, 클래스 전체에서 접근하여 사용. 자동초기화
					// 1,2단계를 생성자로 만들어주면서 create, read에 con과 범위가 닿지 않아서 클래스 바로 아래에 전역변수로 선언!
	
	// 생성자 메서드, 생성자(constructor)
	// new키워드로 객체 생성할 때 클래스 이름과 동일한 메서드가 있으면 자동 호출되는 메서드
	// 객체 생성시 자동으로 꼭 해야 하는 작업이 있는 경우, 이 생성자 안에 넣어놓으면 무조건 처리하게 할 수 있다.
	public 게시판DAO() { //db 연결할 때 1,2 단계는 항상 반복되니 생성자를 만들어 짧게 넣어주기 위해!!! refactoring
		try {
			// 에러가 없지만 처리할 때 에러가 날까봐 에러표시가 나는데 try/catch로 처리(블럭 - 소스 - 서라운드위드 - 트라이/캐치)
			//자바와 db연결하는 프로그램(JDBC) 순서
			//1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
								  
			//2. java에서 db로 연결: 
			//   연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, username, password); // 다시 선언해주면 별개가 된다. 선언을 지우고 변수만 적어주면 해결
			System.out.println("2. shop db연결 성공!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	//				중간에 저장할 목적으로 매개체역할을 해주는 변수 (매개변수)
	//				파라메터, parameter
	public void create(게시판bag bag) {
		// 메서드 안에서 만들어진 변수임.
		// 변수는 "타입 변수명;" 만들어짐. (선언!)
		// 선언의 위치가 변수의 생존 범위를 결정함.
		// 위 변수 4개는 create안에서만 생존
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능.
		// 지역변수는 자동초기화X, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 title은 " + bag.getTitle());
		System.out.println("전달된 content는 " + bag.getContent());
		System.out.println("전달된 writer는 " + bag.getWriter());
				
		try { 
			//3. sql문을 만든다.
			String sql = "insert into board values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());
			System.out.println("3. sql문 생성 성공!!!");
					
			//4. sql문을 mysql로 전송한다.
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (SQLException e) {
			System.out.println("2-4번 에러 >> DB 관련된 처리하다 에러 발생!!!"); // 어떤 에러인지 알기 위해 넣어주기
		}
	}
	
	public 게시판bag read(게시판bag bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 title은 " + bag.getTitle());
		System.out.println("전달된 conten는 " + bag.getContent());
		System.out.println("전달된 writer는 " + bag.getWriter());
		ResultSet rs = null; //메서드 안에서 선언된변수는 모두 지역변수
		//지역변수는 초기화를 해주어야 한다. 
		게시판bag bag2 = new 게시판bag();
		try {
			//3. sql문을 만든다.
			String sql = "select * from board where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");
			
			//4. sql문을 mysql로 전송한다.
			//result = ps.executeUpdate(); //cud일 때만 사용 
			 rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			//System.out.println("검색 결과는 >> " + rs.next());
			if(rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1); //apple, rs.getString("id");
				String title = rs.getString(2); //apple
				String content = rs.getString(3); //apple
				String writer = rs.getString(4); //apple
				System.out.println(id + " " + title + " " + content + " " + writer);
				bag2.setId(id);
				bag2.setTitle(title);
				bag2.setContent(content);
				bag2.setWriter(writer);
			}else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (SQLException e) { //2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return bag2;
		
	} //read end.
	
	public ArrayList<게시판bag> read() {
		// DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어줘야한다.
		ArrayList<게시판bag> list = new ArrayList<게시판bag>();
		ResultSet rs = null; //메서드 안에서 선언된변수는 모두 지역변수
		//지역변수는 초기화를 해주어야 한다. 
		
		try {
			//3. sql문을 만든다.
			String sql = "select * from board";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
			
			//4. sql문을 mysql로 전송한다.
			//result = ps.executeUpdate(); //cud일 때만 사용 
			 rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			//System.out.println("검색 결과는 >> " + rs.next());
			while(rs.next()) {
				게시판bag bag2 = new 게시판bag();
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1); //apple, rs.getString("id");
				String title = rs.getString(2); //apple
				String content = rs.getString(3); //apple
				String writer = rs.getString(4); //apple
				System.out.println(id + " " + title + " " + content + " " + writer);
				bag2.setId(id); //  rs.getString(1);도 가능
				bag2.setTitle(title);
				bag2.setContent(content);
				bag2.setWriter(writer);
				System.out.println(bag2); // 제대로 추가 되었나 확인
				list.add(bag2);
				System.out.println(list.size()); // 제대로 추가 되었나 확인
			}
		} catch (SQLException e) { //2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return list;
		
	} //read end.
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

	
}
