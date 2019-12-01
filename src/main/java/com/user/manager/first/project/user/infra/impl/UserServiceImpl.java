package com.user.manager.first.project.user.infra.impl;

import com.user.manager.first.project.user.domain.entity.User;
import com.user.manager.first.project.user.repository.mapper.UserMapper;
import com.user.manager.first.project.user.infra.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liujie
 * @since 2019-11-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
