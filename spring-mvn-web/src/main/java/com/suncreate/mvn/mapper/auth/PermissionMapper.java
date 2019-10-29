package com.suncreate.mvn.mapper.auth;

import java.util.List;

import com.suncreate.mvn.entity.auth.Permission;
import com.suncreate.mvn.mapper.BaseMapper;

/**
 * @author Vincent.wang
 *
 */
public interface PermissionMapper extends BaseMapper<String, Permission> {

    /**
     * 查询用户所能访问的所有菜单
     *
     * @param userId
     *            用户
     * @return permissions 菜单
     */
    public List<Permission> findPermissionByUserId(String userId);

    /**
     * 根据菜单KEY查询菜单
     *
     * @param permissionKey
     *            菜单KEY
     * @return
     */
    public Permission findPermissionByKey(String permissionKey);
}
