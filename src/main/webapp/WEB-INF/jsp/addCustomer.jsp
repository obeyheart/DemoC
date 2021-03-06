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
            
            div {
                width: 80%;
            }
            
            #header01 {
                width: 500px;
                float: right;
            }
            
            #left {
                border: 1px solid blue;
                float: left;
                width: 200px;
            }
            #right {
                border: 1px solid blue;
                float: right;
                
            }
            
            .tr_color0 {
                background-color: #EEEEEE;
            }
            .tr_color1 {
                background-color: #FBFBFB;
            }
            #divtitle {
                width: 400px;
                
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
		            href="#">退出</a>
		    </div>
        </div>
        <div class="clear"></div>
        <!--content start-->
        <div id="content">
            <!-- left start -->
            <div id="left">
            <ul>
		        <li><a href="<c:url value='/queryCustomerList.do' />">客户资料</a></li>
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
            <form action="/springMybatis01/doAddCustomer.do">
            <table>
                <tr><td>机构类型:</td><td><input type="text" name="supptype"/></td></tr>
                <tr><td>单位:</td><td><input type="text" name="company"/></td></tr>
                <tr><td>业务负责人:</td><td><input type="text" name="chargeperson"/></td></tr>
                <tr><td>签约:</td><td><input type="text" name="issign"/></td></tr>
                <tr><td>签约时间:</td><td><input type="text" name="signtime"/></td></tr>
                <tr><td>产品:</td><td><input type="text" name="isproduct"/></td></tr>
                <tr><td>客户状态:</td><td><input type="text" name="status"/></td></tr>
                <tr><td>注册资本:</td><td><input type="text" name="registercapital"/></td></tr>
                <tr><td><input type="submit" name="save" value="添加数据源" /></td><td><a href="login.do">取消添加</a></td></tr>
            </table>
	        </form>
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
