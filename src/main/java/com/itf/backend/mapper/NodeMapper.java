package com.itf.backend.mapper;

import com.itf.backend.model.DeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author huangxk
 * @date 2020/5/26
 * @Description:
 */
@Mapper
public interface NodeMapper {
    DeptEntity getNodeTree();
    List<DeptEntity> getNextNodeTree(int deptId);
}