package phonebook1;

import java.util.ArrayList;

public class PhonebookDAO {
	
	// SQL과 다른 인자만 전달하면 쿼리를 수행하고 결과를 돌려주는 객체(도구)
	private JdbcTemplate template = new JdbcTemplate();
	
	// 전체 목록 불러오기
	public ArrayList<PhonebookDTO> selectList(){
		String sql = "select * from phonebook";
		
		RowMapper<PhonebookDTO> mapper = rs -> {
			PhonebookDTO dto = new PhonebookDTO();
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			return dto;
		};
		return template.queryForList(sql, mapper);
	}
	
	// 전달받은 객체를 DB에 저장하기
	public int insertPhoneNumber(PhonebookDTO dto) {
		int row = 0;
		String sql = "insert into phonebook values (?, ?, ?, ?)";
		row = template.update(sql, dto.getName(), dto.getPnum(), dto.getAge(), dto.getFavorite());
		return row;
	}
	
	public int updatePhoneNumber(String name, String pnum) {
		int row = 0;
		String sql = "update phonebook set pnum = ? where name = ?";
		row = template.update(sql, pnum, name);
		return row;
	}
	
	public int updateFavorite(String name) {
		int row = 0;
		String sql = "update phonebook set favorite = decode(favorite, 'Y', 'N', 'N', 'Y') where name = ?";
		row = template.update(sql, name);
		return row;
	}
	
	public int deletePhoneNumber(String name) {
		int row = 0;
		String sql = "delete phonebook where name = ?";
		row = template.update(sql, name);
		return row;
	}
	
	
	
}
