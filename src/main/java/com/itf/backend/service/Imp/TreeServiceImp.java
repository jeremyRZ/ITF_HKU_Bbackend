package com.itf.backend.service.Imp;

import com.itf.backend.mapper.NodeMapper;
import com.itf.backend.model.DeptEntity;
import com.itf.backend.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangxk
 * @date 2020/5/26
 * @Description:
 */
@Service
public class TreeServiceImp implements TreeService{
    @Autowired
    private NodeMapper userDao;

    public List<DeptEntity> getNextNodeTree(Integer deptId){
        return userDao.getNextNodeTree(deptId);
    }

    public DeptEntity getNodeTree(){
        return userDao.getNodeTree();
    }
}