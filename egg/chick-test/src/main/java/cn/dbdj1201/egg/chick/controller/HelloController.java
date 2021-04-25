package cn.dbdj1201.egg.chick.controller;

import cn.dbdj1201.egg.chick.entity.Person;
import cn.dbdj1201.egg.chick.entity.TestObj;
import cn.hutool.core.util.RandomUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/4/24 20:16
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/test")
    public String testHello() {
        return "test";
    }

    @GetMapping("/index")
    public TestObj getObj() {
        TestObj testObj = new TestObj();
        testObj.setMsg("响应成功");
        testObj.setCode("200");
        testObj.setPersonList(initData());
        return testObj;
    }

    private List<Person> initData() {
        List<Person> personList = new ArrayList<>();

        int len = 10;
        for (int i = 0; i < len; i++) {
            Person person = new Person();
            person.setAge(String.valueOf(RandomUtil.randomInt(0, 100))).setMale(String.valueOf(RandomUtil.randomInt(0, 2)))
                    .setDetail(RandomUtil.randomString(100)).setUsername("test-" + RandomUtil.randomInt(0, 1000000000))
                    .setPhoneNum("1" + RandomUtil.randomNumbers(10));
            personList.add(person);
        }
        return personList;
    }

}
