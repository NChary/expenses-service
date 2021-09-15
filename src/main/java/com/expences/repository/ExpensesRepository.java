package com.expences.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expences.model.Expenses;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Integer>{

}
