<%@page import="java.util.HashMap"%>
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
<Script Language="JavaScript">
	function checkOut()
	{
		var idCard = document.getElementById('shenfenzheng').innerHTML;
		var roomNo = document.getElementById('roomno').innerHTML;
		document.getElementById("checkOut").href="/Hotel//CheckOut?idCard="+idCard+"&roomNo="+roomNo;
	}
</script>
<style type="text/css">
#apDiv1 {
	position:absolute;
	width:996px;
	height:123px;
	z-index:1;
	left: 6px;
	top: 14px;
	background-image: url(/Hotel/UI/login/top.png);
}
#apDiv2 {
	position:absolute;
	width:865px;
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
	width:684px;
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
    <a href="#">客户退房</a>
  </div>
  <p>&nbsp;</p>
</div>
<p>&nbsp;</p>
<div id="apDiv2">
  <div id="apDiv5">
  	<a >退房</a>
  	<p>&nbsp;</p>
    <a>输入房间号</a>
    <form action="/Hotel/CheckOut" method="post" target="_blank">
    
    <input name="roomno" type="text">
    <input name="查找" type="submit" value="查找">
    
    </form>
   <!--  <p><a href="#">#</a></p>
    <p><a href="#">#</a></p> -->
    <p>&nbsp;</p>
  </div>
  <div id="apDiv7"><table width="680" border="1">
  <% 
	HashMap map = (HashMap)request.getAttribute("hashmap");
	if(map!=null){
%>	

  <tr>
    <th width="108" height="25" scope="row">姓名</th>
    <td width="36">性别</td>
    <td width="137">身份证号</td>
    <td width="65">房间号</td>
    <td width="119">入住时间</td>
    <td width="98">退房时间</td>
    <td width="71">操作</td>
  </tr>

  <tr>
    <th width="108" height="23" scope="row"><a id="clientname"><%=map.get("clientname") %></th>
    <td width="36"><a id="sex"><%=map.get("sex") %></td>
    <td width="137"><a id="shenfenzheng"><%=map.get("shenfenzheng") %></td>
    <td width="65"><a id="roomno"><%=map.get("roomno") %></td>
    <td width="119"><a id="startdate"><%=map.get("startdate") %></td>
    <td width="98"><a id="enddate"><%=map.get("enddate") %></td>
    <td width="71"><a onclick="checkOut()" id="checkOut">退房</a></td>
  </tr>
  <%
	}

%>
</table>

</div>
</div>

</body>
</html>