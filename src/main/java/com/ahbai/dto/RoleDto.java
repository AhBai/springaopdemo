package com.ahbai.dto;

import java.io.Serializable;

public class RoleDto implements Serializable {

    private int roleId;
    private String roleName;
    private String shortName;
    private int nulls;

    public RoleDto() {
    }

    public RoleDto(int roleId, String roleName, String shortName, int nulls) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.shortName = shortName;
        this.nulls = nulls;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getNulls() {
        return nulls;
    }

    public void setNulls(int nulls) {
        this.nulls = nulls;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", nulls=" + nulls +
                '}';
    }
}
