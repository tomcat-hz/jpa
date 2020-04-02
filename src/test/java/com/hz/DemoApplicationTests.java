package com.hz;

import com.hz.entity.Emp;
import com.hz.repository.EmpRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

   @Autowired
   EmpRepository empRepository;

  @Test
   public void test01() {

  }

    @Test
    public void test02() {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a.equals(c));
    }

}
