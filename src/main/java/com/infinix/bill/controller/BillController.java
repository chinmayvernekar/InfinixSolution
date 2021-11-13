package com.infinix.bill.controller;

//import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infinix.bill.model.Bill;
import com.infinix.bill.repo.BillRepository;
import com.infinix.bill.service.BillService;

@RestController
public class BillController {

	@Autowired
	BillService billService;
	
	@Autowired
	BillRepository billRepository;
	
	//Create Record of Bill In DataBase
	@RequestMapping(value = "/createBill",method = RequestMethod.POST)
	public Bill createBill(@RequestBody Bill bill) {
		
	  billService.addBill(bill);
	  
	  return bill;
	}
	
	//Get all the bill records from database
	@RequestMapping(value = "/bills", method = RequestMethod.GET)
	public List<Bill> allUser() { return billService.findAll(); }
	
	//Get the bill with the id passed
	@RequestMapping(value = "/bills/{id}",method = RequestMethod.GET)
	public Optional<Bill> getBillById(@PathVariable("id") int id) {
		
		return billService.findById(id);
	}
	
	//Get all the bill on due date
//	@RequestMapping(value = "/bills/{dueDate}", method = RequestMethod.GET)
//	public List<Bill> billsByDate(@PathVariable("dueDate") Date duDate)
//	{
//		return (List<Bill>) billRepository.findAllById((Iterable<Integer>) duDate);
//	}
	
}
