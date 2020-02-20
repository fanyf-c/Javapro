package com.neuedu.service;

import com.neuedu.dao.IStudentDao;
import com.neuedu.dao.StudentDao;
import com.neuedu.pojo.Student;

import java.util.List;

/**
 * Created by yufeng on 2020/2/18.
 */
public class StudentService implements IStudentService{
    IStudentDao iStudentDao=new StudentDao();
    @Override
    public List<Student> query() {
        return iStudentDao.query();
    }

    @Override
    public int add(Student student) {
        return iStudentDao.add(student);

    }

    @Override
    public int update(Student student) {
        return iStudentDao.update(student);
    }

    @Override
    public int del(int Sno) {
        return iStudentDao.del(Sno);
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
