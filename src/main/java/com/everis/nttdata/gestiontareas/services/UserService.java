package com.everis.nttdata.gestiontareas.services;

import java.util.List;
import java.util.Optional;

import com.everis.nttdata.gestiontareas.entities.UserEntity;

public interface UserService {

	UserEntity saveAndUpdateUser(UserEntity user);
	
	List<UserEntity> findAllUsers();
	
	Optional<UserEntity> findUserById(Long id);

	List<UserEntity> findByEmail(String email);
	
	void updateUser(UserEntity user, Long id);
	
	void deleteById(Long id);
	
}
