package jp.co.calocalo.form;

import java.io.Serializable;

public class LoginForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
