package com.in28mins.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	// JPA/Hibernate to talk to DB.
	// UserDaoService > Static List

	private static List<User> users = new ArrayList<>();
	private static int usersCount = 0;

	static {
		users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Sunny", LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(40)));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		User foundUser = users.stream().filter(predicate).findFirst().orElse(null);
		if(foundUser==null)
			throw new UserNotFoundException("id: "+id);
		return foundUser;
	}
	
	public User saveUser(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}

	public void deleteUser(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
