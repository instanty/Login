<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>register</title>  
      
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
    <!-- 
    <link rel="stylesheet" type="text/css" href="styles.css"> 
    -->  
  
  </head>  
    
  <body>  
  <div id="div" style="width:300px; height:110px; border:1px solid #000; float:center;text-align: center;margin:0px auto;">
   User Register Page. <br>  
     <form action="register" method="post">  
    username:<input type="text" name="userName"><br>  
    password:<input type="password" name="password"><br>
    password:<input type="password" name="rePassword"><br>
    <input type="submit" value="Register">  
    <input type="button" value="Login" onClick="window.location.href='login.jsp'"> 
    </form>  
    </div>
  </body>  
</html>  
