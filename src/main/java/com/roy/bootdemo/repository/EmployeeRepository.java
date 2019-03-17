package com.roy.bootdemo.repository;

import com.roy.bootdemo.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {

    List<Employee> findAllByName (String name);

    List<Employee> findAllByOrgName (String orgName);
}
