package cn.dbdj1201.egg.chick.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/4/24 20:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestObj {

    private String msg;
    private String code;

    private List<Person> personList;

}
