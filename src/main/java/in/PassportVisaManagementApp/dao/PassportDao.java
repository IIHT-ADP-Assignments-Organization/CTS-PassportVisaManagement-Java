package in.PassportVisaManagementApp.dao;

import in.PassportVisaManagementApp.model.Passport;

public interface PassportDao {
	
	int createPassport(Passport passport);

	Passport getPassport(String passportId);

	boolean updatePassport(Passport passpost);

	boolean deletePassport(Passport passpost);
}
