package com.hunau.template.mapper;

import com.hunau.template.entity.Data;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface DataMapper {
    @Select("select * from lb08")
    public List<Data> checkData();

    @Insert("insert into ")
    public void addData();

}
