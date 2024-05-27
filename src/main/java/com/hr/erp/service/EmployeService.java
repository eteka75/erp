package com.hr.erp.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.erp.model.Employe;
import com.hr.erp.repository.EmployeRepository;

import lombok.Data;

@Data
@Service
public class EmployeService {
    
    @Autowired
    EmployeRepository employeRepository;

    public Iterable <Employe> getEmployes(){
        return employeRepository.findAll();
    }

    public com.hr.erp.controller.Optional<Employe> getEmploye(Long id){
        return employeRepository.findById(id);
    }

    public void deleteEmploye(final Long id){
        employeRepository.deleteById(id);
    }

    public Employe saveEmploye(Employe employe){
        return employeRepository.save(employe);
    }

    public Employe findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    // public Optional<Employe> updateEmploye(Employe employe){
    //     Optional<Employe> emp = employeRepository.findById(employe.getId());
    //     return employeRepository.findById(id);
    // }
}
