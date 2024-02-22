package com.api.springbootcrud.springbootcrud.controller;

import com.api.springbootcrud.springbootcrud.model.Employee;
import com.api.springbootcrud.springbootcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employee")
    public List<Employee> get() {
        return service.get();
    }

}
