package com.peng.subject.application.dto;

import lombok.Data;
import lombok.ToString;

/**
 * 题目分类(SubjectCategory)实体类
 *
 * @author makejava
 * @since 2024-02-19 16:34:14
 */
@Data
@ToString
public class SubjectCategoryDTO {
    /**
     * 主键
     */
    private Long id;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 分类类型
     */
    private Integer categoryType;
    /**
     * 图标连接
     */
    private String imageUrl;
    /**
     * 父级id
     */
    private Long parentId;

}

