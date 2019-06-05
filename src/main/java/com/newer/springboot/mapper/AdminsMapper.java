package com.newer.springboot.mapper;

import com.newer.springboot.domain.Admins;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface AdminsMapper {

    @Select("select * from admins where aname=#{aname} and pwd=#{pwd} and aexist=1")
    public Admins login(@Param("aname")String aname,
                        @Param("pwd")String pwd);


    @Select("select * from admins")
    List<Admins> findAll();
}
