package com.hunau.template.controller;

import com.hunau.template.Service.DataService;
import com.hunau.template.entity.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class WebController {

    @Resource
    private DataService dataService;

    @GetMapping("/dataShow")
    public String web(){
        return "index";
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Data> getAllData(){
        return dataService.getAllData();
    }
}
