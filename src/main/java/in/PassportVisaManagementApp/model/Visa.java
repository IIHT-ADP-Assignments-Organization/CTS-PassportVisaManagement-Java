package in.PassportVisaManagementApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Visa")
public class Visa {
	@Id
	@Column(name = "vid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;
	
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "destination")
	private String destination; 
	
	@Column(name = "dateOfApplication")
	private String dateOfApplication; 
	
	@Column(name = "dateOfIssue")
	private String dateOfIssue; 
	
	@Column(name = "dateOfExpiry")
	private String dateOfExpiry; 
	
	@Column(name = "registrationCost")
	private int registrationCost; 	

	@Column(name = "visaStatus")
	private String visaStatus;
	
	@Column(name = "userVisaId")
	private String userVisaId;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
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

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(String dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public int getRegistrationCost() {
		return registrationCost;
	}

	public void setRegistrationCost(int registrationCost) {
		this.registrationCost = registrationCost;
	}

	public String getVisaStatus() {
		return visaStatus;
	}

	public void setVisaStatus(String visaStatus) {
		this.visaStatus = visaStatus;
	}

	public String getUserVisaId() {
		return userVisaId;
	}

	public void setUserVisaId(String userVisaId) {
		this.userVisaId = userVisaId;
	}

			
}
