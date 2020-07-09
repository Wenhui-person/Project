<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>进货添加</title>
</head>

<body>
<div class="super-content">
    <div class="superCtab">
        <div class="publishArt">
            <h4>采购添加</h4>
            <div class="pubMain">
                <h5 class="pubtitle">商品编号</h5>
                <div class="pub-txt-bar">
                    <input type="text" class="shuruTxt shuruTxt2"><b class="error"></b>
                </div>
                <h5 class="pubtitle">采购日期<!--<span>（数字、字母、符号组合，最少8个字符）</span>--></h5>
                <div class="pub-txt-bar">
                    <input type="date" class="shuruTxt shuruTxt2">
                    <!--<div class="errorBox">您所输入的旧密码不正确，请重新输入！</div>-->
                </div>
                <h5 class="pubtitle">进价</h5>
                <div class="pub-txt-bar">
                    <input type="number" min="0" class="shuruTxt shuruTxt2">
                </div>
                <h5 class="pubtitle">采购数量</h5>
                <div class="pub-txt-bar">
                    <input type="number" min="1" class="shuruTxt shuruTxt2">
                </div>
                <h5 class="pubtitle">采购人</h5>
                <div class="pub-txt-bar">
                    <input type="text" class="shuruTxt shuruTxt2">
                </div>
                <div class="pub-btn">
                    <input type="button" id="" value="保存" class="saveBtn">
                    <input type="button" id="" value="返回" class="resetBtn">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<link rel="stylesheet" href="/css/base.css">
<link rel="stylesheet" href="/css/page.css">
</html>
