package com.roy.bootdemo.dto;

import java.util.Objects;

public class EmployeeDto {

    String name;
    String orgName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDto employeeDto = (EmployeeDto) o;
        return Objects.equals(name, employeeDto.name) &&
                Objects.equals(orgName, employeeDto.orgName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, orgName);
    }
}
