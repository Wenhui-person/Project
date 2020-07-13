<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>商品库存</title>
</head>

<body>
<div class="superCtab">
    <div class="ctab-title clearfix">
        <h3>库存管理</h3>
        <a href="kucun_add" class="sp-column"><i class="ico-mng"></i>添加</a>
    </div>
    <div class="ctab-Mian-cont">
        <div class="Mian-cont-btn clearfix">
            <h class="CsearchText1">按商品编号查询：</h>
            <div class="CsearchBar1">
                <input type="text" id="" value="" class="form-control srhTxt" placeholder="输入商品编号">
                <input type="button" class="srhBtn" value="">
            </div>
            <h class="CsearchText2">按入库时间查询：</h>
            <div class="CsearchBar2">
                <input type="date" id="" value="" class="form-control srhTxt">
                <input type="button" class="srhBtn" value="">
            </div>
            <h class="CsearchText3">按出库时间查询：</h>
            <div class="CsearchBar3">
                <input type="date" id="" value="" class="form-control srhTxt">
                <input type="button" class="srhBtn" value="">
            </div>
        </div>

        <div class="Mian-cont-wrap">
            <div class="defaultTab-T">
                <table border="0" cellspacing="0" cellpadding="0" class="defaultTable">
                    <tbody>
                    <tr>
                        <th class="t_1">库存编号</th>
                        <th class="t_2">商品编号</th>
                        <th class="t_3">存量</th>
                        <th class="t_4">入/出库日期</th>
                        <th class="t_5">库存状态</th>
                        <th class="t_6">签收人</th>
                        <th class="t_7" colspan="2">操作</th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <table border="0" cellspacing="0" cellpadding="0" class="defaultTable defaultTable2">
                <tbody>
                <#if stock ??>
                    <#list stock as stocks>
                        <tr>
                            <td class="t_1">${stocks.stockId}</td>
                            <td class="t_2">${stocks.commodityId}</td>
                            <td class="t_3" style="left:10px;">${stocks.stockNum}</td>
                            <td class="t_4" style="left:9px;">${stocks.inoutwareDate?date}</td>
                            <td class="t_5">${stocks.stockState}</td>
                            <td class="t_6" style="left:9px;">${stocks.signer}</td>
                            <#switch stocks.stockState>
                                <#case "未出库">
                                    <td class="t_7" colspan="2">
                                        <div class="btn">
                                            <a href="#" class="detail">详情</a>
                                            <a href="#" class="modify">出库</a>
                                        </div>
                                    </td><#break>
                                <#case "已出库">
                                    <td class="t_7" colspan="2">
                                        <div class="btn">
                                            <a href="#" class="detail">详情</a>
                                        </div>
                                    </td><#break>
                            </#switch>
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
</html>
