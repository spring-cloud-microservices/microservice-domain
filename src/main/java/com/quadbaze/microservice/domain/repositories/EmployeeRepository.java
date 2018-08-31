package com.quadbaze.microservice.domain.repositories;

import com.quadbaze.microservice.domain.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Olatunji O. Longe
 * @created: (30 Aug, 2018)
 */
@Transactional(readOnly = true)
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findEmployeeByDepartment(String department);
    List<Employee> findEmployeesByIdIn(List<Long> EmployeeIds);
}
