package com.roy.bootdemo.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee/v1/")
public class EmployeeResource {

    @GetMapping("/{name}")
    public ResponseEntity getEmployees(@PathVariable String name){
        return ResponseEntity.ok("Howdy!! Partner...");
    }
}
