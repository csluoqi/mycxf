package com.yinhai.myws.cxftest.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.yinhai.myws.cxftest.DataTypeWS;
import com.yinhai.myws.entity.Student;

@WebService
public class DataTypeWSImpl implements DataTypeWS{

    @Override
    public boolean addStudent(Student student) {
        // TODO Auto-generated method stub
        System.out.println("addStudent(Student ) " + student);
        return true;
    }

    @Override
    public Student getStudentById(int id) {
        System.out.println("getStudentById"+id);
        return new Student(10010, "联通", new Float(1000.1).floatValue());
    }

    @Override
    public List<Student> getStudentsByPrice(float price) {
        // TODO Auto-generated method stub
        List<Student> stus = new ArrayList<>();
        stus.add(new Student(10010, "联通0", new Float(1000.1).floatValue()));
        stus.add(new Student(10011, "联通1", new Float(1000.1).floatValue()));
        stus.add(new Student(10012, "联通2", new Float(1000.1).floatValue()));
        return stus;
    } 

    @Override
    public Map<Integer, Student> getAllStudents() {
        Map<Integer, Student> stumap = new HashMap<>();
        stumap.put(10010, new Student(10010, "联通0", new Float(1000.1).floatValue()));
        stumap.put(10011, new Student(10011, "联通1", new Float(1000.1).floatValue()));
        stumap.put(10012, new Student(10012, "联通2", new Float(1000.1).floatValue()));
        return stumap;
    }

}
