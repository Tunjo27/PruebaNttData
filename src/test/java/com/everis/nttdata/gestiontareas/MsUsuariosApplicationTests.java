package com.everis.nttdata.gestiontareas;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.everis.nttdata.gestiontareas.entities.TaskEntity;
import com.everis.nttdata.gestiontareas.entities.UserEntity;
import com.everis.nttdata.gestiontareas.repositories.TaskDao;
import com.everis.nttdata.gestiontareas.repositories.UserDao;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class MsUsuariosApplicationTests {

	@Autowired
	UserDao userDao;
	
	@Autowired
	TaskDao taskDao;
	
	@Test
	@Order(1)
	public void testCreateUser () {
		UserEntity user = new UserEntity();
		user.setId(1L);
		user.setNombres("Cristian Javier");
		user.setApellidos("Sosa Tunjo");
		user.setEmail("cristiansosa9927@hotmail.com");
		userDao.save(user);
		assertNotNull(userDao.findById(1L).get());
	}
		
	@Test
	@Order(2)
	public void testReadAllUsers () {
		Iterable<UserEntity> listUsers = userDao.findAll();
		assertThat(listUsers).size().isGreaterThan(0);
	}
		
	@Test
	@Order(3)
	public void testReadUser () {
		UserEntity user = userDao.findById(1L).get();
		assertEquals("Cristian Javier", user.getNombres());
	}
		
	@Test
	@Order(4)
	public void testUpdateUser () {
		UserEntity user = userDao.findById(1L).get();
		user.setNombres("Cristian Javier");
		userDao.save(user);
		assertNotEquals("Cristian J", userDao.findById(1L).get().getNombres());
	}
		
	@Test
	@Order(5)
	public void testDeleteUser () {
		userDao.deleteById(1L);
		assertThat(userDao.existsById(1L)).isFalse();
	}
	
	@Test
	@Order(6)
	public void testCreateTask () {
		TaskEntity task = new TaskEntity();
		task.setIdTask(1L);
		task.setNombreTarea("Administrar bd");
		task.setFechaInicial(null);
		task.setFechaFinal(null);
		taskDao.save(task);
		assertNotNull(taskDao.findById(1L).get());
	}
		
	@Test
	@Order(7)
	public void testReadAllTasks () {
		Iterable<TaskEntity> listTasks = taskDao.findAll();
		assertThat(listTasks).size().isGreaterThan(0);
	}
		
	@Test
	@Order(9)
	public void testUpdateTask () {
		TaskEntity task = taskDao.findById(1L).get();
		task.setNombreTarea("Administrar bd");
		taskDao.save(task);
		assertNotEquals("Crear Pantallas front", taskDao.findById(1L).get().getNombreTarea());
	}
		
	@Test
	@Order(10)
	public void testDeleteTask () {
		taskDao.deleteById(1L);
		assertThat(taskDao.existsById(1L)).isFalse();
	}
}
