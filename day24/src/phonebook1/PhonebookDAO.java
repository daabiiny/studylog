package phonebook1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Templates;

public class PhonebookDAO {
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";
	
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public List<PhonebookDTO> selectList() throws Exception {
		ArrayList<PhonebookDTO> list = new ArrayList<>();
		String sql = "select * from phonebook order by favorite desc, name asc";
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			// RowMapper에 작성했던 규칙을 여기에 작성
			PhonebookDTO dto = new PhonebookDTO();
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			dto.setIdx(rs.getInt("idx"));
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			list.add(dto);
		}
		rs.close();
		pstmt.close();
		conn.close();
		return list;
	}
	
	public int insert(PhonebookDTO ob) throws SQLException {
		int row = 0;
		String sql = "insert into phonebook values (?, ?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, ob.getIdx());
		pstmt.setString(2, ob.getName());
		pstmt.setString(3, ob.getPnum());
		pstmt.setInt(4, ob.getAge());
		pstmt.setString(5, ob.getFavorite());
		row = pstmt.executeUpdate();	
		
		rs.close();
		pstmt.close();
		conn.close();
		return row;
	}
	
	public int updatePnum(PhonebookDTO ob) throws SQLException {
		int row = 0;
		String sql = "update phonebook set pnum = ? where idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, ob.getPnum());
		pstmt.setInt(2, ob.getIdx());
		row = pstmt.executeUpdate();
		
		rs.close();
		pstmt.close();
		conn.close();
		return row;
	}
	
	public int updateFavorite(PhonebookDTO ob) throws SQLException {
		int row = 0;
		String sql = "update phonebook "
				+ "		set favorite = decode(favorite, 'Y', 'N', 'N', 'Y')"
				+ "		where idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, ob.getIdx());
		row = pstmt.executeUpdate();
		
		rs.close();
		pstmt.close();
		conn.close();
		return row;
	}
	
	public int delete(int idx) throws SQLException {
		int row = 0;
		String sql = "delete book where idx = ?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		row = pstmt.executeUpdate();
		return row;
	}
}
