package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class patient {
	@Id
	 private int id;
	  private String name;
	  private String bloodgroup;
	  private long phnumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public long getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(long phnumber) {
		this.phnumber = phnumber;
	}
	 
	}

