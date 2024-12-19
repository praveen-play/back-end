package com.icet.rapidsale.service;

import com.icet.rapidsale.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserDto saveUser(UserDto dto);

    List<UserDto> getAllUsers();

    void deleteUser(int userId);

    UserDto updateUser(UserDto dto);

    UserDto getUserByUsername(String username);
}
