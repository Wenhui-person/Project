<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>商品信息修改</title>
</head>
<body>
<form action="doCommodityChange?commodityId=${commodityId}" method="post">
    <div class="super-content">
        <div class="superCtab">
            <div class="publishArt">
                <h4>商品信息修改</h4>
                <div class="pubMain">
                    <form action="" method="post">
                        <h5 class="pubtitle">商品编号</h5>
                        <div class="pub-txt-bar">
                            <h5 class="shuruTxt shuruTxt2">${commodityId}</h5>
                        </div>
                        <h5 class="pubtitle">商品名称</h5>
                        <div class="pub-txt-bar">
                            <input type="text" class="shuruTxt shuruTxt2" name="commodityTitle">
                            <!--<div class="errorBox">您所输入的旧密码不正确，请重新输入！</div>-->
                        </div>
                        <h5 class="pubtitle">商品类别</h5>
                        <div class="pub-txt-bar">
                            <select  name="commodityType">
                                <option>--请选择--</option>
                                <option>薯片</option>
                                <option>饼干</option>
                                <option>巧克力</option>
                                <option>肠类</option>
                                <option>饮料</option>
                                <option>日用品</option>
                                <option>其他</option>
                            </select>
                        </div>
                        <h5 class="pubtitle">生产日期</h5>
                        <div class="pub-txt-bar">
                            <input type="date" class="shuruTxt shuruTxt2" name="manuDate">
                        </div>
                        <h5 class="pubtitle">上架日期</h5>
                        <div class="pub-txt-bar">
                            <input type="date" class="shuruTxt shuruTxt2" name="groundDate">
                        </div>
                        <h5 class="pubtitle">保质期</h5>
                        <div class="pub-txt-bar" >
                            <input type="number" min="1" class="shuruTxt shuruTxt2" name="qualityPeriod">
                        </div>
                        <div class="pub-btn">
                            <input type="submit" value="保存" class="saveBtn">
                            <input type="button" value="返回" class="resetBtn" onClick="window.history.go(-1);">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
<link rel="stylesheet" href="../css/base.css">
<link rel="stylesheet" href="../css/page.css">
</html>
