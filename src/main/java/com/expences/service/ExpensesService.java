package com.expences.service;

import java.util.List;

import com.expences.model.Expenses;

public interface ExpensesService {
	
	String saveExpenses(Expenses expenses);
	
	List<Expenses> getAll();
	
	String updateExpenses(Expenses expenses);
	
	String deleteExpenses(Expenses expenses);
}
