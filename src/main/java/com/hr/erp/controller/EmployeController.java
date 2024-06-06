package com.hr.erp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.erp.model.Employe;
import com.hr.erp.service.EmployeService;
@RestController
@RequestMapping("employes")
public class EmployeController {
    
    EmployeService employeService;
    
    /**
     * Read - Retrieves all Employees 
     * @return - An Iterable Object object full filled
     */
    @GetMapping
    public Iterable <Employe> getEmployes(){       
         return employeService.getEmployes();
    }

    /**
     * Read - Retrive one Employee
     * @param id - The id of the employee to retrieve
     * @return - An Employe Object full filled or null when the id does not existe
     */
    @GetMapping("/{id}")
    public java.util.Optional<Employe> getEmploye(@PathVariable Long id){
         java.util.Optional<Employe> employe = employeService.getEmploye(id);
        return  employe;
    }

    /**
     * Delete - Delete one Employee
     * @param id - The id of the employee to delete
     * @return - Void
     */
    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id){
        employeService.deleteEmploye(id);
    }

    /**
     * Delete - Delete one Employee
     * @param employe - The new employee to save
     * @return - Void
     */
// @PutMapping("/{id}")
// public Optional<Employe> updateEmploye(@RequestBody Employe employe){
//     java.util.Optional<Employe> emp = employeService.getEmploye(employe.getId());
//     if(emp.isPresent()){
//         return employeService.saveEmploye(emp); 
//     }
//     return null;   
// }

}
