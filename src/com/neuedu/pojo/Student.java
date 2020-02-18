package com.neuedu.pojo;

/**
 * Created by yufeng on 2020/2/18.
 */
public class Student {
    private Integer Sno;
    private String Sname;
    private String Sex;
    private Integer Sage;
    private String Sdept;

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getSage() {
        return Sage;
    }

    public void setSage(Integer sage) {
        Sage = sage;
    }

    public String getSdept() {
        return Sdept;
    }

    public void setSdept(String sdept) {
        Sdept = sdept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno=" + Sno +
                ", Sname='" + Sname + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Sage=" + Sage +
                ", Sdept='" + Sdept + '\'' +
                '}';
    }
}
