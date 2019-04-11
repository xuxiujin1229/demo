package com.baizhi.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Table(name = "t_user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer userId;
    private String userName;
    private String password;
    private Integer sex;//0：女  1：男
    @Transient
    private Integer count;

}
