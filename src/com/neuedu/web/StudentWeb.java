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
            add(scanner);
        }else if(i==3){
            modify(scanner);
        }else if(i==4){
            delete(scanner);
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
    public void add(Scanner scanner){
        System.out.println("请输入要添加的学号");
        int Sno = scanner.nextInt();
        System.out.println("请输入要添加的名字");
        String Sname = scanner.next();
        System.out.println("请输入性别 男 女");
        String Sex = scanner.next();
        System.out.println("请输入要添加的年龄");
        int Sage = scanner.nextInt();
        System.out.println("请输入要添加的学系");
        String Sdept = scanner.next();
        Student student = new Student(Sno,Sname,Sex,Sage,Sdept);
        // 调用服务层 添加该数据
        iStudentService.add(student);
        // 显示列表
        query();

    }
    public void modify(Scanner scanner){
        System.out.println("请输入要修改的学号");
        int Sno = scanner.nextInt();
        System.out.println("请输入要修改的名字");
        String Sname = scanner.next();
        System.out.println("请输入性别 男 女");
        String Sex = scanner.next();
        System.out.println("请输入要修改的年龄");
        int Sage = scanner.nextInt();
        System.out.println("请输入要修改的学系");
        String Sdept = scanner.next();
        Student student = new Student(Sno,Sname,Sex,Sage,Sdept);
        // 调用服务层 修改方法
        iStudentService.update(student);
        // 显示列表
        query();

    }
    public void delete(Scanner scanner){
        System.out.println("请输入要删除的学号");
        int Sno = scanner.nextInt();
        // 调用服务层删除方法
        iStudentService.del(Sno);
        // 显示列表
        query();

    }
}
