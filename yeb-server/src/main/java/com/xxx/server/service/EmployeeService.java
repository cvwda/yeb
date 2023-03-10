package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.Employee;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.RespPageBean;


import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * 员工表 服务类
 * </p>
 *
 * @author Bing
 * @since 2021-01-13
 */
public interface EmployeeService extends IService<Employee> {


    /**
     * 获取所有员工(分页)
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDataScope
     * @return
     */
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDataScope);

    /**
     * 获取工号
     * @return
     */
    RespBean maxWorkId();

    /**
     * 添加员工
     * @param employee
     * @return
     */
    RespBean addEmp(Employee employee);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);

    /**
     * 获取所有员工账套
     * @param currentPage
     * @param size
     * @return
     */
    RespPageBean getEmployeeWithSalary(Integer currentPage, Integer size);
}
