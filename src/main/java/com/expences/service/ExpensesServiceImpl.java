package com.expences.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expences.model.Expenses;
import com.expences.repository.ExpensesRepository;

@Service
public class ExpensesServiceImpl implements ExpensesService{

	@Autowired
	ExpensesRepository expensesRepository;
	
	@Override
	public String saveExpenses(Expenses expenses) {
		expensesRepository.save(expenses);
		
		//Balance sheet
		// get existing balance sheet
		// add this expenditure
		// save into balance sheet
		
		return "Expenses saved successfully";
	}

	@Override
	public List<Expenses> getAll() {
		return expensesRepository.findAll();
	}

	@Override
	public String updateExpenses(Expenses expenses) {
		expensesRepository.save(expenses);
		return "Expenses updated successfully";
	}

	@Override
	public String deleteExpenses(Expenses expenses) {
		expensesRepository.delete(expenses);
		return "Expenses deleted successfully";
	}

}
