package cn.dbdj1201.egg.chick.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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

    //主键
    private Integer id;
    //用户姓名
    private String username;
    //用户昵称
    private String nickname;
    //用户年龄
    private String age;
    //用户性别
    private String male;
    //用户描述
    private String detail;
    //用户电话
    private String phoneNum;

}
