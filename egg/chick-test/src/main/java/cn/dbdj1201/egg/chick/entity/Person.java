package cn.dbdj1201.egg.chick.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author: yz1201
 * @Date: 2021/4/24 20:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Person {

    private String username;
    private String age;
    private String male;
    private String personalInfo;
    private String phoneNum;

}
