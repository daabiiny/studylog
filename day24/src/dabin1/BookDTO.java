package dabin1;

public class BookDTO {

	String name, author, publisher;
	int price;
	
	@Override
	public String toString() {
		String answer = String.format("%s (%s, %s) : %,d원\n",
				name, author, publisher, price);
		return answer;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
