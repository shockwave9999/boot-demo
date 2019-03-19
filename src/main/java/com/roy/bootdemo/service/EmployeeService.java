package com.roy.bootdemo.service;

import com.roy.bootdemo.dto.EmployeeDto;
import com.roy.bootdemo.entity.Employee;
import com.roy.bootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository empRepo;

    public List<EmployeeDto> getEmployesByName(String name){
        List<EmployeeDto> resultList = new ArrayList<>();
        List<Employee> empList = empRepo.findAllByName(name);
        if( empList!=null && !empList.isEmpty()){
            resultList = empList.stream()
                    .map( employee -> new EmployeeDto(employee.getName(),employee.getOrgName()))
                    .collect(Collectors.toList());

        }
        return resultList;
    }
}
