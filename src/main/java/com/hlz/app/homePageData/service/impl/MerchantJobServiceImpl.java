package com.hlz.app.homePageData.service.impl;

import com.hlz.app.homePageData.dao.MerchantJobDao;
import com.hlz.app.homePageData.model.MerchantJob;
import com.hlz.app.homePageData.service.MerchantJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("merchantJobService")
public class MerchantJobServiceImpl implements MerchantJobService {

    @Autowired
    private MerchantJobDao merchantJobDao;

    @Override
    public int insertInfo(MerchantJob merchantJob) {
        int result = merchantJobDao.insert(merchantJob);
        return result;
    }
}
