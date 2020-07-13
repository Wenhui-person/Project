<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>销售信息</title>
</head>

<body>
<div class="superCtab">
    <div class="ctab-title clearfix">
        <h3>销售管理</h3>
        <a href="xiaoshou_add" class="sp-column"><i class="ico-mng"></i>添加</a>
    </div>
    <div class="ctab-Mian-cont">
        <div class="Mian-cont-btn clearfix">
            <h class="SsearchText1">按编号查询：</h>
            <div class="SsearchBar1">
                <input type="text" id="" value="" class="form-control srhTxt" placeholder="输入商品编号">
                <input type="button" class="srhBtn" value="">
            </div>
            <h class="SsearchText2">按时间查询：</h>
            <div class="SsearchBar2">
                <input type="date" id="" value="" class="form-control srhTxt">
                <input type="button" class="srhBtn" value="">
            </div>
        </div>

        <div class="Mian-cont-wrap">
            <div class="defaultTab-T">
                <table border="0" cellspacing="0" cellpadding="0" class="defaultTable">
                    <tbody>
                    <tr>
                        <th class="t_1">销售编号</th>
                        <th class="t_2">商品编号</th>
                        <th class="t_3">售价</th>
                        <th class="t_4">销售日期</th>
                        <th class="t_5">销售数量</th>
                        <th class="t_7" colspan="2">操作</th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <table border="0" cellspacing="0" cellpadding="0" class="defaultTable defaultTable2">
                <tbody>
                <#if xiaoshou ??>
                    <#list xiaoshou as sales>
                        <tr>
                            <td class="t_1">${sales.saleId}</td>
                            <td class="t_2">${sales.commodityId}</td>
                            <td class="t_3">${sales.salePrice}</td>
                            <td class="t_4" style="left:9px;">${sales.saleDate?date}</td>
                            <td class="t_5" style="left:9px;">${sales.saleNum}</td>

                            <td class="t_7" colspan="2">
                                <div class="btn">
                                    <a href="doSaleDetail?saleId=${sales.saleId}" class="detail">详情</a>
                                    <a href="toSaleChange?saleId=${sales.saleId}" class="modify">修改</a>
                                    <a href="doDeleteSale?saleId=${sales.saleId}" class="delete" onclick="javascript: return delcfm();">删除</a>
                                </div>
                            </td>
                        </tr>
                    </#list>
                </#if>
                </tbody>
            </table>
            <!--pages S-->
            <div class="pageSelect">
                <span>共 <b>18</b> 条 每页 <b>10 </b>条   1/18</span>
                <div class="pageWrap">
                    <a class="pagePre"><i class="ico-pre">&nbsp;</i></a>
                    <a href="#" class="pagenumb cur">1</a>
                    <a href="#" class="pagenumb">2</a>
                    <a href="#" class="pagenumb">3</a>
                    <a href="#" class="pagenext">
                        <i class="ico-next">&nbsp;</i>
                    </a>
                </div>
            </div>
            <!--pages E-->
        </div>
    </div>
</div>
</body>
<link rel="stylesheet" href="/css/base.css">
<link rel="stylesheet" href="/css/page.css">
<script type="text/javascript">
    function delcfm() {
        if (!confirm("确认要删除？")) {
            return false;
        }
    }
</script>
</html>
