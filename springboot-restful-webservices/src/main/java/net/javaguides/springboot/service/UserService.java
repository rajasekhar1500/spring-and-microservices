package net.javaguides.springboot.service;

import net.javaguides.springboot.dto.UserDto;

import java.util.List;

public interface UserService {
    public UserDto createUser(UserDto user);
    public UserDto getUserById(Long userId);
    public List<UserDto> getAllUsers();
    public UserDto updateUser(UserDto userDto);
    public void deleteUser(Long userId);
}
