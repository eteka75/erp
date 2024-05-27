package com.hr.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hr.erp.model.Employe;

@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long> {

}
