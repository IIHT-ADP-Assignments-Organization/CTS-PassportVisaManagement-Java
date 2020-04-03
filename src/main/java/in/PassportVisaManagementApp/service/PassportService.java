package in.PassportVisaManagementApp.service;

import in.PassportVisaManagementApp.model.Passport;

public interface PassportService {
	
	int createPassport(Passport passport);

	Passport getPassport(int passportId);

	boolean updatePassport(Passport passport);

	boolean deletePassport(Passport passport);
}
