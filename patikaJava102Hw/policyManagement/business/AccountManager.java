package patikaJava102Hw.policyManagement.business;

import java.util.Comparator;
import java.util.TreeSet;

import patikaJava102Hw.policyManagement.entities.account.Account;
import patikaJava102Hw.policyManagement.util.InvalidAuthenticationException;

public class AccountManager implements Comparator<Account> {
	private Account account;
	private static TreeSet<Account> accounts;
	
	public void login(String email, String password) {
		try {
			account.login(email, password);
		} catch (InvalidAuthenticationException e) {
			e.printStackTrace();
		}
	}

	public static TreeSet<Account> getAccounts() {
		return accounts;
	}

	public static void setAccounts(TreeSet<Account> accounts) {
		AccountManager.accounts = accounts;
	}

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getUser().getFirstName().compareTo(o2.getUser().getFirstName());
	}

}
