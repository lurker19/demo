<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>好找房——房屋租赁系统</title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="找房，靓房，房屋中介">
	<meta http-equiv="description" content="长沙市最好的网上房屋租赁网站之一">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css"> 
		body{background-image: url('images/bg.jpg');
			 background-attachment: fixed;
			 background-position: center;
			 background-repeat: no-repeat;
		}
		.login{width: 300px;height: 200px;border: 1px solid gray;background-color: #009ACD;
				float:right;margin-right: 150px;margin-top: 100px;
				}
		.login , .login div{color: #FFFFFF;text-align: center; margin:10px;}
	</style>
  </head>
  
  <body>
  	<form action="login.do" method="post">
      <div class="login">
      	<div>用户登陆</div>
      	<div>
      		<span>用户名字：</span><span><input name="unm"/></span>
      	</div>
      	<div>
      		<span>用户密码：</span><span><input name="upwd" type="password"/></span>
      	</div>
      	<div>
      		<span><input type="submit" value="登陆"/> <input type="reset"/></span>
      	</div>
      </div> 
      </form>     
      <div style="position :fixed; bottom: 0px; width: 100%;background-color: #c0c0c0;height: 50px;">
      	底部的一些版权信息。
      </div>
      <%
      	String msg = request.getAttribute("msg")+"" ;
      	if(msg != null && !msg.equals("null")){
      		out.println("<script>alert('"+msg+"')</script>") ;
      	}
       %>
      
  </body>
</html>
