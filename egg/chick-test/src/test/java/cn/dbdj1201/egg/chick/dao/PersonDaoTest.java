package cn.dbdj1201.egg.chick.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
}