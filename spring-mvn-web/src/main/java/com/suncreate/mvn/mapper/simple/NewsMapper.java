package com.suncreate.mvn.mapper.simple;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.suncreate.mvn.common.base.model.Page;
import com.suncreate.mvn.entity.simple.News;
import com.suncreate.mvn.mapper.BaseMapper;

/**
 * @author Vincent.wang
 *
 */
public interface NewsMapper extends BaseMapper<String, News> {

    List<News> findNewsByKeywords(@Param("keywords") String keywords);

    List<News> findNewsByPage(Page<News> page);

}
