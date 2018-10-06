package com.jones.mars.service;

import com.jones.mars.object.BaseResponse;
import com.jones.mars.repository.BaseMapper;
import com.jones.mars.repository.EnterpriseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService extends BaseService {
    @Autowired
    private EnterpriseMapper mapper;

    @Override
    public BaseMapper getMapper() {
        return this.mapper;
    }


    /**
     * TODO 企业加人， enterpriseUser
     * @return
     */
    public BaseResponse addUser(){
        return BaseResponse.builder().build();
    }

}
