package com.yinhai.myws.cxftest;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.yinhai.myws.entity.Student;

@WebService
public interface DataTypeWS {
    
    @WebMethod
    public boolean addStudent(Student student);
    
    @WebMethod
    public Student getStudentById(int id);
    
    @WebMethod
    public List<Student> getStudentsByPrice(float price);
    
    @WebMethod
    public Map<Integer,Student> getAllStudents();
}
