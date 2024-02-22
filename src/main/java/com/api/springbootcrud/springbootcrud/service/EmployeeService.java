package com.api.springbootcrud.springbootcrud.service;

import com.api.springbootcrud.springbootcrud.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> get();

    Employee get(int id);
}
