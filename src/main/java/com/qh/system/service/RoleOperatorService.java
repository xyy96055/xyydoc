package com.qh.system.service;

import com.qh.system.mapper.RoleOperatorMapper;
import com.qh.system.model.RoleOperator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleOperatorService {

    @Resource
    private RoleOperatorMapper roleOperatorMapper;

    public int insert(RoleOperator roleOperator) {
        return roleOperatorMapper.insert(roleOperator);
    }

}
