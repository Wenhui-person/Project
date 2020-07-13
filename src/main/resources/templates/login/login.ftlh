<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>登录</title>
</head>

<body>
<form id="login-form" action="doLogin" method="post">
    <legend>登录</legend>
    <label for="login">账号:</label>
    <input type="text" id="login" name="userid"/>
    <div class="clear"></div>
    <label for="password">密码:</label>
    <input type="password" id="password" name="password"/>
    <div class="clear"></div>
    <!--<input type="checkbox" id="remember_me" style="position: relative;top: 3px;margin: 0;" name="remember_me"/>-->
    <div class="clear"></div>
    <input type="submit"  class="button" name="commit" value="登       录"/>
</form>
<a href="toRegister" id="Lk" target="_self">立即注册</a>
<p><strong>&copy;www.ywh.cn</strong></p>

</body>
<link rel="stylesheet" type="text/css" href="/css/login.css"/>
</html>