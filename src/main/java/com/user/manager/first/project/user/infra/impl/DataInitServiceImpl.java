package com.user.manager.first.project.user.infra.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.user.manager.first.project.user.domain.entity.Person;
import com.user.manager.first.project.user.infra.IDataInitService;
import com.user.manager.first.project.user.infra.IPersonService;
import com.user.manager.first.project.user.infra.IStudentService;
import com.user.manager.first.project.user.infra.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataInitServiceImpl implements IDataInitService {
    @Autowired
    private IPersonService personService;
    @Autowired
    private IStudentService studentService;
    @Autowired
    private IUserService userService;
    @Override
    public String initData(Integer number) {
        Long max = getPersonMax();
        List<Person> list = new ArrayList<>();
        for(long i=1;i<number;i++){
            Person person = new Person();
            long maxNumber = number + max;
            person.setPerscode(String.valueOf(maxNumber));
            person.setDescription(String.valueOf(maxNumber));
            person.setCreatedBy("liujie");
            person.setCreationTime(LocalDateTime.now());
            person.setEnabledFlag("Y");
            list.add(person);
        }
        personService.saveBatch(list);
        return "Y";
    }

    private Long getPersonMax(){
        LambdaQueryWrapper<Person> queryWrapper = new QueryWrapper<Person>().lambda();
        queryWrapper.orderByDesc(Person::getPersonId).eq(Person::getEnabledFlag, "Y");
        List<Person> result = personService.list(queryWrapper);
        if(result == null || result.size() == 0){
            return 1L;
        }
        return result.get(0).getPersonId();
    }
}
