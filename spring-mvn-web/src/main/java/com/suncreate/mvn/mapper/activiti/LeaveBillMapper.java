package com.suncreate.mvn.mapper.activiti;

import java.util.List;

import com.suncreate.mvn.entity.activiti.LeaveBill;
import com.suncreate.mvn.mapper.BaseMapper;

public interface LeaveBillMapper extends BaseMapper<Long, LeaveBill> {

    public List<LeaveBill> findAll();

    public void saveLeaveBill(LeaveBill leaveBill);

    public void updateLeaveBill(LeaveBill leaveBill);

}
