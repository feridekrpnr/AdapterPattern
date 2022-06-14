package userProjectDemo;

import userProjectDemo.adapter.MernisServiceAdapter;
import userProjectDemo.business.concretes.UserManager;
import userProjectDemo.entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Seher");
		user.setLastName("Karpınar");
		user.setGetDateOfBirth(1996);
		user.setTcNo("31325158244");
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user);
		

	}

}
