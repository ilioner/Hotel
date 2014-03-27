<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
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
  	<a href="/Hotel/UI/content/schedule/scheduleInfo.html">1</a>
	<p><a href="#">2</a></p>
    <p><a href="/Hotel/UI/content/schedule/deleteSchedule.html">3</a></p>
    <p>&nbsp;</p>
  </div>
  <div id="apDiv6">
  	adasda
  	<form action="/Hotel/scheduleInfo" method="post">
  		<input name="method" type="hidden" value="yuding">
  		<a>姓名：</a><input type="text" name="clientname">
  		<p>&nbsp;</p>	
  		<a>性别：</a><input type="radio" name="sex" value="M"><a>男</a>
  		<a>     </a><input type="radio" name="sex" value="F"><a>女</a>
  		<p>&nbsp;</p>
  		<a>年龄：</a><input type="text" name="age">
  		<p>&nbsp;</p>
  		<a>身份证：</a><input type="text" name="shenfenzheng">
  		<p>&nbsp;</p>
  		<a>民族：</a><input type="text" name="minzu">
  		<p>&nbsp;</p>
  		<a>电话：</a><input type="text" name="dianhua">
  		<p>&nbsp;</p>
  		<input type="submit" name="" value="预定">
  		<input type="reset" name="" value="重置">
  	</form>
  </div>
</div>

</body>
</html>