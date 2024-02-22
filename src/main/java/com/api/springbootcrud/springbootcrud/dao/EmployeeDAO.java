package com.api.springbootcrud.springbootcrud.dao;

import com.api.springbootcrud.springbootcrud.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> get();

    Employee get(int id);
}
