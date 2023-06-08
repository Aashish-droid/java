package com.Exception;

public class UserNotFoundException extends Exception {

	public UserNotFoundException() {
		System.out.println("Enter valid Credentials");

	}

	@Override
	public String toString() {
		return "UserNotFoundException tostring";
	}

}
