package com.company.bank005_interface;

import java.util.List;

public class Show implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		UserInfo info=users.get(find);
		System.out.println(" id > " + info.getId());
		System.out.println(" psaa > " + info.getPass());
		System.out.println(" balance> " + info.getBalance());
		return 0;
		// TODO Auto-generated method stub

	}

	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return null;
	}

	


	}


