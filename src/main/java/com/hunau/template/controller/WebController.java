package com.hunau.template.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Api(value = "controller - data show")
public class WebController {

    @GetMapping("/hello")
    @ApiOperation(value = "返回html")
    public String web(){
        return "index";
    }

}
