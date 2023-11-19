package dabin1;

import java.util.List;

public class Handler {

	public void showList() throws Exception {
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectList();
		list.forEach(book -> System.out.println(book));
	}

	public int insertBook(BookDTO book) throws Exception {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.insertBook(book);
		return row;
	}

	public int updateBook(String name, String publisher) throws Exception {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.updateBook(name, publisher);
		return row;
	}

	public int deleteBook(String name) throws Exception {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.deleteBook(name);
		return row;
	}

}
