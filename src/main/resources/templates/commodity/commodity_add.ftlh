<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>商品添加</title>
</head>

<body>
<form action="doCommodity_add" method="post">
    <div class="super-content">
        <div class="superCtab">
            <div class="publishArt">
                <h4>添加商品</h4>
                <div class="pubMain">
                    <h5 class="pubtitle">商品编号</h5>
                    <div class="pub-txt-bar">
                        <input type="text" class="shuruTxt shuruTxt2" name="commodityId"><b class="error"></b>
                    </div>
                    <h5 class="pubtitle">商品名称<!--<span>（数字、字母、符号组合，最少8个字符）</span>--></h5>
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
                    <div class="pub-txt-bar">
                        <input type="number" min="1" class="shuruTxt shuruTxt2" name="qualityPeriod">
                    </div>
                    <div class="pub-btn">
                        <input type="submit" id="" value="确定" class="saveBtn">
                        <input type="button" id="" value="返回" class="resetBtn">
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
<link rel="stylesheet" href="/css/base.css">
<link rel="stylesheet" href="/css/page.css">
</html>
