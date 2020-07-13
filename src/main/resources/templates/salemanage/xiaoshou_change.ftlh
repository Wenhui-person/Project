<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>销售信息修改</title>
</head>
<body>
<form action="doSaleChange?saleId=${saleId}" method="post">
    <div class="super-content">
        <div class="superCtab">
            <div class="publishArt">
                <h4>销售信息修改</h4>
                <div class="pubMain">
                    <form action="" method="post">
                        <h5 class="pubtitle">销售编号</h5>
                        <div class="pub-txt-bar">
                            <h3 class="shuruTxt shuruTxt2">${saleId}</h3>
                        </div>
                        <h5 class="pubtitle">商品编号</h5>
                        <div class="pub-txt-bar">
                            <input type="text" class="shuruTxt shuruTxt2" name="commodityId">
                        </div>
                        <h5 class="pubtitle">销售价格</h5>
                        <div class="pub-txt-bar">
                            <input type="text" class="shuruTxt shuruTxt2" name="salePrice">
                        </div>
                        <h5 class="pubtitle">销售日期</h5>
                        <div class="pub-txt-bar">
                            <input type="date" class="shuruTxt shuruTxt2" name="saleDate">
                        </div>
                        <h5 class="pubtitle">销售数量</h5>
                        <div class="pub-txt-bar">
                            <input type="text" class="shuruTxt shuruTxt2" name="saleNum">
                        </div>
                        <div class="pub-btn">
                            <input type="submit" id="" value="保存" class="saveBtn">
                            <input type="button" value="返回" class="resetBtn" onClick="window.history.go(-1);">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
<link rel="stylesheet" href="/css/base.css">
<link rel="stylesheet" href="/css/page.css">
</html>
