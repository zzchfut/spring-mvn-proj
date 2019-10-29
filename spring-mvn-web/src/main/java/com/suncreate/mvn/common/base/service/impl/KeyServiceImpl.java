package com.suncreate.mvn.common.base.service.impl;

import java.util.ArrayList;
import java.util.List;

//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suncreate.mvn.common.base.model.Key;
import com.suncreate.mvn.common.base.service.KeyService;
import com.suncreate.mvn.common.datasource.DataSource;
import com.suncreate.mvn.common.datasource.DataSourceEnum;
import com.suncreate.mvn.mapper.KeyMapper;

/**
 * 
 * 主键生成
 *
 */
// @Path("key")
// @Produces({ MediaType.APPLICATION_JSON })
@Service
@DataSource(DataSourceEnum.MASTER)
public class KeyServiceImpl implements KeyService {

    @Autowired
    private KeyMapper keyMapper;

    public void setKeyMapper(KeyMapper keyMapper) {
        this.keyMapper = keyMapper;
    }

    // @Path("list")
    @Override
    public List<Key> getTableValues(List<Key> keys) {
        List<Key> keyList = new ArrayList<Key>();
        try {
            keyList = keyMapper.getTableValues(keys);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return keyList;
    }

    @Override
    public List<Key> getTables() {
        List<Key> keyList = new ArrayList<Key>();
        try {
            keyList = keyMapper.getTables();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return keyList;
    }
}
