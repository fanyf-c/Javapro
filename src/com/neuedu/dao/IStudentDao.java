package com.neuedu.dao;

import com.neuedu.pojo.Student;

import java.util.List;

/**
 * Created by yufeng on 2020/2/18.
 */
public interface IStudentDao {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int id);
    Student queryOne(int id);
}
