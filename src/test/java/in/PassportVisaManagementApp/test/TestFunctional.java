package in.PassportVisaManagementApp.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.PassportVisaManagementApp.dao.LoginDao;
import in.PassportVisaManagementApp.dao.PassportDao;
import in.PassportVisaManagementApp.dao.UserDao;
import in.PassportVisaManagementApp.dao.VisaDao;
import in.PassportVisaManagementApp.model.Passport;
import in.PassportVisaManagementApp.model.User;
import in.PassportVisaManagementApp.model.Visa;

public class TestFunctional {

	private static AnnotationConfigApplicationContext context;
	private static LoginDao loginDao;
	private static UserDao userDao;
	private static PassportDao passportDao;
	private static VisaDao visaDao;

	private User user;
	private Passport passport;
	private Visa visa;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("in.PassportVisaManagementApp");
		context.refresh();
		loginDao = context.getBean(LoginDao.class);
		userDao = context.getBean(UserDao.class);
		passportDao = context.getBean(PassportDao.class);
		visaDao = context.getBean(VisaDao.class);
	}

	@Test
	public void testCreateUser() {
		User user = new User();
		user.setUserID(1);
		user.setUserFirstName("Bestha");
		user.setUserLastName("Shasheedhar");
		user.setUserName("B Shasheedhar");
		user.setDOB("11-11-1991");
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
		assertEquals("Saved in to user table", user.getUserID(), userDao.createUser(user));
	}

	@Test
	public void testGetUser() {
		user = userDao.getUser(1);
		assertEquals("getting user data from table", 1, user.getUserID());
	}

	@Test
	public void testUpdateUser() {
		userDao.getUser(1);
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
		assertEquals("updating user data from table", true, userDao.updateUser(user));
	}

	@Test
	public void testDeleteUser() {
		user = userDao.getUser(1);
		assertEquals("deleting user data from table", true, userDao.deleteUser(user));
	}

	@Test
	public void testCreatePassport() {
		Passport passport = new Passport();
		passport.setUserPId(1);
		passport.setUserId(1);
		passport.setCountry("India");
		passport.setState("Telangana");
		passport.setCity("Hyderabad");
		passport.setPin("1234");
		passport.setTypeOfService("Normal");
		passport.setBookletType("Pages30");
		passport.setIssueDate("2020-04-02");
		passport.setExpiryDate("2024-04-02");
		passport.setPassportId("INPASS2020");

		assertEquals("Saved in to passport in the table", passport.getPassportId(),
				passportDao.createPassport(passport));
	}

	@Test
	public void testGetPassport() {
		passport = passportDao.getPassport("INPASS2020");
		assertEquals("getting user data from table", "INPASS2020", passport.getPassportId());
	}

	@Test
	public void testUpdatePassport() {
		passportDao.getPassport("INPASS2020");
		passport.setCountry("US");
		passport.setState("Canada");
		passport.setCity("NJ");
		passport.setPin("1234");
		passport.setTypeOfService("Normal");
		passport.setBookletType("Pages60");
		passport.setIssueDate("2020-04-02");
		passport.setExpiryDate("2026-04-02");

		assertEquals("updating passport data into the table", true, passportDao.updatePassport(passport));
	}

	@Test
	public void testDeletePassport() {
		passportDao.getPassport("INPASS2020");
		assertEquals("deleting user data from table", true, passportDao.deletePassport(passport));
	}

	@Test
	public void testCreateVisa() {
		Visa visa = new Visa();
		visa.setVid(1);
		visa.setUserId(1);
		visa.setCountry("India");
		visa.setOccupation("M.Tech");
		visa.setDestination("S/W Engineer");
		visa.setDateOfApplication("2020-03-02");
		visa.setDateOfIssue("2020-03-20");
		visa.setDateOfExpiry("2020-03-20");
		visa.setRegistrationCost(1200);
		visa.setVisaStatus("Approved");
		visa.setUserVisaId("INVISA20200301");

		assertEquals("Saved in to Visa in the table", visa.getUserVisaId(), visaDao.createVisa(visa));
	}

	@Test
	public void testGetVisa() {
		visa = visaDao.getVisa("INVISA20200301");
		assertEquals("getting user data from table", "INVISA20200301", visa.getUserVisaId());
	}

	@Test
	public void testUpdateVisa() {
		visaDao.getVisa("INVISA20200301");
		visa.setCountry("India");
		visa.setOccupation("M.Tech");
		visa.setDestination("S/W Engineer");
		visa.setDateOfApplication("2020-03-02");
		visa.setDateOfIssue("2020-03-20");
		visa.setDateOfExpiry("2024-03-20");
		visa.setRegistrationCost(1200);
		visa.setVisaStatus("Approved");

		assertEquals("updating visa data into the table", true, visaDao.updateVisa(visa));
	}

	@Test
	public void testDeleteVisa() {
		passportDao.getPassport("INVISA20200301");

		assertEquals("deleting visa data from table", true, visaDao.deleteVisa(visa));
	}
}
