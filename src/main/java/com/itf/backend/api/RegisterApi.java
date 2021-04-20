package com.itf.backend.api;

import com.alibaba.fastjson.JSONObject;
import com.itf.backend.model.User;
import com.itf.backend.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegisterApi {
    private RegService regService;

    @Autowired
    public RegisterApi(RegService regService) {
        this.regService = regService;
    }

    @PostMapping("")
    public Object add(@RequestBody User user) {
        if (regService.findByName(user.getName()) != null) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", "用户名已被使用");
            return jsonObject;
        }
        return regService.add(user);
    }


}