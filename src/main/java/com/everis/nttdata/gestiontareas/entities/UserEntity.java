package com.everis.nttdata.gestiontareas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UserEntity {

	@Id
	@Column(name = "id_usuario")
	private Long id;
	
	@ManyToOne
	private TaskEntity task;
	
	@Column
	private String nombres;
	
	@Column
	private String apellidos;
	
	@Column
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TaskEntity getTaskEntity() {
		return task;
	}

	public void setTaskEntity(TaskEntity task) {
		this.task = task;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserEntity(Long id, String nombres, String apellidos, String email) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;	
	}
	
	public UserEntity( ) {
	      super();
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", task=" + task + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", email=" + email + "]";
	}
	
}
