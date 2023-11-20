package date;

import java.sql.*;
import java.util.ArrayList;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		
		// hr 계정의 department 테이블에서 모든 컬럼 불러오기
		// DTO 혹은 Hashmap에 저장하여 리스트로 가져온 후 출력하세요
		
		// 0) DTO 혹은 Hashmap을 저장할 수 있는 리스트 미리 생성
		ArrayList<DepartmentsDTO> list = new ArrayList<>();
		
		// 1) 접속할 주소, 계정, 비밀번호 설정
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "hr";
		String password = "hr";
		
		// 2) 드라이버 불러오기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 3) sql 준비
		String sql = "select * from departments";
		
		// 4) 연결 (conn)
		Connection conn = DriverManager.getConnection(url, user, password);
		
		// 5) 상태 (실행 준비, pstmt)
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		// 6) 결과 (pstmt.executeQuery())
		ResultSet rs = pstmt.executeQuery();
		
		// 7) while(rs.next())
		while(rs.next()) {
			// 8) 불러온 값을 자바 객체에 저장(dto 혹은 hashmap)
			DepartmentsDTO dto = new DepartmentsDTO();
			dto.setDepartment_id(rs.getInt("department_id"));
			dto.setDepartment_name(rs.getString("department_name"));
			dto.setLocation_id(rs.getInt("location_id"));
			dto.setManager_id(rs.getInt("manager_id"));
			
			// 9) 리스트에 하나씩 추가
			list.add(dto);
		}
		// 10) 반복문이 끝나면 리스트의 내용을 출력하기
		for(DepartmentsDTO dto : list) {
			System.out.printf("%d, %s, %d, %d\n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getLocation_id(), dto.getManager_id());
		}
		rs.close();
		pstmt.close();
		conn.close();
		
		
		
	}
}
