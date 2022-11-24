package com.hunau.template.Service;

import com.hunau.template.entity.Data;
import com.hunau.template.mapper.DataMapper;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    @Resource
    private DataMapper dataMapper;

    @Override
    public List<Data> getAllData() {
        return null;
    }

    @Override
    public String insertData(Data data) {
        return null;
    }
}
