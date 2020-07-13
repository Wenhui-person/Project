<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>销售详情</title>
</head>
<body>
<div class="super-content">
    <div class="superCtab">
        <div class="publishArt">
            <h4>销售详情</h4>
            <div class="pubMain">
                <h5 class="pubtitle">销售编号</h5>
                <div class="pub-txt-bar">
                    <h3 class="shuruTxt shuruTxt2">${sale.saleId}</h3>
                </div>
                <h5 class="pubtitle">售价</h5>
                <div class="pub-txt-bar">
                    <h3 class="shuruTxt shuruTxt2">${sale.salePrice}</h3>
                </div>
                <h5 class="pubtitle">销售日期</h5>
                <div class="pub-txt-bar">
                    <h3 class="shuruTxt shuruTxt2">${sale.saleDate?date}</h3>
                </div>
                <div class="pub-btn">
                    <input type="button" value="返回" class="resetBtn" onclick="window.history.go(-1);">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<link rel="stylesheet" href="/css/base.css">
<link rel="stylesheet" href="/css/page.css">
</html>
