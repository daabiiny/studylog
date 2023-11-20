package date;

//REGION_ID		NUMBER
//REGION_NAME	VARCHAR2(25 BYTE)

public class RegionsDTO {
	
	private int region_id;
	private String region_name;
	
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
}
