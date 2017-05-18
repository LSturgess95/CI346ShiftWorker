package io.lukesturgess.workers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;

	public List<Worker> getAllWorkers(){
		List<Worker> workers = new ArrayList<>();
		workerRepository.findAll().forEach(workers::add);
		return workers;
	}
	
	public Worker getWorker(String id){
		return workerRepository.findOne(id);
	}

	public void addWorker(Worker worker) {
		workerRepository.save(worker);
		
	}

	public void updateWorker(String id, Worker worker) {
		workerRepository.save(worker);
	}

	public void deleteWorker(String id) {
		workerRepository.delete(id);
	}
}
