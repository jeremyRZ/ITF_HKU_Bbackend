package com.itf.backend.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Joiner;
import com.itf.backend.annotation.CurrentUser;
import com.itf.backend.annotation.LoginRequired;
import com.itf.backend.model.Module;
import com.itf.backend.model.Report;
import com.itf.backend.model.TaskUIMaterials;
import com.itf.backend.model.User;
import com.itf.backend.service.ReportService;
import com.itf.backend.service.TaskUIServices;
import lombok.var;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@CrossOrigin
@RestController
public class TaskUIApi {
    @GetMapping("/api/getTaskUIMaterials") //
    @ResponseBody
    List<TaskUIMaterials> listTaskUIMateByTaskID(TaskUIMaterials taskUIMaterials) {

        var result = TaskUIServices.listTaskUIMateByTaskID(taskUIMaterials);
//        String resultStr = Joiner.on(",").join(result);
//
//        JSONArray array = JSON.parseArray(resultStr);
//        System.out.println(array);
//        Iterator<Object> it = array.iterator();
//        while (it.hasNext()) {
//            JSONObject object = (JSONObject) it.next();
//            System.out.println(object);
//        }
        return TaskUIServices.listTaskUIMateByTaskID(taskUIMaterials);
    }
}
