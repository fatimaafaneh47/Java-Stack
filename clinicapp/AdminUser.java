package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser , HIPAACompliantAdmin {
	
	public AdminUser(Integer id,int pin ,String role) {
		super(id,pin);
		this.role=role;
	}
	
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		
		return null;
	}
	@Override
	public boolean assignPin(int pin) {
		if (pin>=6) {
			return true;
		}
		return false;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (id==confirmedAuthID) {
			return true;
		}
		else {
			Object notes = null;
			String report = String.format(
		            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
		            new Date(), this.id, notes
		        );
		        securityIncidents.add(report);
		}
		return false;
	}

}
