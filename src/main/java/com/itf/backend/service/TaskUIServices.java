package com.itf.backend.service;


import com.itf.backend.mapper.TaskUIMapper;
import com.itf.backend.model.Module;

import com.itf.backend.model.TaskUIMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskUIServices {
    private static TaskUIMapper taskUIMapper;

    @Autowired
    public void TaskUIService(TaskUIMapper taskUIMapper) {
        this.taskUIMapper = taskUIMapper;
    }

//    public TaskUIMaterials add(TaskUIMaterials taskUIMaterials) {
//        TaskUIMapper.add(taskUIMaterials);
//        return taskUIMaterials;
//    }

    public static List<TaskUIMaterials> listTaskUIMateByTaskID(TaskUIMaterials taskUIMaterials) {
        return taskUIMapper.listTaskUIMateByTaskID(taskUIMaterials);
    }
}
