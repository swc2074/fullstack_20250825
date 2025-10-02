package com.company.bank005_interface;

import java.util.List;

public interface BankController {
	// public UserInfo exec(List<UserInfo> users);
	int exec(List<UserInfo> users, int find);

	UserInfo exec(List<UserInfo> users);


	
}
