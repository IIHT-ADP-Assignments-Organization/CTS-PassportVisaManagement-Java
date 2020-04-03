package in.PassportVisaManagementApp.service;

import in.PassportVisaManagementApp.model.Visa;

public interface VisaService {
	
	int createVisa(Visa visa);

	Visa getVisa(String visaVId);

	boolean updateVisa(Visa visa);

	boolean deleteVisa(Visa Visa);
}
