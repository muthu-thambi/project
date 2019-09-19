package Impl;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Dao.UserDao;
import model.user;

@Repository
public class UserImpl implements UserDao { 
@Autowired
private SessionFactory sessionFactory;
public void save(user entity)  {
Session session=sessionFactory.openSession();
session.beginTransaction();
session.save(entity);
session.getTransaction().commit();
session.close();
}
public void delete(int ID) {
	// TODO Auto-generated method stub
	
}
public void update(user entity) {
	// TODO Auto-generated method stub
	
}
public user findByID(int ID) {
	// TODO Auto-generated method stub
	return null;
}
public Set<user> findAll() {
	// TODO Auto-generated method stub
	return null;
}}
