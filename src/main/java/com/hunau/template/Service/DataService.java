package com.hunau.template.Service;

import com.hunau.template.entity.Data;

import java.util.List;

public interface DataService {

    List<Data> getAllData();

    String insertData(Data data);
}
