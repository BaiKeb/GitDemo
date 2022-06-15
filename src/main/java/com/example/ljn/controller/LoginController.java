package com.example.ljn.controller;

import com.example.ljn.api.CommonResult;
import com.example.ljn.entity.User;
import com.example.ljn.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Eli Shaw
 * @Date: 2019-11-14 11:33:26
 * @Description：
 */
@RestController
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody User vo) {
        System.out.println("用户："+vo.getUsername());
        System.out.println("密码："+vo.getPassword());

        User vo1 = userService.login(vo);
//        if (vo.getUsername().equals("admin") && vo.getPassword().equals("123456"))
        if(vo1 != null)
            return CommonResult.success("admin");
        else
            return CommonResult.validateFailed();
    }
}
