package com.peng.subject.domain.service.impl;

import com.alibaba.fastjson.JSON;
import com.peng.subject.domain.covert.SubjectCategoryConverter;
import com.peng.subject.domain.entity.SubjectCategoryBO;
import com.peng.subject.domain.service.SubjectCategoryDomainService;
import com.peng.subject.infra.basic.entity.SubjectCategory;
import com.peng.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: pengshengfeng
 * @date: 2024/2/20 9:39
 * @description:
 */
@Service
@Slf4j
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {

    @Resource
    private SubjectCategoryService subjectCategoryService;


    public void add(SubjectCategoryBO subjectCategoryBO) {
        if (log.isInfoEnabled()){
            log.info("SubjectCategoryDomainService.add.bo:{}", JSON.toJSONString(subjectCategoryBO));
        }
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE.convertBoToCategory(subjectCategoryBO);
        subjectCategoryService.insert(subjectCategory);
    }
}
