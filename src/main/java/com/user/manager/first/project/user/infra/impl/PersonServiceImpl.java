package com.user.manager.first.project.user.infra.impl;

import com.user.manager.first.project.user.domain.entity.Person;
import com.user.manager.first.project.user.repository.mapper.PersonMapper;
import com.user.manager.first.project.user.infra.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 人类 服务实现类
 * </p>
 *
 * @author liujie
 * @since 2019-11-30
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
