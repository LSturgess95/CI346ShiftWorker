package io.lukesturgess.shifts;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.lukesturgess.workers.Worker;


@Entity
public class Shift {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Worker worker;
	
	public Shift() {

	}
	
	
	public Shift(String id, String name, String description, String workerId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.worker = new Worker(workerId, "", "");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public Worker getWorker() {
		return worker;
	}


	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	
}
