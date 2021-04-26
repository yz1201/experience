package cn.dbdj1201.egg.chick.controller;

import cn.dbdj1201.egg.chick.dao.PersonDao;
import cn.dbdj1201.egg.chick.entity.Person;
import cn.dbdj1201.egg.chick.entity.TestObj;
import cn.dbdj1201.egg.chick.service.IPersonService;
import cn.dbdj1201.egg.chick.service.PersonServiceImpl;
import cn.hutool.core.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    private IPersonService personService;

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
        return PersonServiceImpl.getPersonList(len, personList);
    }

    @GetMapping("execute/create/{times}")
    public void execCreate(@PathVariable Long times) {
        System.out.println("controller - " + times);
        this.personService.addPersonTask(times);
    }

}
