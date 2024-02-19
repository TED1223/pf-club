package com.peng.subject.application.controller;

import com.peng.subject.infra.basic.entity.SubjectCategory;
import com.peng.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author: pengshengfeng
 * @date: 2024/2/19 16:03
 * @description:
 */
@RestController
public class SubjectController {

    @Autowired
    public SubjectCategoryService subjectCategoryService;

    @GetMapping("/test")
    public String  test(){
        SubjectCategory subjectCategory = subjectCategoryService.queryById(14L);
        return subjectCategory.getCategoryName();
    }


}
