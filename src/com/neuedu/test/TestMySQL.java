package com.neuedu.test;

import com.neuedu.web.StudentWeb;

/**
 * Created by yufeng on 2020/2/18.
 */
public class TestMySQL {
    public static void main(String[] args) {
        StudentWeb sw=new StudentWeb();
        sw.ShowMenu();
        sw.Input();
    }
}
