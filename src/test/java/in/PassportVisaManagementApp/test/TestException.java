package in.PassportVisaManagementApp.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.PassportVisaManagementApp.dao.LoginDao;
import in.PassportVisaManagementApp.dao.PassportDao;
import in.PassportVisaManagementApp.dao.UserDao;
import in.PassportVisaManagementApp.dao.VisaDao;
import in.PassportVisaManagementApp.exception.UserAlreadyExistException;
import in.PassportVisaManagementApp.exception.UserDoesNotExistException;
import in.PassportVisaManagementApp.model.Passport;
import in.PassportVisaManagementApp.model.User;
import in.PassportVisaManagementApp.model.Visa;
import in.PassportVisaManagementApp.service.LoginService;

public class TestException {
	
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
	public void testForUserRegistration() throws UserAlreadyExistException { 
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
		
		LoginService loginservice = (LoginService) context.getBean(LoginService.class);
		loginservice.createUser(user);
		Assert.assertEquals(UserAlreadyExistException.message, "user already exists !..please login");
	}

	@Test
	public void testForUserLogin() throws UserDoesNotExistException {
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
		LoginService loginservice = (LoginService) context.getBean(LoginService.class);
		loginservice.userLogin(user.getUserName(), user.getPassword());
		Assert.assertEquals(UserDoesNotExistException.message, "user already exists !..please login");
	}	 
}