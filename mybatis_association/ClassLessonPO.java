package com.bennu.cmp.repo.dao.po;

import lombok.Data;

import java.util.Date;
@Data
public class ClassLessonPO {
    private Long id;

    private Long enterpriseId;

    private String classId;

    private Integer lessonNum;

    private String name;

    private Integer status;

    private Date startDate;

    private Date endDate;

    private Date createTime;

    private Date updateTime;

}