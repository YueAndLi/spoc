package com.spoc.sys.spocsys.dao;

import com.spoc.sys.spocsys.entity.SysUserInfo;

public interface SysUserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserInfo record);

    int insertSelective(SysUserInfo record);

    SysUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserInfo record);

    int updateByPrimaryKey(SysUserInfo record);
}