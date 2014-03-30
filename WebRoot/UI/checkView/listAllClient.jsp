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
	width:890px;
	height:123px;
	z-index:1;
	left: 6px;
	top: 14px;
	background-image: url(/Hotel/UI/login/top.png);
}
#apDiv2 {
	position:absolute;
	width:781px;
	height:299px;
	z-index:2;
	left: 128px;
	top: 210px;
	background-image: url(/Hotel/UI/img/leftBg.jpg);
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
	left: 8px;
	top: 126px;
}
#apDiv5 {
	position:absolute;
	width:179px;
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
	width:596px;
	height:301px;
	z-index:3;
	left: 182px;
	top: -3px;
}
body {
	background-image: url(/Hotel/UI/img/contentBg.jpg);
}
</style>
</head>

<body>
<div id="apDiv1">
  <p>&nbsp;</p>
  <div id="apDiv4">
    <a href="/Hotel/UI/content/schedule/scheduleInfo.html">预订客户</a>
    <a href="/Hotel/checkServlet">查询客户</a>
    <a href="/Hotel/checkInClient?method=getAll">客户入住</a>
    <a href="/Hotel/UI/checkoutView/checkOut.jsp">客户退房</a>
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
  <div id="apDiv7"><table width="597" border="1">
  <tr>
    <th width="93" height="25" scope="row">姓名</th>
    <td width="65">性别</td>
    <td width="55">年龄</td>
    <td width="42">民族</td>
    <td width="72">电话</td>
    <td width="80">身份证号</td>
    <td width="62">房间号</td>
    <td width="76">入住情况</td>
  </tr>
  <% 
	ArrayList<HotelClient> list = (ArrayList<HotelClient>)request.getAttribute("clientList");
	for(int i=0;i<list.size();i++){
		HotelClient client = list.get(i);
%>

  <tr>
    <th width="93" height="23" scope="row"><%=client.clientname %></th>
    <td width="65"><%=client.sex.equals("F")?"女":"男" %></td>
    <td width="55"><%=client.age %></td>
    <td width="42"><%=client.minzu %></td>
    <td width="72"><%=client.dianhua %></td>
    <td width="80"><%=client.shenfenzheng %></td>
    <td width="62"><%=client.roomno==0?"没有入住":client.roomno %></td>
    <td width="76"><%=client.yuding%></td>
  </tr>
<%
  	}
%>
</table>

</div>
</div>

</body>
</html>