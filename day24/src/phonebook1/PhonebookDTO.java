package phonebook1;

public class PhonebookDTO {
	
	private int idx;
	private String name;
	private String pnum;
	private int age;
	private String favorite;
	
	@Override
	public String toString() {
		String data = String.format("%d, %s, %s, %d세, %s\n",
				idx,
				name,
				pnum,
				age,
				favorite);
		return data;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
	
}
