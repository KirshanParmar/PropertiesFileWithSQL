package com.spring.sql.springwithmssql.serviceimpl;

import com.spring.sql.springwithmssql.model.Student;
import com.spring.sql.springwithmssql.repository.StudentRepository;
import com.spring.sql.springwithmssql.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplementation implements ServiceDao {
    @Autowired
    private StudentRepository studentRepository;

   @Override
    public Student save(Student student) {
        return studentRepository.save(student);

    }


    /*@Override
    public Student getById(Student student) {
        return studentRepository.getById(student.getId());
    }*/

}
