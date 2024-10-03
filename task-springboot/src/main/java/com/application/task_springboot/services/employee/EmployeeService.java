package com.application.task_springboot.services.employee;

import com.application.task_springboot.dto.TaskDto;

import java.util.List;

/**
 * @author : A.S.M.M.U.P.Adhikaram
 * @Since : 10/2/2024
 * @Time : 10:41 PM
 **/
public interface EmployeeService {

    List<TaskDto> getTaskByUserId();
}
