package patikaJava102Hw.policyManagement.entities.account;

import patikaJava102Hw.policyManagement.entities.insurance.Insurance;

public class EnterpriseAccount extends Account {

	public EnterpriseAccount(User user) {
		super(user);
	}

	@Override
	public void addInsurance(Insurance insurance) {
		super.getInsurances().add(insurance);
	}

}
