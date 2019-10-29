package com.suncreate.mvn.service.workflow;

import java.util.List;

import com.suncreate.mvn.entity.activiti.LeaveBill;

public interface LeaveBillService {

    List<LeaveBill> findLeaveBillList();

    void saveLeaveBill(LeaveBill leaveBill);

    LeaveBill findLeaveBillById(Long id);

    void deleteLeaveBillById(Long id);

}
