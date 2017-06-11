<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!--   -->
<!-- 页数 -->
<div class="message">

</div>
<div style="text-align:center;">
    <ul class="pagination">
        <!-- <li><a href="#">&laquo;</a></li> -->
        共${pagehelper.total}条记录，当前显示第&nbsp;${pagehelper.pageNum}/${pagehelper.pages}&nbsp;页
        <c:if test="${!pagehelper.isFirstPage}">
            <a href="javascript:queryAll(${pagehelper.firstPage}, ${pagehelper.pageSize});">首页</a>
            <a href="javascript:queryAll(${pagehelper.prePage}, ${pagehelper.pageSize});">上一页</a>
        </c:if>
        <c:forEach items="${pagehelper.navigatepageNums}" var="navigatepageNum">
            <c:if test="${navigatepageNum==pagehelper.pageNum}">
                <a href="javascript:queryAll(${navigatepageNum}, ${pagehelper.pageSize});">${navigatepageNum}</a>
            </c:if>
            <c:if test="${navigatepageNum!=pagehelper.pageNum}">
                <a href="javascript:queryAll(${navigatepageNum}, ${pagehelper.pageSize});">${navigatepageNum}</a>
            </c:if>
        </c:forEach>
        <c:if test="${!pagehelper.isLastPage}">
            <a href="javascript:queryAll(${pagehelper.nextPage}, ${pagehelper.pageSize});">下一页</a>
            <a href="javascript:queryAll(${pagehelper.lastPage}, ${pagehelper.pageSize});">最后一页</a>
        </c:if>
        <!-- <li><a href="#">&raquo;</a></li> -->
    </ul>
</div>
