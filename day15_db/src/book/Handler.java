package book;

// 1) 단일데이터의 배열
// 2) 데이터를 제어하기 위한 함수들
public class Handler {
	
	private Book[] arr = new Book[5];
	
	public int add(String bookName, String author, int bookPrice) {
		int answer= 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Book();
				arr[i].setBookName(bookName);
				arr[i].setAuthor(author);
				arr[i].setBookPrice(bookPrice);
				answer = 1;
				break;
			}
		}
		return answer;
	}
	
	public void list() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s(%s), %,d원\n", arr[i].getBookName(), arr[i].getAuthor(), arr[i].getBookPrice());
			}
		}
	}

}
