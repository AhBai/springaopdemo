package com.ahbai.vo;

import java.util.List;

public class UserInfoVo {
    int userId;
    String pattern;
    List roleIds;
    int page;
    int pageSize;
    String queryMethod;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public List getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List roleIds) {
        this.roleIds = roleIds;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryMethod() {
        return queryMethod;
    }

    public void setQueryMethod(String queryMethod) {
        this.queryMethod = queryMethod;
    }

}
