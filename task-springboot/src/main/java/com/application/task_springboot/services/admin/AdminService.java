package com.application.task_springboot.services.admin;


import com.application.task_springboot.dto.UserDto;

import java.util.List;

public interface AdminService {
    List<UserDto> getUsers();
}
