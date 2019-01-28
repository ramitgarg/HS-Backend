package forum.world.hiring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hiringstack {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hiring_id")
	private Integer hiringId;
	
	@Column(name = "hiring_name")
	private String hiringName;
	
	@Column(name = "hiring_address")
	private String hiringAddress;
	
	@Column(name = "hiring_phone")
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
