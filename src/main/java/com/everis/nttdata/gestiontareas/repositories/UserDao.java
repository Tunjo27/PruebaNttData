package com.everis.nttdata.gestiontareas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.nttdata.gestiontareas.entities.UserEntity;

@Repository
public interface UserDao extends CrudRepository<UserEntity, Long>{

	public List<UserEntity> findByEmail(String email);
	
}
