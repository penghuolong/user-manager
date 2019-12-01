package com.user.manager.first.project.user.infra.impl;

import com.user.manager.first.project.user.domain.entity.Student;
import com.user.manager.first.project.user.repository.mapper.StudentMapper;
import com.user.manager.first.project.user.infra.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
