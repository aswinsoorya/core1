package Serviceimpl;

import java.util.ArrayList;

import model.User;
import service.UserService;

public class ServiceImpl implements UserService {
		ArrayList<User> arraylist = new ArrayList<>();
		public String add(final User name) {
			arraylist.add(name);
			return name.getName();
		}
		public boolean show(final User user) {
			if(user.getName().equals(user.getSigninname())) {
				return true;
			}
			return false;
		}
		 public boolean display(final User Password) {
			 
			 if(Password.getPassword().equals(Password.getSinginpassword())) {
					return true;
				}
				return false;
		 }
		public String sign(final User signinname) {
			
			return signinname.getSigninname();
		}
		public String signpass(final User signinpassword) {
			
			return signinpassword.getSinginpassword();
		}
}
