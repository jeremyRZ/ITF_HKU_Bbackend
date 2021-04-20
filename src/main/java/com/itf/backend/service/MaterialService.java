package com.itf.backend.service;


import com.itf.backend.mapper.MaterialMapper;
import com.itf.backend.model.Module;
import com.itf.backend.model.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    private static MaterialMapper materialMapper;

    @Autowired
    public MaterialService(MaterialMapper materialMapper) {
        this.materialMapper = materialMapper;
    }

    public Material add(Material material) {
        materialMapper.add(material);
        return material;
    }

//    public static List<Material> listMaterialByTaskID(Material material) {
//        return materialMapper.listMaterialByTaskID(material);
//    }


}