package model;

public class User {
	
	private String name;
	
	private String Password;
	
	private String signinname;
	
	private String singinpassword;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSigninname() {
		return signinname;
	}

	public void setSigninname(String signinname) {
		this.signinname = signinname;
	}

	public String getSinginpassword() {
		return singinpassword;
	}

	public void setSinginpassword(String singinpassword) {
		this.singinpassword = singinpassword;
	}
	
	

}
