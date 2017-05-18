package io.lukesturgess.shifts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiftService {
	
	@Autowired
	private ShiftRepository shiftRepository;

	public List<Shift> getAllShifts(String workerId){
		List<Shift> shifts = new ArrayList<>();
		shiftRepository.findByWorkerId(workerId).forEach(shifts::add);
		return shifts;
	}
	
	public Shift getShift(String id){
		return shiftRepository.findOne(id);
	}

	public void addShift(Shift shift) {
		shiftRepository.save(shift);
		
	}

	public void updateShift(Shift shift) {
		shiftRepository.save(shift);
	}

	public void deleteShift(String id) {
		shiftRepository.delete(id);
	}
}
