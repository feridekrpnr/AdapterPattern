package userProjectDemo.business.concretes;

import userProjectDemo.adapter.MernisServiceAdapter;
import userProjectDemo.business.abstracts.UserCheckService;
import userProjectDemo.business.abstracts.UserService;
import userProjectDemo.entities.User;

public class UserManager implements UserService {
	private UserCheckService userCheckService;

	public UserManager( MernisServiceAdapter mernisServiceAdapter) {
		super();
		this.userCheckService = mernisServiceAdapter;
		
	}

	@Override
	public void add(User user) {
		if (userCheckService.CheckIfRealPerson(user)) {
		
			System.out.println("User added");
		} else {
			System.out.println("Not a valid person");
		}
		
	}

	

}
