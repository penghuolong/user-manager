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
public class User extends BaseEntity {

    @TableId
    private static final long serialVersionUID = 1L;

    private Long userId;

    private String userName;

    private LocalDateTime lastUpdateTime;

    private String lastUpdatedBy;


}
