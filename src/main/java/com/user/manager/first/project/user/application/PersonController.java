package com.user.manager.first.project.user.application;


import com.user.manager.first.project.user.infra.IPersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 人类 前端控制器
 * </p>
 *
 * @author liujie
 * @since 2019-11-30
 */
@RestController
@RequestMapping("/user/person")
@Api(tags = "人控制器")
public class PersonController {
    @Autowired
    private IPersonService personService;
    @DeleteMapping("/delete")
    @ApiOperation(value = "删除")
    @ApiImplicitParams(@ApiImplicitParam(name = "personId", value = "主键", paramType = "query", required = true, dataType = "long"))
    public boolean delete(@RequestParam Long personId){
        boolean result = personService.removeById(personId);
        return result;
    }
}
