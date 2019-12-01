package com.user.manager.first.project.user.domain.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liujie
 * @since 2019-11-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Student extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long teacherId;

    private String personCode;

    private String code;

    private String description;

    private String enabledFlag;

    private String createdBy;

    private LocalDateTime creationTime;


}
