package com.suncreate.mvn.common.base.pagination;

import org.apache.commons.lang3.StringUtils;

import com.suncreate.mvn.common.base.model.Page;

/**
 * MySql方言
 */
public class MySQLDialect extends Dialect {

    /**
     * 构造分页SQL
     * 
     * @param sql
     *            原始SQL语句
     * @param page
     *            分页对象
     * @return String 构造后的分页SQL语句
     */
    @Override
    public String constructPageSql(String sql, Page<?> page) {
        sql = sql.trim();

        // 当前页数
        int currentPage = page.getCurrentPage();
        // 每页显示记录数
        int pageSize = page.getPageSize();

        StringBuilder pageSql = new StringBuilder(sql.length() + 50);
        pageSql.append(sql);
        constructOrderBy(page, pageSql);
        pageSql.append(" LIMIT " + Page.computeStartPage(currentPage, pageSize) + "," + pageSize);

        return pageSql.toString();
    }

    /**
     * 构造排序SQL
     * 
     * @param page
     *            分页对象
     * @param pageSql
     *            构造分页SQL的StringBuilder对象 <br/>
     *            注：1、如果原有SQL语句已经有ORDER BY语句，就追加排序字段 <br/>
     *            2、如果没有，就添加ORDER BY并追加排序字段
     */
    private static void constructOrderBy(Page<?> page, StringBuilder pageSql) {
        String orderBy = page.getOrderBy();
        if (StringUtils.isNotEmpty(orderBy)) {
            String tmpSql = pageSql.toString().toUpperCase();
            if (tmpSql.contains("ORDER BY"))
                pageSql.append(", " + orderBy);
            else
                pageSql.append(" ORDER BY " + orderBy);
        }
    }
}
