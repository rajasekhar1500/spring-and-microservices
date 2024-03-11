package net.javaguides.employeeservice.service;

import net.javaguides.employeeservice.dto.ApiResponseDto;
import net.javaguides.employeeservice.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    public EmployeeDto saveEmployee(EmployeeDto employeeDto);
    public ApiResponseDto getEmployeeById(Long id);
    public List<EmployeeDto> getAllEmployees();
}
