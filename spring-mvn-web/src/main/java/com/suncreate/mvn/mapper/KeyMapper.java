package com.suncreate.mvn.mapper;

import java.util.List;
import com.suncreate.mvn.common.base.model.Key;

public interface KeyMapper {

    /**
     * @return 返回key集合
     */
    List<Key> getTableValues(List<Key> keys);

    /**
     * @return 返回key集合(只存储表名)
     */
    List<Key> getTables();

}
