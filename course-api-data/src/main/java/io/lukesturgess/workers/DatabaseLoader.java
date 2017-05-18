package io.lukesturgess.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
	
	private final WorkerRepository workerRepository;
	
	@Autowired
	public DatabaseLoader(WorkerRepository repository) {
		this.workerRepository = repository;
	}
	
	@Override
	public void run(String... strings) throws Exception {
		this.workerRepository.save(new Worker("1", "Luke", "Software Developer"));
		this.workerRepository.save(new Worker("2", "Some Other Guy", "Software Developer"));
	}

}
