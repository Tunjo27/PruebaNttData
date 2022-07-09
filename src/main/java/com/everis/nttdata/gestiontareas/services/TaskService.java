package com.everis.nttdata.gestiontareas.services;

import java.util.List;

import com.everis.nttdata.gestiontareas.entities.TaskEntity;

public interface TaskService {

	void saveAndUpdateTask(TaskEntity task);
	
	List<TaskEntity> findAllTasks();
	
	public List<TaskEntity> findTaskByFechaInicial(String fechaInicial);
	
	List<TaskEntity> findTasksByFechaInicialAndFechaFinal(String fechaInicial, String fechaFinal);
	
	void updateTask(TaskEntity task, Long idTask);
	
	void deleteTaskById(Long idTask);
	
}
