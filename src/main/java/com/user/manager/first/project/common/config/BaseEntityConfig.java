package com.user.manager.first.project.common.config;

import com.user.manager.first.project.common.cons.BaseConst;
import com.user.manager.first.project.user.domain.entity.BaseEntity;
import com.user.manager.first.project.user.infra.impl.DataInitServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@ConditionalOnClass(DataInitServiceImpl.class)
//@ConditionalOnProperty(prefix = "first.project", name = "auto" ,value = "true", matchIfMissing = false)
public class BaseEntityConfig {

    @Bean
    @ConditionalOnMissingBean(value = BaseEntity.class)
    BaseEntity baseEntity(){
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCreatedBy("是我就是我");
        baseEntity.setCreationTime(LocalDateTime.now());
        baseEntity.setEnabledFlag(BaseConst.Flag.YES);
        return baseEntity;
    }
}
