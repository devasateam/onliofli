package com.accounts.service;

import models.account.utils.AppException;

public interface AuthenticationService {
	public String authenticateUser(String email, String password)
			throws AppException;
}
