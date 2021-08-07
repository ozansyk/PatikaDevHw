package patikaJava102Hw.policyManagement.entities.account;

import patikaJava102Hw.policyManagement.entities.insurance.Insurance;

public class IndividualAccount extends Account {

	public IndividualAccount(User user) {
		super(user);
	}

	@Override
	public void addInsurance(Insurance insurance) {
		super.getInsurances().add(insurance);
	}
	
}
