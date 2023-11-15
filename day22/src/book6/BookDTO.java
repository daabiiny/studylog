package book6;

//create table book(
//	    name        varchar2(100),
//	    author      varchar2(100),
//	    publisher   varchar2(100),
//	    price       number
//	);

// 테이블을 구성하는 컬럼의 내용대로 멤버 필드를 작성한다
// 멤버필드에 private을 적용하고, getter/setter를 public으로 작성한다
// 생성자 오버로딩이나 toString오버라이딩은 상관없지만
// ★ 반드시 기본 생성자가 존재하도록 구성해야 한다

public class BookDTO {	// Data Transfer Object (DB <-> Program 사이에 왔다갔다하면서 값을 담는 DTO)
		private String name;				
		private String author;
		private String publisher;
		private int price;
		
		// (추가됨+)
		// 출력 서식을 toString으로 오버라이딩
		
		@Override
		public String toString() {
			String data = String.format("%s (%s, %s) : %,d원\n",
						name,			// 변수에 직접 접근할 수 있어서 불러오는게 아니니까 getter를 쓸 필요가 없음 
						author,
						publisher,
						price);
			return data;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		
		public BookDTO() {
			super();
			this.name = name;
			this.author = author;
			this.price = price;
			this.publisher = publisher;
		}
		
		
		
		
		
}

