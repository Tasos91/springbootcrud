package com.api.springbootcrud.springbootcrud.service;

import com.api.springbootcrud.springbootcrud.dao.EmployeeDAO;
import com.api.springbootcrud.springbootcrud.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;


    @Override
    @Transactional
    public List<Employee> get() {
        return employeeDAO.get();
    }

    @Override
    @Transactional
    public Employee get(int id) {
        return null;
    }
}
