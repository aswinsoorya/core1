package view;

import controller.Usercontroller;
import model.User;
import java.util.Scanner;
public class Redbus {

	public static Usercontroller usercontroller = new Usercontroller();
	public final User user = new User();
	private static Scanner scanner = new Scanner(System.in);
	private static Redbus redbus = new Redbus();
	public static void main(String[] args) {
		   	
		redbus.add();
	
		
     }
	private void add() {
		
		System.out.println("Enter your name");
		user.setName(scanner.next());
		
		System.out.println("Enter your Password");
		user.setPassword(scanner.next());
		
		display();
	}
	private void display() {
		System.out.println("Sign in or Log in");
		
	
		System.out.println("Enter Username");
		user.setSigninname(scanner.next());
		
		System.out.println("Enter the password");
		user.setSinginpassword(scanner.next());
		
		
		if(usercontroller.show(user) == false||usercontroller.display(user)== false) {
			
			System.out.println("Entered username or password is incorrect ");
			
			display();
		}else {
			
			System.out.println("Entering");
		}
		}
	}
		
	
	

