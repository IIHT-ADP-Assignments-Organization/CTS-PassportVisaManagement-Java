package in.PassportVisaManagementApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Passport")
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userPId")
	private int userPId;
	
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city; 
	
	@Column(name = "pin")
	private String pin;
	
	@Column(name = "typeOfService")
	private String typeOfService;
	
	enum typeOfService{
		Narmal, Tatkal
	}
	
	@Column(name = "bookletType")
	private String bookletType;
	
	enum bookletType{
		Pages30,Page60
	}
	
	@Column(name = "issueDate")
	private String issueDate;

	@Column(name = "expiryDate")
	private String expiryDate;
	
	@Column(name = "passportId")
	private String passportId;

	public int getUserPId() {
		return userPId;
	}

	public void setUserPId(int userPId) {
		this.userPId = userPId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getTypeOfService() {
		return typeOfService;
	}

	public void setTypeOfService(String typeOfService) {
		this.typeOfService = typeOfService;
	}

	public String getBookletType() {
		return bookletType;
	}

	public void setBookletType(String bookletType) {
		this.bookletType = bookletType;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}	
	
}
