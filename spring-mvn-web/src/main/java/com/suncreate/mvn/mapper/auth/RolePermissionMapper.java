package com.suncreate.mvn.mapper.auth;

import com.suncreate.mvn.entity.auth.RolePermission;
import com.suncreate.mvn.mapper.BaseMapper;

public interface RolePermissionMapper extends BaseMapper<String, RolePermission> {

    public RolePermission findRolePermission(RolePermission per);

}
