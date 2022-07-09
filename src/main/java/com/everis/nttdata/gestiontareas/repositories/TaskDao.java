package com.everis.nttdata.gestiontareas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.nttdata.gestiontareas.entities.TaskEntity;

@Repository
public interface TaskDao extends CrudRepository<TaskEntity, Long> {

	public List<TaskEntity> findTasksByFechaInicialAndFechaFinal(String fechaInicial, String fechaFinal);

	public List<TaskEntity> findTaskByFechaInicial(String fechaInicial);

}
