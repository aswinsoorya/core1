package service;

import model.User;

public interface UserService {
	
	
	String add(final User name);
		
	boolean show(final User user);
	
    public boolean display(final User Password);
		
		
	String sign(final User signinname);
	
	String signpass(final User signinpassword);

}   
