package com.user.manager.first.project.user.domain.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 人类
 * </p>
 *
 * @author liujie
 * @since 2019-11-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Person extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long personId;

    private Long teacherId;

    private String perscode;

    private String description;




}
