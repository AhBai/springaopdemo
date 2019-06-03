package com.ahbai.mapper;

import com.ahbai.dto.MenuInfoDto;
import com.ahbai.dto.RoleInfoDto;
import com.ahbai.pojo.RoleInfo;

import java.util.List;

public interface RoleInfoMapper {

    /**
     *获取roleInfo加模糊查找
     */
    List<RoleInfo> getRoleInfos(RoleInfoDto roleInfo);

    List<MenuInfoDto> getMenus(int userId);

    /**
     *获取菜单烂
     */
    List<MenuInfoDto> getMenuInfos(int id);
}
