package cn.dbdj1201.egg.chick.dao;

import cn.dbdj1201.egg.chick.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/4/25 20:28
 */
@Repository
public interface PersonDao {

    Person getPerson(Integer id);

    List<Person> getPersonList();

    int addPerson(Person person);

    void deletePerson();
}
