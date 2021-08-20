package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.회원bag;

public class 회원DAO2 {
	
	// 메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	//				중간에 저장할 목적으로 매개체역할을 해주는 변수 (매개변수)
	//				파라메터, parameter
	public int create(회원bag bag) {
		// 메서드 안에서 만들어진 변수임.
		// 변수는 "타입 변수명;" 만들어짐. (선언!)
		// 선언의 위치가 변수의 생존 범위를 결정함.
		// 위 변수 4개는 create안에서만 생존
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능.
		// 지역변수는 자동초기화X, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0; // 지역 변수는 초기화. 메서드 안에서 선언된 변수는 모두 지역변수
		
		try { // 에러가 없지만 처리할 때 에러가 날까봐 에러표시가 나는데 try/catch로 처리(블럭 - 소스 - 서라운드위드 - 트라이/캐치)
			//자바와 db연결하는 프로그램(JDBC) 순서
			//1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			//2. java에서 db로 연결: 
			//   연결할 주소url(ip, port, db명), username, password
			// ?useUnicode=true&characterEncoding=utf8 <-- db에 한글을 제대로 받기위해 url의 db명 뒤에 붙여야한다.
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			//3. sql문을 만든다.
			String sql = "insert into member3 values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			System.out.println("3. sql문 생성 성공!!!");

			//4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러 >> 드라이버 없음!!!"); // 어떤 에러인지 알기 위해 넣어주기
		} catch (SQLException e) {
			System.out.println("2-4번 에러 >> DB 관련된 처리하다 에러 발생!!!"); // 어떤 에러인지 알기 위해 넣어주기
		}
		return result;
		
	}
	
	// 하나의 이름으로 메서드 이름을 쓸수 있다.
	// 입력 값의 형태가 다양한 형태이어야 한다.
	// 다형성(오버로딩)
	public 회원bag read(회원bag bag) {
		// 메서드 안에서 만들어진 변수임.
		// 변수는 "타입 변수명;" 만들어짐. (선언!)
		// 선언의 위치가 변수의 생존 범위를 결정함.
		// 위 변수 4개는 create안에서만 생존
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능.
		// 지역변수는 자동초기화X, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		ResultSet rs = null; // 지역 변수는 초기화. 메서드 안에서 선언된 변수는 모두 지역변수
		회원bag bag2 = new 회원bag();
		
		try { // 에러가 없지만 처리할 때 에러가 날까봐 에러표시가 나는데 try/catch로 처리(블럭 - 소스 - 서라운드위드 - 트라이/캐치)
			//자바와 db연결하는 프로그램(JDBC) 순서
			//1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			//2. java에서 db로 연결: 
			//   연결할 주소url(ip, port, db명), username, password
			// ?useUnicode=true&characterEncoding=utf8 <-- db에 한글을 제대로 받기위해 url의 db명 뒤에 붙여야한다.
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			//3. sql문을 만든다.
			String sql = "select * from member3 where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			//4. sql문을 mysql로 전송한다.
			//result = ps.executeUpdate(); // CUD일 때만 사용
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			//System.out.println("검색 결과는 " + rs.next()); //아래 if문에서 한번 더 해서 아래로 내려가서 없음이 뜸.
			if(rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1); //rs.getString("id"); index와 column명 둘다 가능
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				System.out.println(id + " " + pw + " " + name + " " + tel);
				bag2.setId(id);
				bag2.setPw(pw);
				bag2.setName(name);
				bag2.setTel(tel);
			}else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러 >> 드라이버 없음!!!"); // 어떤 에러인지 알기 위해 넣어주기
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("2-4번 에러 >> DB 관련된 처리하다 에러 발생!!!"); // 어떤 에러인지 알기 위해 넣어주기
			e.printStackTrace();
		}
		return bag2;
		
	}
	
	public ArrayList<회원bag> read() {
		// 메서드 안에서 만들어진 변수임.
		// 변수는 "타입 변수명;" 만들어짐. (선언!)
		// 선언의 위치가 변수의 생존 범위를 결정함.
		// 위 변수 4개는 create안에서만 생존
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능.
		// 지역변수는 자동초기화X, 쓰레기값 들어있는 상태!

		ResultSet rs = null; // 지역 변수는 초기화. 메서드 안에서 선언된 변수는 모두 지역변수
		// 가방을 넣어줄 컨테이너를 하나 만들어주자!!!
		// java차일에서 자동 import : 컨트롤 + 쉬프트 + o
		ArrayList<회원bag> list = new ArrayList<회원bag>();
		
		try { // 에러가 없지만 처리할 때 에러가 날까봐 에러표시가 나는데 try/catch로 처리(블럭 - 소스 - 서라운드위드 - 트라이/캐치)
			//자바와 db연결하는 프로그램(JDBC) 순서
			//1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			//2. java에서 db로 연결: 
			//   연결할 주소url(ip, port, db명), username, password
			// ?useUnicode=true&characterEncoding=utf8 <-- db에 한글을 제대로 받기위해 url의 db명 뒤에 붙여야한다.
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			//3. sql문을 만든다.
			String sql = "select * from member3";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");

			//4. sql문을 mysql로 전송한다.
			//result = ps.executeUpdate(); // CUD일 때만 사용
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			//System.out.println("검색 결과는 " + rs.next()); //아래 if문에서 한번 더 해서 아래로 내려가서 없음이 뜸.
			while(rs.next()) { // row개수만큼 반복하게 됨.
				System.out.println("검색 결과가 있음.");
				// 가방을 만들어서 table에서 하나의 row를 꺼내준 다음 가방에 넣어야 한다.
				회원bag bag2 = new 회원bag(); // 반복문 안으로 들어와야 한다.
				
				String id = rs.getString(1); //rs.getString("id"); index와 column명 둘다 가능
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				System.out.println(id + " " + pw + " " + name + " " + tel);
				bag2.setId(id);
				bag2.setPw(pw);
				bag2.setName(name);
				bag2.setTel(tel);
				// 만들어진 가방을 컨테이너에 넣어주어야 한다.
				list.add(bag2);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러 >> 드라이버 없음!!!"); // 어떤 에러인지 알기 위해 넣어주기
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("2-4번 에러 >> DB 관련된 처리하다 에러 발생!!!"); // 어떤 에러인지 알기 위해 넣어주기
			e.printStackTrace();
		}
		return list;
		
	}
	
	public int update(회원bag bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0; // 지역 변수는 초기화. 메서드 안에서 선언된 변수는 모두 지역변수
		
		try { // 에러가 없지만 처리할 때 에러가 날까봐 에러표시가 나는데 try/catch로 처리(블럭 - 소스 - 서라운드위드 - 트라이/캐치)
			//자바와 db연결하는 프로그램(JDBC) 순서
			//1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			//2. java에서 db로 연결: 
			//   연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			//3. sql문을 만든다.
			String sql = "update member3 set tel = ?, name = ? where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			//4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러 >> 드라이버 없음!!!"); // 어떤 에러인지 알기 위해 넣어주기
		} catch (SQLException e) {
			System.out.println("2-4번 에러 >> DB 관련된 처리하다 에러 발생!!!"); // 어떤 에러인지 알기 위해 넣어주기
		}
		return result;
	}
	
	public int delete(회원bag bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0; // 지역 변수는 초기화. 메서드 안에서 선언된 변수는 모두 지역변수
		
		try { // 에러가 없지만 처리할 때 에러가 날까봐 에러표시가 나는데 try/catch로 처리(블럭 - 소스 - 서라운드위드 - 트라이/캐치)
			//자바와 db연결하는 프로그램(JDBC) 순서
			//1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			//2. java에서 db로 연결: 
			//   연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			//3. sql문을 만든다.
			String sql = "delete from member3 where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			//4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러 >> 드라이버 없음!!!"); // 어떤 에러인지 알기 위해 넣어주기
		} catch (SQLException e) {
			System.out.println("2-4번 에러 >> DB 관련된 처리하다 에러 발생!!!"); // 어떤 에러인지 알기 위해 넣어주기
		}
		return result;
	}
	
}
