package com.bennu.cmp.repo.dao.po;

import lombok.Data;

@Data
public class ClassLessonExtraPO {

    private ClassLessonPO classLessonPO;

    private String coursewareId;

    private String coursewareVersion;

    private String campusId;

    private String campusName;

    private String classroomId;

    private String classroomName;

}
