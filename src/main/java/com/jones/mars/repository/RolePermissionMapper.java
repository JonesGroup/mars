package com.jones.mars.repository;

import com.jones.mars.model.EnterpriseUser;
import com.jones.mars.model.query.RolePermissionQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolePermissionMapper {
    void insert(Object param);
    void delete(Object param);
    void deleteByRoleId(Integer roleId);
    List<EnterpriseUser> findGrantedUserByClassId(RolePermissionQuery query);
}
