package com.edubridge.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String name;
	private String mobile;
	private String address;
	private String pincode;
	private String username;
    private String password;
    private boolean enabled;
    private String role;
    
    public User() {

    }
    

	public User(int id, String name, String mobile, String address, String pincode, String username,String password,boolean enabled,String role) {
    //public User(String name, String passportno, String mobile, String addres, String pincode, String username,String password) {	
    super();
		this.id = id;
		this.name = name;
	    this.mobile = mobile;
		this.address = address;
		this.pincode = pincode;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.role = role;
	}
	
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
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

    public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
    public String getRole() {
		return role;
	}
    public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + ", pincode="
				+ pincode + ", username=" + username + ", password=" + password + ", enabled=" + enabled + ", role="
				+ role + "]";
	}
}
