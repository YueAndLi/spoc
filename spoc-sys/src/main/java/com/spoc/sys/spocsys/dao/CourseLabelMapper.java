package com.spoc.sys.spocsys.dao;

import com.spoc.sys.spocsys.entity.CourseLabel;

public interface CourseLabelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseLabel record);

    int insertSelective(CourseLabel record);

    CourseLabel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseLabel record);

    int updateByPrimaryKey(CourseLabel record);
}