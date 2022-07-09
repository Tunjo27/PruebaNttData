package com.everis.nttdata.gestiontareas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.everis.nttdata.gestiontareas.entities.TaskEntity;
import com.everis.nttdata.gestiontareas.services.TaskServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = {"Tasks"})
public class TaskController {

	@Autowired
	TaskServiceImpl taskService;
	
	@PostMapping("/add-task")
	@ApiOperation(value = "Add task by user")
	public Long saveTask(@RequestBody TaskEntity task) {
		taskService.saveAndUpdateTask(task);
		return task.getIdTask();
	}
	
	@GetMapping("/find-all-tasks")
	@ApiOperation(value = "List of available tasks by user")
	public List<TaskEntity> findAllTasks(){
		return taskService.findAllTasks();
	}
	
	@GetMapping("/find-by-fechainicial/{fechaInicial}")
	public List<TaskEntity> findTaskByFechaInicial(@PathVariable String fechaInicial){
		return taskService.findTaskByFechaInicial(fechaInicial);
	}
	
	@GetMapping("/find-by-dates/{fechaInicial}/{fechaFinal}")
	@ApiOperation(value = "List of tasks by dates")
	public List<TaskEntity> findTasksByFechaInicialAndFechaFinal(@PathVariable String fechaInicial, String fechaFinal) {
		return taskService.findTasksByFechaInicialAndFechaFinal(fechaInicial, fechaFinal);
	}
	
	@PutMapping("/update-task/{id}")
	@ApiOperation(value = "Update task")
	public TaskEntity updateTask(@RequestBody TaskEntity task) {
		taskService.saveAndUpdateTask(task);
		return task;
	}
	
	@DeleteMapping("/delete-task/{idTask}")
	@ApiOperation(value = "Delete task")
	public void deleteTaskById(@PathVariable Long idTask) {
		taskService.deleteTaskById(idTask);
	}
}
