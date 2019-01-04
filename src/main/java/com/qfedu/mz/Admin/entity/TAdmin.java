package com.qfedu.mz.Admin.entity;

import com.baomidou.ant.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TAdmin extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private String password;

    /**
     * 标记位 1有效 2无效
     */
    private Integer flag;


}
