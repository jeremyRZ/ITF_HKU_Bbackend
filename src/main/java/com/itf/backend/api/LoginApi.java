package com.itf.backend.api;

import com.alibaba.fastjson.JSONObject;
import com.itf.backend.annotation.CurrentUser;
import com.itf.backend.annotation.LoginRequired;
import com.itf.backend.model.User;
import com.itf.backend.service.LoginService;
import com.itf.backend.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginApi {
    private LoginService loginService;
    private RegService regService;

    @Autowired
    public LoginApi(LoginService loginService, RegService regService) {
        this.loginService = loginService;
        this.regService = regService;
    }

    @PostMapping("")
    public Object login(@RequestBody User user) {
        User userInDataBase = regService.findByName(user.getName());
        JSONObject jsonObject = new JSONObject();
        if (userInDataBase == null) {
            jsonObject.put("message", "用户不存在");
        } else if (!regService.comparePassword(user, userInDataBase)) {
            jsonObject.put("message", "密码不正确");
        } else {
            String token = loginService.getToken(userInDataBase);
            jsonObject.put("token", token);
            jsonObject.put("user", userInDataBase);
        }
        return jsonObject;
    }

    @GetMapping("/getdata") //get information aboout user
    @LoginRequired
    public Object testCurrentUser(@CurrentUser User user) {
        return user;
    }
}