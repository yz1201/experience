package cn.dbdj1201.egg.chick.service;

import cn.dbdj1201.egg.chick.entity.Person;

import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/4/26 22:40
 */
public interface IPersonService {

    void addPersonTask(Long times);

    List<Person> listPersonTask(Long page, Long size);
}
