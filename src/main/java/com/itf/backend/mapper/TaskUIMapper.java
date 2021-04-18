package com.itf.backend.mapper;

import com.itf.backend.model.Report;
import com.itf.backend.model.TaskUIMaterials;

import java.util.List;

public interface TaskUIMapper {
//    int add(TaskUIMaterials taskUIMaterials);
//
//    Report findOne(Report param);


    List<TaskUIMaterials> listTaskUIMateByTaskID(TaskUIMaterials taskUIMaterials);
}