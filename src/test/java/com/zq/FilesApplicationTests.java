package com.zq;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;


//@SpringBootTest
class FilesApplicationTests {

    @Test
    void contextLoads() {
        String property = System.getProperty("user.dir");
        System.out.println("property = " + property);
        String separator = File.separator;
        System.out.println("separator = " + separator);
        File file = new File("E:\\Desktop\\11.jpg");
        System.out.println("file = " + file.getAbsoluteFile().length());
    }

    @Test
    public void test2(){
        int a = 2;
        if(a == 1) System.out.println("a = " + a);
        else System.out.println("加油");
    }

}
