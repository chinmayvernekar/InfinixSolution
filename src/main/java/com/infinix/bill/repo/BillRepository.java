package com.infinix.bill.repo;



//import java.util.Date;
//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infinix.bill.model.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Integer> {

	
//List<Bill> findBillsByDate(Date dueDate);
	
}
