package com.itf.backend.api;

import com.itf.backend.model.Module;
import com.itf.backend.model.Material;
import com.itf.backend.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static cn.hutool.core.lang.Console.log;

/**
 * 文章接口
 */
@CrossOrigin
@RestController
@RequestMapping("/api/material")
public class MaterialApi {
    private MaterialService materialService;

    @Autowired
    public MaterialApi(MaterialService materialService) {
        this.materialService = materialService;
    }

    @PostMapping("/sendMateData*")
    public Material add(@RequestBody Material material) {
        material = materialService.add(material);
        log(material);
        return material;
    }

//    @PostMapping("/generation")
//    @ResponseBody
//    public List<Material> listMaterialByTaskID(@RequestBody Material material) {
//        return MaterialService.listMaterialByTaskID(material);
//    }

//    @ResponseBody
//    public List<Material> listMaterialByTaskID(Material taskID){
//        System.out.println("11111");
//        return MaterialService.listMaterialByTaskID(taskID);
//    }
//    @PostMapping("")
//    public Object add(@RequestBody Material material) {
//        if (materialService.listMaterialByTaskID(material.getTaskID()) != null) {
//            JSONObject jsonObject = new JSONObject();
//            jsonObject.put("message","no record");
//            return jsonObject;
//        }
//        return materialService.add(material);
//    }
}