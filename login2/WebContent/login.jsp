<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
  
    <base href="<%=basePath%>">  
      
    <title>Login Page</title>  
      
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
    
  
  </head>  
    
  <body>  
<div id="div" style="width:300px; height:100px; border:1px solid #000; float:center;text-align: center;margin:0px auto;">

 Login Page <br>  
     <form action="login" method="post">  
     <table width="100%" border="0">
   <tr>
        <td>用户名：</td>
        <td><input type="text" name="userName" class="inputtext"/></td>
      </tr>
      <tr>
        <td>密码：</td>
        <td><input type="password" name="password" class="inputtext"/></td>
      </tr>
      <tr>
      </table>
    <input type="submit" value="Login">
    <input type="button" value="Register" onClick="window.location.href='register.jsp'"> 
    </form>  </div>
  </body>  
</html>  
