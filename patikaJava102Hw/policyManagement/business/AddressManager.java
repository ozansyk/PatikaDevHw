package patikaJava102Hw.policyManagement.business;

import patikaJava102Hw.policyManagement.entities.account.User;
import patikaJava102Hw.policyManagement.entities.address.Address;

public class AddressManager {
	public void addAddress(User user, Address address) {
		user.getAddressLists().add(address);
	}
	
	public void removeAddress(User user, Address address) {
		user.getAddressLists().remove(address);
	}
}
