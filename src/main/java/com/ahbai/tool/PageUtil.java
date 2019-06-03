package com.ahbai.tool;

import com.github.pagehelper.PageInfo;

public class PageUtil {
    /**
     *生成分页条
     * @param pageInfo
     * @param queryMethod
     * @return
     */
    public static String pageStr(PageInfo pageInfo, String queryMethod) {

        StringBuilder sb = new StringBuilder();
        // 判断当前页是不是首页
        if (pageInfo.isIsFirstPage() || pageInfo.getPrePage() == 0) {
            sb.append("<li class=\"disabled\"><a href=\"javascript:void(0);\">上一页</a></li>");
        } else {
            sb.append("<li><a href=\"javascript:");
            sb.append(queryMethod);
            sb.append("(");
            sb.append(pageInfo.getPrePage());
            sb.append(",");
            sb.append(pageInfo.getPageSize());
            sb.append(",");
            sb.append("'");
            sb.append(queryMethod);
            sb.append("'");
            sb.append(")");
            sb.append("\">上一页</a></li>");
        }

        for (int i = 0; i < pageInfo.getNavigatepageNums().length; i++) {
            int pageNum = pageInfo.getNavigatepageNums()[i];
            if (pageInfo.getPageNum() == pageNum) {
                sb.append("<li class=\"active\"><a href=\"javascript:void(0);\">");
                sb.append(pageNum);
                sb.append("<span class=\"sr-only\">(current)</span></a></li>");
            } else {
                sb.append("<li><a href=\"javascript:");
                sb.append(queryMethod);
                sb.append("(");
                sb.append(pageNum);
                sb.append(",");
                sb.append(pageInfo.getPageSize());
                sb.append(",");
                sb.append("'");
                sb.append(queryMethod);
                sb.append("'");
                sb.append(")");
                sb.append("\">");
                sb.append(pageNum);
                sb.append("</a></li>");
            }
        }

        // 判断是否是尾页
        if (pageInfo.isIsLastPage() || pageInfo.getNextPage() == 0) {
            sb.append("<li class=\"disabled\"><a href=\"javascript:void(0);\">下一页</a></li>");
        } else {
            sb.append("<li><a href=\"javascript:");
            sb.append(queryMethod);
            sb.append("(");
            sb.append(pageInfo.getNextPage());
            sb.append(",");
            sb.append(pageInfo.getPageSize());
            sb.append(",");
            sb.append("'");
            sb.append(queryMethod);
            sb.append("'");
            sb.append(")");
            sb.append("\">下一页</a></li>");
        }

        /*sb.append("<li class=\"disabled controls\"><a href=\"javascript:void(0);\">当前第 ");
        sb.append("<input type=\"text\" maxLength=\"6\" value=\"");
        sb.append(pageInfo.getPageNum());
        sb.append("\" onkeypress=\"var e=window.event||this;var c=e.keyCode||e.which;if(c==13)" + queryMethod
                + "(this.value,");
        sb.append(pageInfo.getPageSize()).append(");\" onclick=\"this.select();\"/>");
        sb.append(" 页 / 共 ");
        sb.append(pageInfo.getPages());
        sb.append(" 页， 共 ");
        sb.append(pageInfo.getTotal());
        sb.append(" 条</a></li>");*/

        return sb.toString();

    }

}