package com.peng.subject.application.converter;

import com.peng.subject.application.dto.SubjectCategoryDTO;
import com.peng.subject.domain.entity.SubjectCategoryBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 转换接口
 *
 * @author: pengshengfeng
 * @date: 2024/2/20 9:43
 * @description:
 */
@Mapper
public interface SubjectCategoryConverter {

    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);

    SubjectCategoryBO convertDTOToCategory(SubjectCategoryDTO subjectCategoryDTO);


}
