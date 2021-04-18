package com.itf.backend.model;

import lombok.Data;

import java.awt.*;
import java.util.Date;

@Data
public class Report {
    private Integer id;
    private String moduleID;
    private String floor;
    private String drawingID;
    private Integer taskID;
    private String inspValues;
//    private String elementType;
//    private String defaultValues;
//    private String uniqueValues;
}
