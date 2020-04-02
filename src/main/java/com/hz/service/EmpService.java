package com.hz.service;

import com.hz.entity.Emp;
import com.hz.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class EmpService {
    @Autowired
    EmpRepository empRepository;

    public Emp getEmpById(Integer id) {
    Optional<Emp> optional = empRepository.findById(id);
    Emp emp = optional.get();
    return emp;
    }
    public Page<Emp> getEmpByPage(Pageable pageable){
    Page<Emp> page1 = empRepository.findAll(pageable);
    return page1;
    }
    public Emp saveEmp(Emp emp){
    Emp emp1 = empRepository.saveAndFlush(emp);
    return emp1;
    }
    public Emp updateEmp(Emp emp){
    Emp emp1 = empRepository.saveAndFlush(emp);
    return emp1;
    }
    public void deleteEmpById(Integer id){
    empRepository.deleteById(id);
    }

}