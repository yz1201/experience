package cn.dbdj1201.egg.chick.service;

import cn.dbdj1201.egg.chick.dao.PersonDao;
import cn.dbdj1201.egg.chick.entity.Person;
import cn.hutool.core.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/4/26 22:40
 */
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void addPersonTask(Long times) {
        initData(Math.toIntExact(times)).forEach(person -> this.personDao.addPerson(person));
//        System.out.println(times);
//        List<Person> personList = initData(1);
//        System.out.println(personList);
//        this.personDao.addPerson(personList.get(0));
    }

    @Override
    public List<Person> listPersonTask(Long page, Long size) {
        long from = (page - 1) * size;
        return this.personDao.listPerson(from, size);
    }

    private List<Person> initData(int times) {
        List<Person> personList = new ArrayList<>();
        return getPersonList(times, personList);
    }

    public static List<Person> getPersonList(int times, List<Person> personList) {
        for (int i = 0; i < times; i++) {
            Person person = new Person();
            person.setAge(String.valueOf(RandomUtil.randomInt(0, 100)))
                    .setMale(String.valueOf(RandomUtil.randomInt(0, 2)))
                    .setDetail(RandomUtil.randomString(100))
                    .setUsername("user-" + RandomUtil.randomString(5))
                    .setNickname("doggy-" + RandomUtil.randomString(10))
                    .setPhoneNum("1" + RandomUtil.randomNumbers(10));
            personList.add(person);
        }
        return personList;
    }
}
