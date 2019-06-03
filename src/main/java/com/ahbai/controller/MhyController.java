package com.ahbai.controller;


import com.ahbai.pojo.UserInfo;
import com.ahbai.service.UserInfoService;
import com.ahbai.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class MhyController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "getValue")
    public String getValue(Model map){
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setPattern("");
        List<UserInfo> listUserInfo = userInfoService.getListUserInfo(userInfoVo);
        System.out.println(listUserInfo);
        map.addAttribute("userList",listUserInfo);
        return "zthy";
    }

}
