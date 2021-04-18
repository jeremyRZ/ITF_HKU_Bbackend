package com.itf.backend.api;

import com.alibaba.fastjson.JSONObject;
import com.itf.backend.annotation.CurrentUser;
import com.itf.backend.annotation.LoginRequired;
import com.itf.backend.model.Module;
import com.itf.backend.model.Post;
import com.itf.backend.model.Report;
import com.itf.backend.model.User;
import com.itf.backend.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章接口
 */
@CrossOrigin
@RestController
@RequestMapping("/api/report")
public class ReportApi {
    private ReportService reportService;

    @Autowired
    public ReportApi(ReportService reportService) {
        this.reportService = reportService;
    }

    @PostMapping("/sendInspData")
    public Report add(@RequestBody Report report) {
        report = reportService.add(report);
        return report;
    }

    @PostMapping("/generation")
    @ResponseBody
    public List<Report> listReportByTaskID(@RequestBody Report taskID, Module module){
        return ReportService.listReportByTaskID(taskID,module);
    }

//    @ResponseBody
//    public List<Report> listReportByTaskID(Report taskID){
//        System.out.println("11111");
//        return ReportService.listReportByTaskID(taskID);
//    }
//    @PostMapping("")
//    public Object add(@RequestBody Report report) {
//        if (reportService.listReportByTaskID(report.getTaskID()) != null) {
//            JSONObject jsonObject = new JSONObject();
//            jsonObject.put("message","no record");
//            return jsonObject;
//        }
//        return reportService.add(report);
//    }
}