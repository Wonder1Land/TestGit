package com.boot.girl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(value = "demo Controller",description = "测试")
@RestController
@RequestMapping("/demo")
public class HelloController {
    @Value("${cupSize}")
    private  String cupSize;
    @Value("${server.port}")
    private String port;
    @Value("${content}")
    private String content;
    @Value("${first.a.b.a1}")
    private String c;


    @RequestMapping(value = {"/say","/saw"},method = RequestMethod.GET)
    public String say(){

        return "Hello"+c+":"+cupSize+";"+port+":"+content;
    }

    @GetMapping("/hello/{name}")
    @ApiOperation(value = "首页", notes = "demo index")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "name", required = true,
                    dataType = "string", paramType = "path", defaultValue = "World")
    })
    public String hello(@PathVariable("name")String name){
        return "name1:"+name;
    }
}
