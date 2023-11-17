package phonebook1_db;

import java.util.List;

public class Handler {

	// 전체 목록 출력
		public void showList() {
			PhonebookDAO dao = new PhonebookDAO();
			List<PhonebookDTO> list = dao.selectList();
			list.forEach(ob -> System.out.print(ob));
		}
		// 전화번호 추가
		public int insertPhonebook(PhonebookDTO ob) {
			int row = 0;
			PhonebookDAO dao = new PhonebookDAO();
			row = dao.insert(ob);
			return row;
		}
		// 전화번호 수정
		public int updatePnum(String name, String pnum) {
			int row = 0;
			PhonebookDAO dao = new PhonebookDAO();
			row = dao.updatePnum(name, pnum);
			return row;
		}
		
		// 즐겨찾기 수정
		public int updateFavorite(String name) {
			int row = 0;
			PhonebookDAO dao = new PhonebookDAO();
			row = dao.updateFavorite(name);
			return row;
		}
		
		// 삭제
		public int delete(String name) {
			int row = 0;
			PhonebookDAO dao = new PhonebookDAO();
			row = dao.delete(name);
			return row;
		}
	}