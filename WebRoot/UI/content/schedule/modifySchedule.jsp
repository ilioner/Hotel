<%@page import="entity.*"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>�ޱ����ĵ�</title>
<style type="text/css">
#apDiv1 {
	position:absolute;
	width:561px;
	height:123px;
	z-index:1;
	left: 6px;
	top: 14px;
}
#apDiv2 {
	position:absolute;
	width:558px;
	height:299px;
	z-index:2;
	left: 10px;
	top: 143px;
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
	left: 6px;
	top: 82px;
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
</style>
</head>

<body>
<div id="apDiv1">
  <p>&nbsp;</p>
  <div id="apDiv4">
  	<a href="#">#</a>
    <a href="#">#</a>
    <a href="#">#</a>
    <a href="#">#</a>
    <a href="#">#</a>
    <a href="#">#</a>
  
  </div>
  <p>&nbsp;</p>
</div>
<p>&nbsp;</p>
<div id="apDiv2">
  <div id="apDiv5">
  	<a href="/Hotel/UI/content/schedule/scheduleInfo.html">Ԥ��</a>
	<p><a href="#">�޸�</a></p>
    <p><a href="/Hotel/UI/content/schedule/deleteSchedule.html">ɾ��</a></p>
    <p>&nbsp;</p>
  </div>
  <div id="apDiv6">
  	adasda
  	<form action="/Hotel/scheduleInfo" method="post">
  		<input name="method" type="hidden" value="modifyThisSchedule">
  		
  		<a>���֤��</a><a><%=((HotelClient)(request.getAttribute("HotelClient"))).shenfenzheng %></a>
  		<p>&nbsp;</p>
  		<a>������</a>
  		<input type="text" name="shenfenzheng" value ="<%=((HotelClient)(request.getAttribute("HotelClient"))).shenfenzheng%>" hidden="hidden"/>
  		<input type="text" name="clientname" value ="<%=((HotelClient)(request.getAttribute("HotelClient"))).clientname%>"/>
  		<p>&nbsp;</p>
  		<a>�Ա�</a><input type="radio" name="sex" value="M" checked = "<%=(((HotelClient)(request.getAttribute("HotelClient"))).sex).equals("M")?"checked":""%>"><a>��</a>
  		<a>     </a><input type="radio" name="sex" value="F" checked = "<%=(((HotelClient)(request.getAttribute("HotelClient"))).sex).equals("F")?"checked":""%>"><a>Ů</a>
  		<p>&nbsp;</p>
  		<a>���䣺</a><input type="text" name="age" value ="<%=((HotelClient)(request.getAttribute("HotelClient"))).age%>">
  		<p>&nbsp;</p>
  		<a>���壺</a><input type="text" name="minzu" value ="<%=((HotelClient)(request.getAttribute("HotelClient"))).minzu%>">
  		<p>&nbsp;</p>
  		<a>�绰��</a><input type="text" name="dianhua" value ="<%=((HotelClient)(request.getAttribute("HotelClient"))).dianhua%>">
  		<p>&nbsp;</p>
  		<input type="submit" name="" value="�޸�">
  		<input type="reset" name="" value="����">
  	</form>
  </div>
</div>

</body>
</html>