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
        </style>
    </head>

    <body>
        <!--header start-->
        <div id="header">
        <font size="22" color="blue">鹏元征信有限公司</font>
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
            <div id="right">
                <form action="/springMybatis01/doUpdateCustomer.do">
                <input type="hidden" name="nickname" value="yanc"/>
                客户业务信息
                <table>
                    <tr class="tr_color1">
                        <td>数据源编号：</td><td><input type="text" name="customer_id" readonly="readonly" value="${preCustomer.suppCustomerId }"/></td>
                        <td>负责人：</td><td><input type="text" name="chargeperson" value="${preCustomer.suppCustomerChargePerson }"/></td>
                    </tr>
	                <tr class="tr_color0">
	                    <td>机构类型：</td><td><input type="text" name="supptype" value="${preCustomer.suppCustomerSupptype }"/></td>
	                    <td>客户状态：</td><td><input type="text" name="status" value="${preCustomer.suppCustomerStatus }"/></td>
	                </tr>
	                <tr class="tr_color1">
                        <td>注册资本：</td><td><input type="text" name="registercapital" value="${preCustomer.suppCustomerRegisterCapital }"/></td>
                        <td><input type="hidden" name="contactNum" value="${contactNum }"/></td>
                    </tr>
	            </table>
	            <br/>
	               <%
                   int i = 0;
                    %>
                <c:forEach items="${contactList}" var="contact">
                
                    客户联系信息<%=++i %>
                <table>
                    
                    <tr class="tr_color1">
                        <td>联系人姓名：</td><td><input type="text" name="contact_name<%=i %>" value="${contact.suppContactName }"/></td>
                        <td>角色：</td><td><input type="text" name="role_name<%=i %>" value="${contact.suppRoleName }"/></td>
                    </tr>
                    <tr class="tr_color0">
                        <td>部门职位：</td><td><input type="text" name="departposition<%=i %>" value="${contact.suppContactDepartposition }"/></td>
                        <td>移动电话：</td><td><input type="text" name="mobilephone<%=i %>" value="${contact.suppContactMobilephone }"/></td>
                    </tr>
                    <tr class="tr_color1">
                        <td>办公电话：</td><td><input type="text" name="officephone<%=i %>" value="${contact.suppContactOfficephone }"/></td>
                        <td>电子邮件：</td><td><input type="text" name="email<%=i %>" value="${contact.suppContactEmail }"/></td>
                    </tr>
                    <tr class="tr_color0">
                        <td>传真：</td><td><input type="text" name="fax<%=i %>" value="${contact.suppContactFax }"/></td>
                        <td>QQ：</td><td><input type="text" name="qq<%=i %>" value="${contact.suppContactQQ }"/></td>
                    </tr>
                    <tr class="tr_color1">
                        <td>地址信息：</td><td><input type="text" name="address<%=i %>" value="${contact.suppContactAddress }"/></td>
                    </tr>
                    <tr class="tr_color0">
                        <td>备注：</td><td><input type="text" name="note<%=i %>" value="${contact.suppContactNote }"/></td>
                        <td><input type="hidden" name="contact_id<%=i %>" value="${contact.suppContactId }"/></td>
                    </tr>
                </table>
                <br/>
                </c:forEach>
                <table>
                    <tr class="tr_color0">
                        <td><input type="submit" value="编辑"/></td><td><a>取消编辑</a></td>
                    </tr>
                </table>
                </form>
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
