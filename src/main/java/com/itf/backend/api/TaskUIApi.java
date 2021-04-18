package com.itf.backend.api;

import com.itf.backend.annotation.CurrentUser;
import com.itf.backend.annotation.LoginRequired;
import com.itf.backend.model.Module;
import com.itf.backend.model.Report;
import com.itf.backend.model.TaskUIMaterials;
import com.itf.backend.model.User;
import com.itf.backend.service.ReportService;
import com.itf.backend.service.TaskUIServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TaskUIApi {
    @GetMapping("/api/getTaskUIMaterials") //
    @ResponseBody
    List<TaskUIMaterials> listTaskUIMateByTaskID(TaskUIMaterials taskUIMaterials){
        return TaskUIServices.listTaskUIMateByTaskID(taskUIMaterials);
    }
}
