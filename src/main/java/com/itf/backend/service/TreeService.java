package com.itf.backend.service;

import com.itf.backend.model.DeptEntity;

import java.util.List;

/**
 * @author huangxk
 * @date 2020/5/26
 * @Description:
 */
public interface TreeService {

    List<DeptEntity> getNextNodeTree(Integer deptId);

    DeptEntity getNodeTree();

}