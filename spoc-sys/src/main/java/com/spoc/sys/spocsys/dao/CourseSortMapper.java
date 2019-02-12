package com.spoc.sys.spocsys.dao;

import com.spoc.sys.spocsys.entity.CourseSort;

public interface CourseSortMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseSort record);

    int insertSelective(CourseSort record);

    CourseSort selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseSort record);

    int updateByPrimaryKey(CourseSort record);
}