package com.hz.controller;

import com.hz.entity.Emp;
import com.hz.service.EmpService;
import com.hz.util.CustomServiceException;
import com.hz.util.LoggerManage;
import com.hz.util.RespBean;
import com.hz.util.ServiceEnumType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/{id}")
    @LoggerManage(logDescription = "查询数据")
    public RespBean getUser(@PathVariable("id") Integer id) {
        try {
            Emp emp = empService.getEmpById(id);
            return RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(), ServiceEnumType.GET_SUCCESS.getMsg(), emp);
        } catch (Exception e) {
            throw new CustomServiceException(ServiceEnumType.GET_FAIL.getCode(), ServiceEnumType.GET_FAIL.getMsg());
        }
    }

    @GetMapping("/")
    public RespBean getEmpByPage(@RequestParam Integer pageNum, @RequestParam(defaultValue = "3") Integer size) {
        try {
            if (pageNum < 1) {
                pageNum = 1;
            }
            Pageable pageable = PageRequest.of(pageNum - 1, size);
            Page<Emp> page = empService.getEmpByPage(pageable);
            return
                    RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(), ServiceEnumType.GET_SUCCESS.getMsg(), page);
        } catch (Exception e) {
            throw new CustomServiceException(ServiceEnumType.GET_FAIL.getCode(), ServiceEnumType.GET_FAIL.getMsg());
        }
    }

    @PutMapping("/")
    public RespBean updateEmp(@RequestBody Emp emp) {
        try {
            Emp emp1 = empService.updateEmp(emp);
            return RespBean.success(ServiceEnumType.UPDATE_SUCCESS.getCode(), ServiceEnumType.UPDATE_SUCCESS.getMsg(), emp1);
        } catch (Exception e) {
            throw new CustomServiceException(ServiceEnumType.UPDATE_FAIL.getCode(), ServiceEnumType.UPDATE_FAIL.getMsg());
        }
    }

    @PostMapping("/")
    public RespBean saveEmp(@RequestBody Emp emp) {
        try {
            Emp emp1 = empService.saveEmp(emp);
            return
                    RespBean.success(ServiceEnumType.INSERT_SUCCESS.getCode(), ServiceEnumType.INSERT_SUCCESS.getMsg(), emp1);
        } catch (Exception e) {
            throw new CustomServiceException(ServiceEnumType.INSERT_SUCCESS.getCode(), ServiceEnumType.INSERT_SUCCESS.getMsg());
        }
    }

    @DeleteMapping("/{id}")
    public RespBean deleteEmp(@PathVariable Integer id) {
        try {
            empService.deleteEmpById(id);
            return RespBean.success(ServiceEnumType.DELETE_SUCCESS.getCode(), ServiceEnumType.DELETE_SUCCESS.getMsg());
        } catch (Exception e) {
            throw new CustomServiceException(ServiceEnumType.DELETE_FAIL.getCode(), ServiceEnumType.DELETE_FAIL.getMsg());
        }
    }
}