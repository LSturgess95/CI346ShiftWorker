package io.lukesturgess.shifts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.lukesturgess.workers.Worker;

@RestController
public class ShiftController {
	
	@Autowired
	private ShiftService shiftService;

	@RequestMapping("/workers/{id}/shifts")
	public List<Shift> getAllShifts(@PathVariable String id){
		return shiftService.getAllShifts(id);
	}
	
	@RequestMapping("/workers/{workerId}/shifts/{id}")
	public Shift getShift(@PathVariable String id){
		return shiftService.getShift(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/workers/{workerId}/shift")
	public void addShift(@RequestBody Shift shift, @PathVariable String workerId){
		shift.setWorker(new Worker(workerId, "", ""));
		shiftService.addShift(shift);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/workers/{workerId}/shift/{id}")
	public void updateShift(@RequestBody Shift shift, @PathVariable String workerId,  @PathVariable String id){
		shift.setWorker(new Worker(workerId, "", ""));
		shiftService.updateShift(shift);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/workers/{workerId}/shift/{id}")
	public void deleteShift(@PathVariable String id){
		shiftService.deleteShift(id);
	}
	

}
