package forum.world.hiring.api;

public class Hiringstack {

	private Integer hiringId;
	private String hiringName;
	private String hiringAddress;
	private String hiringPhone;
	
	public Hiringstack(){};
	
	public Hiringstack(Integer hiringId, String hiringName, String hiringAddress, String hiringPhone) {
		super();
		this.hiringId = hiringId;
		this.hiringName = hiringName;
		this.hiringAddress = hiringAddress;
		this.hiringPhone = hiringPhone;
	}
	
	public Integer getHiringId() {
		return hiringId;
	}
	public void setHiringId(Integer hiringId) {
		this.hiringId = hiringId;
	}
	public String getHiringName() {
		return hiringName;
	}
	public void setHiringName(String hiringName) {
		this.hiringName = hiringName;
	}
	public String getHiringAddress() {
		return hiringAddress;
	}
	public void setHiringAddress(String hiringAddress) {
		this.hiringAddress = hiringAddress;
	}
	public String getHiringPhone() {
		return hiringPhone;
	}
	public void setHiringPhone(String hiringPhone) {
		this.hiringPhone = hiringPhone;
	}
	
}
