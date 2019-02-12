package com.spoc.sys.spocsys.dao;

import com.spoc.sys.spocsys.entity.SysProclamation;

public interface SysProclamationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysProclamation record);

    int insertSelective(SysProclamation record);

    SysProclamation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysProclamation record);

    int updateByPrimaryKey(SysProclamation record);
}