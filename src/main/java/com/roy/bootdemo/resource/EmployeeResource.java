package com.roy.bootdemo.resource;

import com.roy.bootdemo.dto.EmployeeDto;
import com.roy.bootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(path = "/hello")
    public ResponseEntity greetings(){
        return ResponseEntity.ok("Howdy!! Partner...");
    }

    @GetMapping(path = "/employee/{name}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getEmployee(@PathVariable(name = "name") String name){
        List<EmployeeDto> empList = employeeService.getEmployesByName(name);
        if(null!=empList && !empList.isEmpty()){
            return ResponseEntity.ok(empList);
        }else{
            return new ResponseEntity<>("Resource Not Found.", HttpStatus.NOT_FOUND);
        }
    }
}
