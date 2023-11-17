package phonebook1;

import java.sql.SQLException;
import java.util.List;

public class Handler {

	
	public void selectList() throws Exception {
		
		PhonebookDAO dao = new PhonebookDAO();
		List<PhonebookDTO> list = dao.selectList();
		list.forEach(ob -> System.out.println(ob));
	}
	
	public int insertPhonebook(PhonebookDTO ob) throws SQLException {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.insert(ob);
		return row;
	}
	
	public int updatePnum (PhonebookDTO ob) throws SQLException {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.updatePnum(ob);
		return row;
	}
	
	public int updateFavorite (PhonebookDTO ob) throws SQLException {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.updateFavorite(ob);
		return row;
	}
	
	public int delete(int idx) throws SQLException {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.delete(idx);
		return row;
		
	}
	
}
