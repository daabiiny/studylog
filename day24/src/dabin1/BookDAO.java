package dabin1;

import java.sql.*;
import java.util.ArrayList;

public class BookDAO {
	
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		public BookDAO() throws Exception {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		}
		
		// 전체 목록 불러오기
		public ArrayList<BookDTO> selectList() throws Exception{
		
			ArrayList<BookDTO> list = new ArrayList<>();
			String sql = "select * from book";
			pstmt = conn.prepareStatement(sql);	// 쿼리문에 탑재하여 실행준비
			rs = pstmt.executeQuery();			// 실행해서 결과를 rs에 저장
			
			// DB에서 불러온 데이터를 리스트에 채우기
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setAuthor(rs.getString("author"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setPublisher(rs.getString("publisher"));
				list.add(dto);
			}
			rs.close();
			pstmt.close();
			conn.close();
			return list;
		}
		
		public int insertBook(BookDTO ob) throws Exception {
			int row = 0;
			String sql = "insert into book values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ob.getName());
			pstmt.setString(2, ob.getAuthor());
			pstmt.setString(3, ob.getPublisher());
			pstmt.setInt(4, ob.getPrice());
			
			row = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			return row;
		}
		
		public int updateBook(String name, String publisher) throws Exception {
			int row = 0;
			String sql = "update book set publisher = ? where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, publisher);
			pstmt.setString(2, name);
			row = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			return row;
		}
		
		public int deleteBook(String name) throws Exception {
			int row = 0;
			String sql = "delete book where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			row = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			return row;
			
		}
		
}
