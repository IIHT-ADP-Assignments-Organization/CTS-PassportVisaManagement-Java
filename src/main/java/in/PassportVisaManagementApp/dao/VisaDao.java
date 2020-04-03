package in.PassportVisaManagementApp.dao;

import in.PassportVisaManagementApp.model.Visa;

public interface VisaDao {
	
	int createVisa(Visa visa);

	Visa getVisa(String userVId);

	boolean updateVisa(Visa visa);

	boolean deleteVisa(Visa Visa);
}
