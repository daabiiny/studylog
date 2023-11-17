package phonebook1_db;

public class PhonebookDTO {

	private String name;
	private String pnum;
	private String favorite;
	private int age;
	
	@Override
	public String toString() {
		String data = String.format("%s %s %d살 %s\n", 
				name, pnum, age, favorite);
		return data;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
