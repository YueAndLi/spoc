package com.spoc.sys.spocsys.dao;

import com.spoc.sys.spocsys.entity.UserCourses;

public interface UserCoursesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCourses record);

    int insertSelective(UserCourses record);

    UserCourses selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCourses record);

    int updateByPrimaryKey(UserCourses record);
}