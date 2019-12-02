package com.user.manager.first.project.user.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {
    @TableField(value = "created_by", fill = FieldFill.INSERT)
    private String createdBy;
    @TableField(value = "creation_time", fill = FieldFill.INSERT)
    private LocalDateTime creationTime;
    @TableLogic
    @TableField(value = "enabled_flag", fill = FieldFill.INSERT)
    private String enabledFlag;
}
