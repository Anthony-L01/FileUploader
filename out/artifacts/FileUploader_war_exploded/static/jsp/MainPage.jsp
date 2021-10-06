<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Big Daddy</title>
    <link  rel="stylesheet" type="text/css" href="static/CSS/MainPage.css">

<script>
    alert("登陆成功");
</script>
</head>
<body>

<div class="title">
    <img src="static/img/logo.png"><br/>
</div>

<div class="line">
<span class="line1"><br/>大宝贝助手</span><br/><br/><br/>
    <script type="text/javascript">
        window.onload=function (){
            var file=document.getElementById("file2");
            file.onchange=function(){
                document.getElementById('shangchuan').innerHTML=file.files[0].name;
            }
        }
    </script>
    <div id="shangchuan"  onchange="getfilename()">请选择上传的文件
    </div>
    <br/>

    <form id="form1" action="${pageContext.request.contextPath}/UploadServlet" target="" method="post" enctype="multipart/form-data">

        <a href="javascript:;" id="file">选择文件
            <input type="file" name="" id="file2">
        </a><br/><br/>

        <input type="submit" class="file1"value="上传文件" >
    </form>
</div> 



</body>
</html>