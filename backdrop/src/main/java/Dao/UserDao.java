package Dao;

import java.util.Set;

import model.user;

public interface UserDao {
public void save(user entity);
public void delete(int ID);
public void update(user entity);
public user findByID(int ID);
public Set<user> findAll();
}
