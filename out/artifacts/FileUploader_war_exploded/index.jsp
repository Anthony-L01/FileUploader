<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link  rel="stylesheet" type="text/css" href="static/CSS/login.css">
</head>
<body>
<div class="title">
    <img src="static/img/logo.png"><br/>
</div>

<div class="down">
    <form action="http://localhost:8080/FileUploader_war_exploded/login" method="post">
        <h1 id="title">请登录</h1>
        <span class="error"> <%=request.getAttribute("msg")==null?"":request.getAttribute("msg")%></span><br/>
        <p>
            用户名:<input name="username" type="text"/>
           <br/>
        </p>
        <p>
            密&emsp;码:<input name="password" type="password"/>
        </p>
        <p>
            <input id=reg type="submit" value="立即登录" />
        </p>
        <p>
            还没有账号？<a href="static/jsp/register.jsp">请注册</a>
        </p>
    </form>


</div>



</body>
</html>