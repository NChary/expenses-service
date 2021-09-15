package com.expences.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expences.model.Expenses;
import com.expences.service.ExpensesService;

@RestController
@RequestMapping("/v1")
public class ExpensesController {

	@Autowired
	ExpensesService expensesService;
	
	@PostMapping("/expenses")
	public String saveExpenses(@RequestBody Expenses expenses) {
		return expensesService.saveExpenses(expenses);
	}

	@GetMapping("/expenses")
	public List<Expenses> getAll(){
		return expensesService.getAll();
	}

	@PutMapping("/expenses")
	public String updateExpenses(@RequestBody Expenses expenses) {
		return expensesService.updateExpenses(expenses);
	}
	
	@DeleteMapping("expenses")
	public String deleteExpenses(@RequestBody Expenses expenses) {
		return expensesService.deleteExpenses(expenses);
	}
}
