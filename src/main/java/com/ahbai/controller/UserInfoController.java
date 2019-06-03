package com.ahbai.controller;

import com.ahbai.dto.RoleDto;
import com.ahbai.pojo.UserInfo;
import com.ahbai.service.UserInfoService;
import com.ahbai.tool.PageUtil;
import com.ahbai.vo.UserInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    /**
     *登录
     */
    @ResponseBody
    @RequestMapping(value = "login1.do")
    public Object login(UserInfo userInfo, HttpSession httpSession){
        UserInfo login = userInfoService.findLogin(userInfo);
        if (login!=null){
            httpSession.setAttribute("userInfo",login);
            return true;
        }
            return false;
    }

//    /**
//     * 用户维护跳转 + 模糊查询
//     */
//    @ResponseBody
//    @RequestMapping(value = "listUserInfo")
//    public List<UserInfo> getListUserInfo(String pattern){
//        UserInfoVo userInfoVo = new UserInfoVo();
//        userInfoVo.setPattern(pattern);
//        return userInfoService.getListUserInfo(userInfoVo);
//    }

    /**
     * 用户维护跳转 + 模糊查询
     */
    @ResponseBody
    @RequestMapping(value = "listUserInfo")
    public HashMap getListUserInfo(@RequestBody UserInfoVo userInfoVo){
        //调用分页工具
        PageHelper.startPage(userInfoVo.getPage(),userInfoVo.getPageSize());
        //查找出list集合
        List<UserInfo> listUserInfo = userInfoService.getListUserInfo(userInfoVo);
        //把集合放入分页工具
        PageInfo pageInfo = new PageInfo(listUserInfo);
        //调用PageUtil分页工具，生成分页条
        String s = PageUtil.pageStr(pageInfo, userInfoVo.getQueryMethod());
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("list",pageInfo.getList());
        hashMap.put("page",s);
        return hashMap;
    }




    /**
     * 新添
     * @param userInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "addUserInfo")
    public Object addUserInfo(UserInfo userInfo){
        System.out.println(userInfo);
        int i = userInfoService.addUserInfo(userInfo);
        System.out.println(i);
        if (i>0){
            return true;
        }
        return false;
    }

    /**
     * 跳转修改用id获取数据
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "editUser")
    public Object editUser(@RequestParam int userId) {

    return userInfoService.findById(userId);
    }

    /**
     * 修改
     * @param userInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updateUserInfo")
    public Object updateUserInfo(UserInfo userInfo) {
        System.out.println(userInfo);
        int i = userInfoService.updateUser(userInfo);
        if (i>0){
            return true;
        }
        return null;
    }

    /**
     * 用id获取role
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getRole")
    public Object getRoleById(@RequestParam int userId) {
        return userInfoService.getRole(userId);
    }


    /**
     * 根据userid修改user_role
     */
    @ResponseBody
    @RequestMapping(value = "updateRole")
    public Object updateRole(@RequestBody UserInfoVo userInfoVo) {
        boolean b = userInfoService.updateRole(userInfoVo);

        return b;
    }


}