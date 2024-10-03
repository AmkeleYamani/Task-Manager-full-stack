package com.application.task_springboot.controller.employee;

import com.application.task_springboot.dto.TaskDto;
import com.application.task_springboot.services.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : A.S.M.M.U.P.Adhikaram
 * @Since : 10/2/2024
 * @Time : 10:54 PM
 **/

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/tasks")
    public ResponseEntity<List<TaskDto>> getTaskByUserId() {
        return ResponseEntity.ok(employeeService.getTaskByUserId());
    }


    @GetMapping("/task/{id}/{status}")
    public ResponseEntity<TaskDto> updateTask(@PathVariable Long id, @PathVariable String status) {
        TaskDto updatedTaskDTO = employeeService.updateTask(id, status);
        if (updatedTaskDTO == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.ok(updatedTaskDTO);
    }
}
