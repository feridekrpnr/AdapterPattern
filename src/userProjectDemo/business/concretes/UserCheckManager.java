package userProjectDemo.business.concretes;

import userProjectDemo.business.abstracts.UserCheckService;
import userProjectDemo.entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		return false;
	}

}
