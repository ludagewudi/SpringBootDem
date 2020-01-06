package com.ludashen;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @description:
 * @author: 陆大哥
 * @Data: 2020-01-06 17:06
 */
@Data
@Table(name = "tableName")
public class User {
//    设置主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;

//    这个注解不会使该成员当当成数据库字段
    @Transient
    private String a;

}
