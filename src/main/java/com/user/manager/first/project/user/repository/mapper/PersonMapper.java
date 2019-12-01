package com.user.manager.first.project.user.repository.mapper;

import com.user.manager.first.project.user.domain.entity.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swagger.annotations.ApiImplicitParams;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 人类 Mapper 接口
 * </p>
 *
 * @author liujie
 * @since 2019-11-30
 */
@Mapper
@Repository
public interface PersonMapper extends BaseMapper<Person> {

}
