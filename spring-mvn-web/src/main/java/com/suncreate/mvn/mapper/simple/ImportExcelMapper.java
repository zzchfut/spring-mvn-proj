package com.suncreate.mvn.mapper.simple;

import com.suncreate.mvn.entity.simple.ImportExcel;
import com.suncreate.mvn.mapper.BaseMapper;

/**
 * @author Vincent.wang
 *
 */
public interface ImportExcelMapper extends BaseMapper<String, ImportExcel> {

    public void updateStartTime();

    public void updateEndTime();

    public void updateEndTimeByWeekend();

}
