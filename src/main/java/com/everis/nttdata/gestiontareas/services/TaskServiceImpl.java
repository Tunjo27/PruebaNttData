package com.everis.nttdata.gestiontareas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.nttdata.gestiontareas.entities.TaskEntity;
import com.everis.nttdata.gestiontareas.repositories.TaskDao;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	public TaskDao taskDao;

	public void saveAndUpdateTask(TaskEntity task) {
		taskDao.save(task);
	}

	public List<TaskEntity> findAllTasks() {
		List<TaskEntity> task = new ArrayList<TaskEntity>();
		taskDao.findAll().forEach(task1 -> task.add(task1));
		return task;
	}
	
	public List<TaskEntity> findTaskByFechaInicial(String fechaInicial) {
		return taskDao.findTaskByFechaInicial(fechaInicial);
	}
	
	public List<TaskEntity> findTasksByFechaInicialAndFechaFinal(String fechaInicial, String fechaFinal) {
		return taskDao.findTasksByFechaInicialAndFechaFinal(fechaInicial, fechaFinal);
	}
	
	public void updateTask(TaskEntity task, Long idTask) {
		taskDao.save(task);
	}

	public void deleteTaskById(Long idTask) {
		taskDao.deleteById(idTask);
	}

}
