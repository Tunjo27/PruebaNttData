package com.everis.nttdata.gestiontareas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.nttdata.gestiontareas.entities.UserEntity;
import com.everis.nttdata.gestiontareas.repositories.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;
	
	public UserEntity saveAndUpdateUser(UserEntity user) {
		return userDao.save(user);
	}

	public List<UserEntity> findAllUsers() {
		List<UserEntity> user = new ArrayList<UserEntity>();
		userDao.findAll().forEach(user1 -> user.add(user1));
		return user;
	}

	public Optional<UserEntity> findUserById(Long id) {
		return userDao.findById(id);
	}

	public List<UserEntity> findByEmail(String email) {
		return userDao.findByEmail(email);
	}
	
	public void updateUser(UserEntity user, Long id) {
		userDao.save(user);
	}

	public void deleteById(Long id) {
		userDao.deleteById(id);
	}

}
