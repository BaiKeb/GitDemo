package com.example.ljn.main;


import com.example.ljn.tools.JDBCTools;
import org.junit.jupiter.api.Test;

public class Main {

    @Test
    public void test(){
        try {
            System.out.println(JDBCTools.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
