package com.itf.backend.mapper;

import com.itf.backend.model.Report;

import java.util.List;

public interface ReportMapper {
    int add(Report report);
//
//    Report findOne(Report param);


    List<Report> listReportByTaskID(Report taskID);
}