package com.suncreate.mvn.service.simple.impl;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suncreate.mvn.common.base.model.Page;
import com.suncreate.mvn.common.utils.UUIDUtil;
import com.suncreate.mvn.entity.auth.User;
import com.suncreate.mvn.entity.simple.News;
import com.suncreate.mvn.mapper.simple.NewsMapper;
import com.suncreate.mvn.service.simple.NewsService;

/**
 * @author Vincent.wang
 *
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public void addNews(News news, User user) {
        if (news != null) {
            news.setId(UUIDUtil.getRandom32PK());
            news.setUserId(user.getId());
            news.setCreateTime(Calendar.getInstance().getTime());
            newsMapper.insert(news);
        }
    }

    @Override
    public List<News> findNewsByKeywords(String keywords) {
        return newsMapper.findNewsByKeywords(keywords);
    }

    @Override
    public Page<News> findNewsByPage(Page<News> page, String keywords) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("keywords", keywords);
        page.setParamMap(param);
        List<News> news = newsMapper.findNewsByPage(page);
        page.setResultList(news);
        return page;
    }

}
