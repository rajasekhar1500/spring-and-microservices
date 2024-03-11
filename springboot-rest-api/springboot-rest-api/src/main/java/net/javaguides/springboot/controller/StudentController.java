package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    @GetMapping("/student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student(
                1,
                "C V",
                "Rajasekhar"
        );
        // return new ResponseEntity<>(student, HttpStatus.OK);
        // return ResponseEntity.ok(student);
        return ResponseEntity.ok().header("custom-header", "Rajasekhar")
                .body(student);
    }
    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Rajasekhar", "C V"));
        students.add(new Student(2, "abhi", "C V"));
        students.add(new Student(3, "pavan", "C V"));
        students.add(new Student(4, "siva", "C V"));
        students.add(new Student(5, "sanjay", "C V"));
        students.add(new Student(6, "raj", "C V"));
        students.add(new Student(7, "shekar", "C V"));
        return ResponseEntity.ok(students);
    }

    //spring boot rest api with path variable.
    // {id} --> URI template variable.
    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable int id,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName) {
        Student student = new Student(id, firstName, lastName);
        return ResponseEntity.ok(student);
    }

    // spring boot REST API with request param
    // http://localhost:8080/students/query?id=1
    @GetMapping("query")
    public ResponseEntity<Student> studentRequestParam(@RequestParam int id,
                                       @RequestParam String firstName,
                                       @RequestParam String lastName) {
        Student student =  new Student(id, firstName, lastName);
        return ResponseEntity.ok(student);
    }

    // spring boot REST API that handles HTTP POST Request  --> creating new resource
    // @PostMapping and @RequestBody
    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    // spring boot REST API that handles HTTP PUT Request --> Updating resource
    @PutMapping("{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,
                                 @PathVariable("id") int id) {
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // spring boot REST API that handles HTTP DELETE Request --> deleting resource
    @DeleteMapping("/students/{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId) {
        System.out.println(studentId);
        return ResponseEntity.ok("Student deleted successfully..");
    }
}
