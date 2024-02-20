package com.peng.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.peng.subject.application.converter.SubjectCategoryConverter;
import com.peng.subject.application.dto.SubjectCategoryDTO;
import com.peng.subject.common.entity.Result;
import com.peng.subject.domain.entity.SubjectCategoryBO;
import com.peng.subject.domain.service.SubjectCategoryDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: pengshengfeng
 * @date: 2024/2/20 9:47
 * @description:
 */
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class SubjectCategoryController {

    @Autowired
    public SubjectCategoryDomainService subjectCategoryDomainService;

    @PostMapping("/add")
    public Result add(@RequestBody SubjectCategoryDTO subjectCategoryDTO) {
        try{
            if (log.isInfoEnabled()){
                log.info("SubjectCategoryController.add.dto:{}", JSON.toJSONString(subjectCategoryDTO));
            }
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryConverter.INSTANCE.convertDTOToCategory(subjectCategoryDTO);
             subjectCategoryDomainService.add(subjectCategoryBO);
             return Result.ok(true);
        }catch (Exception e){
            return Result.fail();
        }
    }

}
