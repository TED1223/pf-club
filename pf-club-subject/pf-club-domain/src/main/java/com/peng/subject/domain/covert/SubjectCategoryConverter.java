package com.peng.subject.domain.covert;

import com.peng.subject.domain.entity.SubjectCategoryBO;
import com.peng.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 转换接口
 * @author: pengshengfeng
 * @date: 2024/2/20 9:43
 * @description:
 */
@Mapper
public interface SubjectCategoryConverter {

    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);

    SubjectCategory convertBoToCategory(SubjectCategoryBO subjectCategoryBO);


}
