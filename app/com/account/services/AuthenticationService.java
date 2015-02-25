package com.account.services;


import models.User;
import models.account.utils.AppException;
import play.i18n.Messages;

import com.onliofli.utils.UrlConstants;

/**

@Author	Pramod
Email:sendpramod@gmail.com
 */
public class AuthenticationService {
	public String authenticateUser(String email,String password) throws AppException {
        User user = null;
        user = User.authenticate(email, password);
        if (user == null) {
            return Messages.get("invalid.user.or.password");
        } else if (!user.validated) {
            return Messages.get("account.not.validated.check.mail");
        }
        return UrlConstants.DASH_BOARD;
    }
}


