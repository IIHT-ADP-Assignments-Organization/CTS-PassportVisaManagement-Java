package in.PassportVisaManagementApp.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import in.PassportVisaManagementApp.model.User;

public class TestBoundary {

	@Test
	public void testPasswordLength() {
		User user=new User();
		user.setUserID(1);
		user.setUserFirstName("Besta");
		user.setUserLastName("Shashidhar");
		user.setUserName("B Shashidhar");
		user.setDOB("11-11-1997");
		user.setAddress("Hyderabad");
		user.setContactNo("9494879694");
		user.setEmailId("shashi.2346@gmail.com");
		user.setQualification("M.Tech");
		user.setOccupation("S/W Engineer");
		user.setGender("Male");
		user.setApplyType("Normal");
		user.setPassword("12345");
		user.setHintQustion("Numbers");
		user.setHintAns("1to9");
		
		int passwordLength = 5;
		assertEquals(passwordLength, user.getPassword().length());
	}

	@Test
	public void testPhoneNumberLength() {
		User user=new User();
		user.setUserID(1);
		user.setUserFirstName("Besta");
		user.setUserLastName("Shashidhar");
		user.setUserName("B Shashidhar");
		user.setDOB("11-11-1997");
		user.setAddress("Hyderabad");
		user.setContactNo("9494879694");
		user.setEmailId("shashi.2346@gmail.com");
		user.setQualification("M.Tech");
		user.setOccupation("S/W Engineer");
		user.setGender("Male");
		user.setApplyType("Normal");
		user.setPassword("123456789");
		user.setHintQustion("Numbers");
		user.setHintAns("1to9");

		int phoneNumberLength=10;
		int getLengthOfNumber = ((user.getContactNo()).length());
		assertEquals(phoneNumberLength, getLengthOfNumber);
	}

	@Test
	public void testUserNameLength() {
		User user=new User();
		user.setUserID(1);
		user.setUserFirstName("Besta");
		user.setUserLastName("Shashidhar");
		user.setUserName("B Shashidhar");
		user.setDOB("11-11-1997");
		user.setAddress("Hyderabad");
		user.setContactNo("9494879694");
		user.setEmailId("shashi.2346@gmail.com");
		user.setQualification("M.Tech");
		user.setOccupation("S/W Engineer");
		user.setGender("Male");
		user.setApplyType("Normal");
		user.setPassword("123456789");
		user.setHintQustion("Numbers");
		user.setHintAns("1to9");

		
		int maxChar = 5;
		boolean usernameLength = ((user.getUserName().length()) >= maxChar);
		assertEquals(usernameLength, true);
	}
	@Test
	public void testEmailId() {
		User user=new User();
		user.setUserID(1);
		user.setUserFirstName("Besta");
		user.setUserLastName("Shashidhar");
		user.setUserName("B Shashidhar");
		user.setDOB("11-11-1997");
		user.setAddress("Hyderabad");
		user.setContactNo("9494879694");
		user.setEmailId("shashi.2346@gmail.com");
		user.setQualification("M.Tech");
		user.setOccupation("S/W Engineer");
		user.setGender("Male");
		user.setApplyType("Normal");
		user.setPassword("123456789");
		user.setHintQustion("Numbers");
		user.setHintAns("1to9");
		
		assertNotNull(user.getEmailId());
	}

}
