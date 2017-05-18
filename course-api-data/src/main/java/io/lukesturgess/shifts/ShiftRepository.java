package io.lukesturgess.shifts;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ShiftRepository extends CrudRepository<Shift, String> {

	public List<Shift> findByWorkerId(String workerId);
	
}
