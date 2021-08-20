package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.ProductDTO;
import shop.dto.게시판bag;

public class ProductDAO {
	// 메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	//				중간에 저장할 목적으로 매개체역할을 해주는 변수 (매개변수)
	//				파라메터, parameter
	public void create(ProductDTO dto) {
		// 메서드 안에서 만들어진 변수임.
		// 변수는 "타입 변수명;" 만들어짐. (선언!)
		// 선언의 위치가 변수의 생존 범위를 결정함.
		// 위 변수 4개는 create안에서만 생존
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능.
		// 지역변수는 자동초기화X, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 " + dto.getId());
		System.out.println("전달된 name은 " + dto.getName());
		System.out.println("전달된 content는 " + dto.getContent());
		System.out.println("전달된 price는 " + dto.getPrice());
				
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
			String sql = "insert into product values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getPrice());
			System.out.println("3. sql문 생성 성공!!!");
					
			//4. sql문을 mysql로 전송한다.
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러 >> 드라이버 없음!!!"); // 어떤 에러인지 알기 위해 넣어주기
		} catch (SQLException e) {
			System.out.println("2-4번 에러 >> DB 관련된 처리하다 에러 발생!!!"); // 어떤 에러인지 알기 위해 넣어주기
		}
	}
	
	public ProductDTO read(ProductDTO dto) {
		System.out.println("전달된 id는 " + dto.getId());
		System.out.println("전달된 name은 " + dto.getName());
		System.out.println("전달된 conten는 " + dto.getContent());
		System.out.println("전달된 price는 " + dto.getPrice());
		ResultSet rs = null; //메서드 안에서 선언된변수는 모두 지역변수
		//지역변수는 초기화를 해주어야 한다. 
		ProductDTO dto2 = new ProductDTO();
		try {
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
			String sql = "select * from product where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			System.out.println("3. sql문 생성 성공!!!");
			
			//4. sql문을 mysql로 전송한다.
			//result = ps.executeUpdate(); //cud일 때만 사용 
			 rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			//System.out.println("검색 결과는 >> " + rs.next());
			if(rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1); //apple, rs.getString("id");
				String name = rs.getString(2); //apple
				String content = rs.getString(3); //apple
				String price = rs.getString(4); //apple
				System.out.println(id + " " + name + " " + content + " " + price);
				dto2.setId(id);
				dto2.setName(name);
				dto2.setContent(content);
				dto2.setPrice(price);
			}else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
			e.printStackTrace();
		} catch (SQLException e) { //2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return dto2;
		
	} //read end.
	
	public ArrayList<ProductDTO> read() {
		// DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어줘야한다.
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		ResultSet rs = null; //메서드 안에서 선언된변수는 모두 지역변수
		//지역변수는 초기화를 해주어야 한다. 
		
		try {
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
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
			
			//4. sql문을 mysql로 전송한다.
			//result = ps.executeUpdate(); //cud일 때만 사용 
			 rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			//System.out.println("검색 결과는 >> " + rs.next());
			while(rs.next()) {
				ProductDTO dto2 = new ProductDTO();
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1); //apple, rs.getString("id");
				String name = rs.getString(2); //apple
				String content = rs.getString(3); //apple
				String price = rs.getString(4); //apple
				System.out.println(id + " " + name + " " + content + " " + price);
				dto2.setId(id); //  rs.getString(1);도 가능
				dto2.setName(name);
				dto2.setContent(content);
				dto2.setPrice(price);
				System.out.println(dto2); // 제대로 추가 되었나 확인
				list.add(dto2);
				System.out.println(list.size()); // 제대로 추가 되었나 확인
			}
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
			e.printStackTrace();
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
