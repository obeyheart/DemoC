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
		            href="<c:url value='/toQuit.do?' />">退出</a>
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
            <a href="<c:url value='/addCustomer.do ' />">添加数据源</a>
            <div id="right">
                <table>
	                <tr class="tr_color0">
	                    <th>编码</th>
	                    <th>机构类型</th>
	                    <th>单位</th>
	                    <th>业务负责人</th>
	                    <th>签约</th>
	                    <th>签约时间</th>
	                    <th>产品</th>
	                    <th>客户状态</th>
	                    <th>操作</th>
	                </tr>
	                <%
	                int i = 0;
	                %>
                <c:forEach items="${customerList}" var="customer">
                    <%
                    i++;
                    %>
                    <tr class="tr_color<%=i%2 %>">
                        <td>${customer.suppCustomerId }</td>
                        <td>${customer.suppCustomerSupptype }</td>
                        <td>${customer.suppCustomerCompany }</td>
                        <td>${customer.suppCustomerChargePerson }</td>
                        <td>${customer.suppCustomerIssign }</td>
                        <td>${customer.suppCustomerSigntime }</td>
                        <td>${customer.suppCustomerIsproduct }</td>
                        <td>${customer.suppCustomerStatus }</td>
                        <td><a href="<c:url value='/customerDetails.do?nickname=yanc&customer_id=${customer.suppCustomerId }' />">查看</a>&nbsp;
                        <a href="<c:url value='/deleteCustomer.do?nickname=yanc&customer_id=${customer.suppCustomerId }' />">删除</a></td>
                    </tr>
                </c:forEach>
                </table>
                <center>
                        共${pb.tp}页&nbsp;&nbsp;
	                <a id="startPage"
	                    href="<c:url value='/showBlogsFenye.do?pc=1' />">首页</a>
	                &nbsp;<a id="prevPage"
	                    href="<c:url value='/showBlogsFenye.do?pc=${pb.pc-1}' />">上一页</a>
	                &nbsp;${pb.pc}&nbsp;
	                <a id="nextPage"
	                    href="<c:url value='/showBlogsFenye.do?pc=${pb.pc+1}' />">下一页</a>
	                &nbsp;<a  id="endPage"
	                    href="<c:url value='/showBlogsFenye.do?pc=${pb.tp}' />">尾页</a>
	                &nbsp;前往<input id="yeshu" type="text"  style="width:30px;" />页&nbsp;<input id="goPage" type="button" value="GO"/>
	            </center>
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
