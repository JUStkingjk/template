package com.hunau.template.Service;

import com.hunau.template.entity.Data;
import com.hunau.template.mapper.DataMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    @Resource
    private DataMapper dataMapper;

    @Override
    public List<Data> getAllData() {
        return dataMapper.checkData();
    }

    @Override
    public String insertData(Data data) {
        return null;
    }
}
