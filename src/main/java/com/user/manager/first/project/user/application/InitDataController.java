package com.user.manager.first.project.user.application;

import com.user.manager.first.project.user.infra.IDataInitService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/data")
@Api(tags = "数据初始化")
public class InitDataController {
    @Autowired
    private IDataInitService dataInitService;
    @GetMapping("/init")
    @ApiOperation(value = "数据导入")
    @ApiImplicitParams(@ApiImplicitParam(name = "number", value = "导入数量", dataType = "int", paramType = "query", required = true))
    public String initData(@RequestParam Integer number){
        return dataInitService.initData(number);
    }
}
