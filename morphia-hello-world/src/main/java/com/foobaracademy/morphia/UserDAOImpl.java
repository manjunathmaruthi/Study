package com.foobaracademy.morphia;

import java.util.List;

import com.mongodb.client.model.UpdateOptions;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;


/**
 * implementation of 
 * @author Alex
 *
 */
public class UserDAOImpl extends BasicDAO<User, ObjectId> implements UserDAO {

	public UserDAOImpl(Class<User> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	public User getByFirstNameLastName(String firstName, String lastName) {
		Query<User> query = createQuery().
				field("firstName").equal(firstName).
				field("lastName").equal(lastName);

		return query.get();
	}

	public List<User> getByFirstName(String firstName) {

		Query<User> query = createQuery().
				field("firstName").equal(firstName);

		return query.asList();
	}

	public void updateLastName(String firstName, String lastName) {
		Query<User> query = createQuery().field("firstName").equal(firstName);
		UpdateOperations<User> op =  createUpdateOperations().set("lastName", lastName);
		update(query,op);
	}

	public void addHobbiesByFirstName(String firstName, List<String> hobiesList){
		Query<User> query = createQuery().field("firstName").equal(firstName);
		UpdateOperations<User> addHobbiesOperations = createUpdateOperations().add("hobiesList","etret",false);
		update(query,addHobbiesOperations);
	}

}
