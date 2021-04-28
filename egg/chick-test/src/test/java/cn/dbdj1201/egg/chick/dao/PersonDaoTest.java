package cn.dbdj1201.egg.chick.dao;

import cn.dbdj1201.egg.chick.entity.Person;
import cn.hutool.core.util.RandomUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: yz1201
 * @Date: 2021/4/25 21:29
 */
@SpringBootTest
class PersonDaoTest {

    @Autowired
    private PersonDao personDao;

    @Test
    void getPerson() {
        System.out.println(this.personDao.getPerson(1));
    }

    @Test
    void getPersonList() {
        System.out.println(this.personDao.getPersonList());
    }

    @Test
    void addPerson() {
        Person person = new Person();
        person.setAge(String.valueOf(RandomUtil.randomInt(0, 100)))
                .setMale(String.valueOf(RandomUtil.randomInt(0, 2)))
                .setDetail(RandomUtil.randomString(100))
                .setUsername("user-" + RandomUtil.randomString(5))
                .setNickname("doggy-" + RandomUtil.randomString(10))
                .setPhoneNum("1" + RandomUtil.randomNumbers(10));
        this.personDao.addPerson(person);
    }

    @Test
    void listPerson() {
        System.out.println("a ?");
        List<Person> personList = this.personDao.listPerson(1L, 10L);
        if (personList.size() > 0)
            personList.forEach(System.out::println);
        else
            System.out.println("exit");
    }
}