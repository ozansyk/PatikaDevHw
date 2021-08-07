package patikaJava102Hw.policyManagement;

import patikaJava102Hw.policyManagement.business.AccountManager;
import patikaJava102Hw.policyManagement.entities.account.Account;
import patikaJava102Hw.policyManagement.entities.account.IndividualAccount;
import patikaJava102Hw.policyManagement.entities.account.User;

public class Main {

	public static void main(String[] args) {
		Account ac = new IndividualAccount(new User("Ozan", "Soyak", "ozan.soyak@hotmail.com", "123456", "CSE", 29, null, null));
		ac.showUserInfo();
		AccountManager acM = new AccountManager();
		//acM.login("ozan.soyak@hotmail.com", "123456");
	}

}
