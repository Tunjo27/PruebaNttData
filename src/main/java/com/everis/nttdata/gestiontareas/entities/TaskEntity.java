package com.everis.nttdata.gestiontareas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tareas")
public class TaskEntity {

	@Id
	@Column
	private Long idTask;
	
	@Column
	private String nombreTarea;
	
	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String fechaInicial;
	
	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String fechaFinal;

	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String fechaAgregada;
	
	public Long getIdTask() {
		return idTask;
	}

	public void setIdTask(Long idTask) {
		this.idTask = idTask;
	}

	public String getNombreTarea() {
		return nombreTarea;
	}

	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	public String getFechaAgregada() {
		return fechaAgregada;
	}

	public void setFechaAgregada(String fechaAgregada) {
		this.fechaAgregada = fechaAgregada;
	}

	public TaskEntity() {
		super();
	}

	@Override
	public String toString() {
		return "TaskEntity [idTask=" + idTask + ", nombreTarea=" + nombreTarea + ", fechaInicial=" + fechaInicial
				+ ", fechaFinal=" + fechaFinal + ", fechaAgregada=" + fechaAgregada + "]";
	}
	
}
