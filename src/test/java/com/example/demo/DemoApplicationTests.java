package com.example.demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    IStudentService iStudentService1 ;
//    @Test
//    IPage<Student> contextLoads() {
//        return iStudentService1.findStudentAll();
//    }

}
