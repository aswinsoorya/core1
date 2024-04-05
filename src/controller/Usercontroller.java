package controller;

import Serviceimpl.ServiceImpl;
import model.User;
import service.UserService;

public class Usercontroller {
	
	private final UserService userservice = new ServiceImpl();
	
	public String add(final User name) {
		
		return userservice.add(name);
	}		
	public boolean show(final User Password){
		
		return userservice.show(Password);
	}
    public boolean display(final User Password){
		
		return userservice.display(Password);
	}
	public String sign(final User signinname) {
		
		return userservice.sign(signinname);
	}
	public String signpass(final User signinpassword) {
		
		return userservice.signpass(signinpassword);
	}
	
	

}
