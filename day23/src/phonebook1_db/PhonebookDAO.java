package phonebook1_db;

import java.util.ArrayList;

public class PhonebookDAO {

	private JdbcTemplate template = new JdbcTemplate();
	
	public ArrayList<PhonebookDTO> selectList(){
		String sql = "select * from phonebook order by favorite desc, name";
		
		RowMapper<PhonebookDTO> mapper = rs -> {
			PhonebookDTO dto = new PhonebookDTO();
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			return dto;
		};
		return template.queryForList(sql, mapper);
	}
	
	// 전달받은 객체를 DB에 저장하기
	// 추가
	public int insert(PhonebookDTO dto) {
		int row = 0;
		String sql = "insert into phonebook values (?, ?, ?, ?)";
		row = template.update(sql, dto.getName(), dto.getPnum(), dto.getAge(), dto.getFavorite());
		return row;
	}
	// 전화번호 수정
	public int updatePnum(String name, String pnum) {
		int row = 0;
		String sql = "update phonebook set pnum = ? where name = ?";
		row = template.update(sql, pnum, name);
		return row;
	}
	
	// 즐겨찾기 수정
	public int updateFavorite(String name) {
		int row = 0;
		String sql = "update phonebook set favorite = decode (favorite, 'Y', 'N', 'N', 'Y') where name = ?";
		row = template.update(sql, name);
		return row;
	}
	
	// 삭제
	public int delete(String name) {
		int row = 0;
		String sql = "delete phonebook where name = ?";
		row = template.update(sql, name);
		return row;
	}
}
