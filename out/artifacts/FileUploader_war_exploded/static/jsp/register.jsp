<%--
  Created by IntelliJ IDEA.
  User: lxc
  Date: 2021/10/4
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <base href="http://localhost:8080/FileUploader_war_exploded/">
    <link  rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/CSS/register.css">

    <!-- 注册按钮的单击事件-->
    <script type="text/javascript">

        function onClick()
        {
            //检查用户名
            var username = document.getElementById("username").value;

            //正则表达式
            var patt=/^\w{5,12}$/;
            if(!patt.test(username))
            {
                alert("用户名不合法");
                return false;
            }
            //检查密码
            var password1= document.getElementById("password1").value;
            if(!patt.test(password1))
            {
                alert("密码不合法");
                return false;
            }
            var password2= document.getElementById("password2").value;
            if(password1!=password2)
            {
                alert("两次密码不一样");
                return false;
            }
            return true;
        }
    </script>

</head>
<body>
<div class="title">
    <img src="${pageContext.request.contextPath}/static/img/logo.png"><br/>
</div>

<div class="down">
    <form action= "regist" method="post" >
        <h1  id="title">用户注册</h1>
        <p>
            用户名:<input id="username" name="username"type="text"/>
            <span class="tip" > <%= request.getAttribute("msg")==null?"（用户名为5到12位数字、字母、下划线的组合）":request.getAttribute("msg")%></span>
        </p>
        <p>
        密&emsp;码:<input id="password1" name="password" type="password"/>
        <span  class="tip">（密码为5到12位数字、字母、下划线的组合）</span>
        </p>
        <p id="password22">
        确认密码:<input id="password2"type="password"/>
        </p>
        <p>
        <input id=reg type="submit" value="立即注册" onclick=" return onClick()"/>
        </p>
        <br/>
        <p>
        已有账号？<a href="${pageContext.request.contextPath}/index.jsp">请登录</a>
        </p>
        </form>


        </div>



        </body>
        </html>