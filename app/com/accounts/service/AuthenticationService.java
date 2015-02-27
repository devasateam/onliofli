package com.accounts.service;

import models.User;
import models.account.utils.AppException;

public interface AuthenticationService {
	public User authenticateUser(String email, String password)
			throws AppException;
}
