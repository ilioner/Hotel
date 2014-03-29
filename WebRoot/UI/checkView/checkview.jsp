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
	width:945px;
	height:123px;
	z-index:1;
	left: 6px;
	top: 14px;
	background-image: url(../login/top.png);
}
#apDiv2 {
	position:absolute;
	width:687px;
	height:299px;
	z-index:2;
	left: 107px;
	top: 210px;
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
	left: -1px;
	top: 125px;
}
#apDiv5 {
	position:absolute;
	width:180px;
	height:299px;
	z-index:3;
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
	width:507px;
	height:301px;
	z-index:3;
	left: 182px;
	top: -3px;
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
<p>&nbsp;</p>
<div id="apDiv2">
  <div id="apDiv5">
  	<a href="/Hotel/checkServlet">房间入住情况</a>
  	<p>&nbsp;</p>
    <a href="/Hotel/UI/checkView/checkAClient.jsp">客户查询</a>
    <p>&nbsp;</p>
    <a href="/Hotel/checkServlet?listAll=YES">显示所有客户</a>
   <!--  <p><a href="#">#</a></p>
    <p><a href="#">#</a></p> -->
    <p>&nbsp;</p>
  </div>
  <div id="apDiv7"><table width="505" border="1">
  <tr>
    <th width="93" height="25" scope="row">房间号</th>
    <td width="99">入住状态</td>
    <td width="75">入住时间</td>
    <td width="81">退房时间</td>
  </tr>
</table>

<table width="503" border="1">
<% 
	ArrayList<HotelRoom> list = (ArrayList<HotelRoom>)request.getAttribute("roomList");
	for(int i=0;i<list.size();i++){
		HotelRoom room = list.get(i);
%>

  <tr>
    <th width="129" height="23" scope="row"><%=room.roomno %></th>
    <td width="136"><%=room.statue %></td>
    <td width="101"><%=room.startdate %></td>
    <td width="109"><%=room.enddate %></td>
  </tr>
<%
  	}
%>
</table>

</div>
</div>

</body>
</html>
