<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.net.URLDecoder,javax.servlet.http.Cookie" %>

<html>
    <head>
        <meta charset="UTF-8">
        <title>数据源管理系统</title>
        <meta name="keywords" content="博客首页" />
        <meta name="description" content="" />
        <script type="text/javascript" src="js/jquery1.42.min.js"></script>
        <script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>
        <style type="text/css">
            body{
                
            }
            
            #header {
                width: 80%;
            }
            
            #header01 {
                width: 300px;
                float: right;
            }
            
            #left {
                border: 1px solid blue;
                float: left;
                width: 200px;
            }
            
            #divtitle {
                width:400px;
                float:left;
            }
            
            #content {
                width: 100%;
                float: left;
            }
        </style>
    </head>

    <body>
        <!--header start-->
        <div id="header">
            <div id="divtitle" >
                <font size="22" color="blue">鹏元征信有限公司</font>
            </div>
            <div id="header01">
		        <a title="登陆者" href="javascript:void(0)" onclick="fun_a()"
		            style="font-size: 22px;">登陆者</a> &nbsp;&nbsp;<a
		            style="font-size: 22px;" title="退出登录"
		            href="<c:url value='/toQuit.do?' />">退出</a>
		    </div>
        </div>
        <div class="clear"></div>
        <!--content start-->
        <div id="content">
            <!-- left start -->
            <div id="left">
            <ul>
		        <li><a href="<c:url value='/queryCustomerList.do?nickname=' />">客户资料</a></li>
		        <li><a href="#">数据描述</a></li>
		        <li><a href="#">关联产品</a></li>
		        <li><a href="#">数据源质量测试</a></li>
		        <li><a href="#">数据源性能测试管理</a></li>
		        <li><a href="#">数据异议</a></li>
		        <li><a href="#">故障记录</a></li>
		        <li><a href="#">接口规范文档管理</a></li>
		        <li><a href="#">账单管理</a></li>
		        <li><a href="#">发票管理</a></li>
		        <li><a href="#">合同管理</a></li>
		        <div class="clear"></div>
		    </ul>
            </div>
            <!-- left end -->
            <!-- right start -->
            <div id="right">
               
            </div>            
            <!-- right start -->
        </div>
        <!--content end-->
        
        <!--footer start-->
        <div id="footer">
        
        </div>
        <!--footer end-->
        
    </body>
    <script type="text/javascript">
	    
    </script>
    
</html>
