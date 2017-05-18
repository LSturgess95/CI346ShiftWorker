package io.lukesturgess.workers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerController {
	
	@Autowired
	private WorkerService workerService;

	@RequestMapping("/workers")
	public List<Worker> getAllWorkers(){
		return workerService.getAllWorkers();
	}
	
	@RequestMapping("/workers/{id}")
	public Worker getWorker(@PathVariable String id){
		return workerService.getWorker(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/workers")
	public void addWorker(@RequestBody Worker worker){
		workerService.addWorker(worker);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/workers/{id}")
	public void updateWorker(@RequestBody Worker worker, @PathVariable String id){
		workerService.updateWorker(id, worker);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/workers/{id}")
	public void deleteWorker(@PathVariable String id){
		workerService.deleteWorker(id);
	}
	

}
