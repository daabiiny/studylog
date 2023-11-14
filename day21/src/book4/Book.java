package book4;

// 접근제한자 + getter/setter 적용

public class Book {
		private String name;			// 클래스 내부에서는 자유롭게 접근이 가능하다
		private String author;
		private int price;
		private String publisher;
		
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
		
		public Book() {
			super();
			this.name = name;
			this.author = author;
			this.price = price;
			this.publisher = publisher;
		}
		
		
		
		
		
}

