package com.itf.backend.service;


import com.itf.backend.mapper.ReportMapper;

import com.itf.backend.model.Module;
import com.itf.backend.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReportService {
    private static ReportMapper reportMapper;

    @Autowired
    public ReportService(ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }

    public static List<Report> listReportByTaskID(Report taskID, Module module) {
        return reportMapper.listReportByTaskID(taskID);
    }


}