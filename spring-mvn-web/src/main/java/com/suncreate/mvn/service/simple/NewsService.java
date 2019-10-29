package com.suncreate.mvn.service.simple;

import java.util.List;

import com.suncreate.mvn.common.base.model.Page;
import com.suncreate.mvn.entity.auth.User;
import com.suncreate.mvn.entity.simple.News;

/**
 * @author Vincent.wang
 *
 */
public interface NewsService {

    public void addNews(News news, User user);

    public List<News> findNewsByKeywords(String keywords);

    public Page<News> findNewsByPage(Page<News> page,String keywords);

}