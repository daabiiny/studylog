package book;

// 1) 단일데이터의 배열
// 2) 데이터를 제어하기 위한 함수들

public class Handler {

	private Book[] arr = new Book[5];
	
	public int add(String genre, String bookName, int money) {
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = new Book();
				arr[i].setGenre(genre);
				arr[i].setBookName(bookName);
				arr[i].setMoney(money);
				answer = 1;
				break;
			}
		}
		return answer;
	}
	
	public void bookList() {
		
	}
}
