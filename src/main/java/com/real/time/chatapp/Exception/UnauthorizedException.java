package com.real.time.chatapp.Exception;

import com.real.time.chatapp.Entities.User;

public class UnauthorizedException extends RuntimeException {
	public UnauthorizedException(User user) {
		super(user.getUsername()  + " is unauthoirzed to perform this action.");
	}
}
