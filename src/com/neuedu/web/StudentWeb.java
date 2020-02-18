package com.neuedu.web;

import com.neuedu.pojo.Student;
import com.neuedu.service.IStudentService;
import com.neuedu.service.StudentService;

import java.util.List;
import java.util.Scanner;

/**
 * Created by yufeng on 2020/2/18.
 */
public class StudentWeb {
    IStudentService iStudentService=new StudentService();
    public void ShowMenu(){
        System.out.println("--------------");
        System.out.println("1.--------查询");
        System.out.println("2.--------添加");
        System.out.println("3.--------修改");
        System.out.println("4.--------删除");
        System.out.println("输入其他则退出");
        System.out.println("--------------");
    }
    public void Input(){
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        if(i==1){
            query();
        }else if(i==2){
            add();
        }else if(i==3){
            modify();
        }else if(i==4){
            delete();
        }else{
            System.exit(0);
        }
    }
    //查询方法
    public void query(){
    //调用服务层提供的方法
        List<Student> list =iStudentService.query();
        for(Student student : list){
            System.out.println(student);
        }
    }
    public void add(){

    }
    public void modify(){

    }
    public void delete(){

    }
}
