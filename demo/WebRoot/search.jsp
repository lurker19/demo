<%@page import="com.house.utils.StringUtils"%>
<%@page import="com.house.vo.Rent"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>找好房</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		td {text-align: center;}
	</style>
  </head>
  
  <body>
    <h2>搜索好房子</h2>
    <hr/>
    <form action="search.do" method="post">
    <div>
    	查找条件：
    	<select name="type">
    		<option value="0">面积</option>
    		<option value="1">价格</option>
    		<option value="2">位置</option>
    	</select> <input name="sname"/> 
    	<input value="手气不错" type="submit"/>
    </div>
    </form>
    <div>
    	<table width="80%" border="1">
    		<tr>
    			<th>序号</th><th>图片</th><th>标题</th><th>价格</th><th>操作</th>
    		</tr>
    		<%
    		if(request.getAttribute("datas")!=null){
    		ArrayList<Rent> datas = (ArrayList<Rent>)request.getAttribute("datas") ;
    		for(int i=0;i<datas.size();i++){
    		%>
    		<tr>
    			<td><%=datas.get(i).getLid() %></td><td><img src="<%=datas.get(i).getRpicture() %>"></td><td><%=StringUtils.format(datas.get(i).getRtitle()) %></td><td><%=datas.get(i).getRprice() %></td><td><a href="#">查看详情</a></td>
    		</tr>
    		<%}} %>
    	</table>    	
    </div>
  </body>
</html>