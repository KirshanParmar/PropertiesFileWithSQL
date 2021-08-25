package com.spring.sql.springwithmssql.controller;
import com.spring.sql.springwithmssql.model.Student;
import com.spring.sql.springwithmssql.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private ServiceDao serviceDao;

    @Value("${email}")
    private String email;

    @PostMapping("/email/{id}")
    public Student updateEmail(Student student) {
        System.out.println("Properties file Email "+ email);
        student.setEmail(email);
        Student updated = serviceDao.save(student);
        return updated;
    }












    /* //@GetMapping("/student/{id}")
    @RequestMapping(value="student/{id}", method = RequestMethod.GET)
    public Student getById(@PathVariable Long id) {

       return serviceDao.getById(id);
       java -jar SpringWithMSSQL-0.0.1-SNAPSHOT.jar --email="google@gmail.com"
    }
*/

    /* @PostMapping ("/student")
       public Student saveStudent(@RequestBody Student student) {
          System.out.println(student.toString());
          System.out.println("application started");
          return serviceDao.save(student);

          //java -jar SpringWithMSSQL-0.0.1-SNAPSHOT.jar --email="kirshan"
     }*/
    }