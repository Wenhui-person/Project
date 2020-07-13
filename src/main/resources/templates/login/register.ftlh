<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
</head>
<body>
<form action="doRegister" method="post">
    <div class="RpublishArt">
        <h4>账户注册</h4>
        <div class="RpubMain">
            <h5 class="pubtitle">用户ID</h5>
            <div class="Rpub-txt-bar">
                <input type="text" class="shuruTxt shuruTxt2" name="userid">
            </div>
            <h5 class="pubtitle">姓名</h5>
            <div class="Rpub-txt-bar">
                <input type="password" class="shuruTxt shuruTxt2" name="name">
                <!--<div class="errorBox">您所输入的旧密码不正确，请重新输入！</div>-->
            </div>
            <h5 class="pubtitle">密码<span>（数字、字母、符号组合，最少8个字符）</span></h5>
            <div class="Rpub-txt-bar">
                <input type="password" min="0" class="shuruTxt shuruTxt2" name="password">
            </div>
            <h5 class="pubtitle">角色</h5>
            <div class="Rpub-txt-bar">
                <input type="text" class="shuruTxt shuruTxt2" name="role">
            </div>
            <h5 class="pubtitle">联系电话</h5>
            <div class="Rpub-txt-bar">
                <input type="text" class="shuruTxt shuruTxt2" name="phone">
            </div>
            <div class="Rpub-btn">
                <input type="submit" id="" value="保存" class="saveBtn">
                <input type="button" id="" value="返回" class="resetBtn" onclick="window.history.go(-1);">
            </div>
        </div>
    </div>
</form>
</body>
<link rel="stylesheet" type="text/css" href="/css/base.css">
<link rel="stylesheet" type="text/css" href="/css/page.css">
</html>