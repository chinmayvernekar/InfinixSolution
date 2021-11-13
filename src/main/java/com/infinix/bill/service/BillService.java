package com.infinix.bill.service;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infinix.bill.model.Bill;
import com.infinix.bill.repo.BillRepository;

@Service
public class BillService{

	@Autowired
	BillRepository billRepository;
	
	//Add Bill To Data Base
	public void addBill( Bill bill) { 
		int tot = (int) (bill.getTax() * bill.getBillPrice()) / 100;
	
	bill.setTotalPrice(tot + bill.getBillPrice());
		
		billRepository.save(bill); }
	
	//List All the Bills
	public List<Bill> findAll() {

        var it = billRepository.findAll();

        var bills = new ArrayList<Bill>();
        it.forEach(e -> bills.add(e));

        return bills;
    }
	
//	//Get all the bill due on particular date 
//	public List<Bill> findAllByDate(Date dueDate){
//		var it = billRepository.findBillsByDate(dueDate);
//		var bills = new ArrayList<Bill>();
//        it.forEach(e -> bills.add(e));
//
//        return bills;
//		
//	}
	
	//Get Details of Particular Id
	public Optional<Bill> findById(int id){
		
		return billRepository.findById(id);
		
		
	}
	
}
