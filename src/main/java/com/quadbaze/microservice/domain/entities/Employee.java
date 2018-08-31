package com.quadbaze.microservice.domain.entities;

import com.quadbaze.microservice.domain.base.RootEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author: Olatunji O. Longe
 * @created: (30 Aug, 2018)
 */

@Entity
@Table(name = "employees")
public class Employee extends RootEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "salary", nullable = false)
    private BigDecimal salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
