<%@page import="entity.HotelClient"%>
<%@page import="entity.HotelRoom"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>无标题文档</title>
<style type="text/css">
#apDiv1 {
	position:absolute;
	width:771px;
	height:123px;
	z-index:1;
	left: 10px;
	top: 13px;
	background-image: url(../login/top.png);
}
#apDiv2 {
	position:absolute;
	width:566px;
	height:739px;
	z-index:2;
	left: 149px;
	top: 218px;
	background-image: url(../img/leftBg.jpg);
}
#apDiv3 {
	position:absolute;
	width:206px;
	height:292px;
	z-index:3;
	left: 68px;
	top: 7px;
}
#apDiv4 {
	position:absolute;
	width:555px;
	height:38px;
	z-index:3;
	left: 4px;
	top: 126px;
}
#apDiv5 {
	position:absolute;
	width:179px;
	height:737px;
	z-index:3;
	left: -1px;
	top: 0px;
}

#apDiv6 {
	position:absolute;
	width:371px;
	height:293px;
	z-index:3;
	left: 183px;
	top: 1px;
}
#apDiv7 {
	position:absolute;
	width:377px;
	height:301px;
	z-index:3;
	left: 182px;
	top: -3px;
}
#apDiv8 {
	position:absolute;
	width:387px;
	height:114px;
	z-index:4;
	left: 328px;
	top: 218px;
}
#apDiv9 {
	position:absolute;
	width:388px;
	height:87px;
	z-index:5;
	left: 2px;
	top: 12px;
}
#apDiv10 {
	position:absolute;
	width:385px;
	height:372px;
	z-index:5;
	left: 1px;
	top: 115px;
}
body {
	background-image: url(../img/contentBg.jpg);
}
</style>
</head>

<body>
<div id="apDiv1">
  <p>&nbsp;</p>
  <div id="apDiv4">
    <a href="/Hotel/UI/content/schedule/scheduleInfo.html">预订客户</a>
    <a href="/Hotel/checkServlet">查询客户</a>
    <a href="#">客户入住</a>
    <a href="#">客户退房</a>
  </div>
  <p>&nbsp;</p>
</div>

<div id="apDiv8">
  <div id="apDiv9">
  	<form action="/Hotel/checkServlet" method="post">
  <input type="hidden" name="method" value="getAClient">
  <a>请输入要查询的身份证:</a>
  <input type="text" name="shenfenzheng">
  <p>&nbsp;</p>
  <input type="submit" value="查找">
  <input type="reset" value="重置">
</form>
  </div>
  
  <div id="apDiv10">
  	<% HotelClient client = (HotelClient)request.getAttribute("client"); 
  	if(client!=null){
  %>
  	<a>姓名：</a><%=client.clientname %>
	<p>&nbsp;</p>
	<a>性别：</a><%=client.sex.equals("F")?"女":"男" %>
	<p>&nbsp;</p>
  	 <a>年龄：</a><%=client.age %>
 	 <p>&nbsp;</p>
   	<a>身份证：</a><%=client.shenfenzheng %>
 	 <p>&nbsp;</p>
  	 <a>民族：</a><%=client.minzu %>
  	<p>&nbsp;</p>
 	  <a>电话：</a><%=client.dianhua %>
 	 <p>&nbsp;</p>
  	 <a>房间号：</a><%=client.roomno==0?"未入住":client.roomno %>
 	 <p>&nbsp;</p>
 	  <a>是否预定：</a><%=client.yuding==0?"未入住":"入住" %>
  	<p>&nbsp;</p>
  <%
  	}
  %>
  </div>
</div>
<p>&nbsp;</p>
<div id="apDiv2">
  <div id="apDiv5">
  	<a href="/Hotel/checkServlet">房间入住情况</a>
  	<p>&nbsp;</p>
    <a href="#">客户查询</a>
    <p>&nbsp;</p>
    <a href="/Hotel/checkServlet?listAll=YES">显示所有客户</a>
   <!--  <p><a href="#">#</a></p>
    <p><a href="#">#</a></p> -->
    <p>&nbsp;</p>
  </div>
</div>

</body>
</html>