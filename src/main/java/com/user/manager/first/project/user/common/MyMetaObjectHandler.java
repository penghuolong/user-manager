package com.user.manager.first.project.user.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createdBy", "liujie", metaObject);
        this.setFieldValByName("creationTime", LocalDateTime.now(), metaObject);
        this.setFieldValByName("enabledFlag", "Y", metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
