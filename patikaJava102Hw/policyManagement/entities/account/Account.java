package patikaJava102Hw.policyManagement.entities.account;

import java.util.ArrayList;

import patikaJava102Hw.policyManagement.business.AccountManager;
import patikaJava102Hw.policyManagement.entities.insurance.Insurance;
import patikaJava102Hw.policyManagement.util.InvalidAuthenticationException;

public abstract class Account {
	private User user;
	private ArrayList<Insurance> insurances;
	private AuthenticationStatus authenticationStatus;
	
	enum AuthenticationStatus {
		SUCCESS,
		FAIL
	}
	
	public Account(User user) {
		this.user = user;
		AccountManager.getAccounts().add(this);
	}
	

	public final void showUserInfo() {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAge() + " " + user.getEmail());
	}
	
	public boolean login(String email, String password) throws InvalidAuthenticationException {
		if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
			authenticationStatus = AuthenticationStatus.SUCCESS;
			return true;
		} else {
			authenticationStatus = AuthenticationStatus.FAIL;
			throw new InvalidAuthenticationException("Giriþ bilgileriniz hatalý!");
		}
	}
	
	public boolean isLogin() {
		if(authenticationStatus == AuthenticationStatus.SUCCESS) {
			return true;
		} else {
			return false;
		}
	}
	
	public abstract void addInsurance(Insurance insurance);

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public ArrayList<Insurance> getInsurances() {
		return insurances;
	}


	public void setInsurances(ArrayList<Insurance> insurances) {
		this.insurances = insurances;
	}


	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}


	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}
}
