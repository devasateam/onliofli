package com.accounts.service.impl;

import com.accounts.service.AuthenticationService;

import models.User;
import models.account.utils.AppException;
import play.i18n.Messages;

/**
 * @Author Pramod Email:sendpramod@gmail.com
 */
public class AuthenticationServiceImpl implements AuthenticationService {

	@Override
	public String authenticateUser(String email, String password)
			throws AppException {

		User user = null;
		user = User.authenticate(email, password);
		if (user == null) {
			return Messages.get("invalid.user.or.password");
		} else if (!user.validated) {
			return Messages.get("account.not.validated.check.mail");
		}
		return "error";
	}

}
