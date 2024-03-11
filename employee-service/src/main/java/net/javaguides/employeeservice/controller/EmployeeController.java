//package net.javaguides.employeeservice.controller;
//
//import net.javaguides.employeeservice.dto.ApiResponseDto;
//import net.javaguides.employeeservice.dto.EmployeeDto;
//import net.javaguides.employeeservice.entity.User;
//import net.javaguides.employeeservice.service.EmployeeService;
//import net.javaguides.employeeservice.service.impl.UserInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("api/v1/employees")
//public class EmployeeController {
//    @Autowired
//    private EmployeeService employeeService;
//    @Autowired
//    private UserInfoService userInfoService;
//    @Autowired
//    private AuthenticationManager authenticationManager;
//    @GetMapping("greeting")
//    public String greeting() {
//        return "Hello spring security";
//    }
//    @PostMapping("save")
//    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
//        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
//        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
//    }
//    @PostMapping("user")
//    public String addNewUser(@RequestBody User user) {
//        return userInfoService.addUserInfo(user);
//    }
//    @GetMapping("get/{employeeId}")
//    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
//    public ResponseEntity<ApiResponseDto> getEmployeeById(@PathVariable("employeeId") Long id) {
//        ApiResponseDto employeeDto = employeeService.getEmployeeById(id);
//        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
//    }
//    @GetMapping("/all")
//    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
//    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
//        List<EmployeeDto> employees = employeeService.getAllEmployees();
//        return ResponseEntity.ok(employees);
//    }
//
//    @GetMapping("get/user")
//    @PreAuthorize("hasAnyAuthority('ROLE_USER', 'ROLE_ADMIN')")
//    public ResponseEntity<String> getUser() {
//        return ResponseEntity.ok("UserInfo Authentication");
//    }
//}
