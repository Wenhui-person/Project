<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>进货管理</title>
</head>

<body>
<div class="superCtab">
    <div class="ctab-title clearfix">
        <h3>进货管理</h3>
        <a href="jinhuo_add" class="sp-column"><i class="ico-mng"></i>添加</a>
    </div>
    <div class="ctab-Mian-cont">
        <div class="Mian-cont-btn clearfix">
            <h class="CsearchText1">按采购编号查询：</h>
            <div class="CsearchBar1">
                <input type="text" id="" value="" class="form-control srhTxt" placeholder="输入商品编号">
                <input type="button" class="srhBtn" value="">
            </div>
            <h class="CsearchText2">按采购时间查询：</h>
            <div class="CsearchBar2">
                <input type="date" id="" value="" class="form-control srhTxt">
                <input type="button" class="srhBtn" value="">
            </div>
            <h class="CsearchText3">按采购人员查询：</h>
            <div class="CsearchBar3">
                <input type="text" id="" value="" class="form-control srhTxt" placeholder="输入姓名关键字">
                <input type="button" class="srhBtn" value="">
            </div>
        </div>

        <div class="Mian-cont-wrap">
            <div class="defaultTab-T">
                <table border="0" cellspacing="0" cellpadding="0" class="defaultTable">
                    <tbody>
                    <tr>
                        <th class="t_1">采购单号</th>
                        <th class="t_2">商品编号</th>
                        <th class="t_3">采购日期</th>
                        <th class="t_4">进价</th>
                        <th class="t_5">采购数量</th>
                        <th class="t_6">采购人员</th>
                        <th class="t_7" colspan="2">操作</th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <table border="0" cellspacing="0" cellpadding="0" class="defaultTable defaultTable2">
                <tbody>
                <#if stockgood ??>
                    <#list stockgood as stockgoods>
                        <tr>
                            <td class="t_1" style="left:9px;">${stockgoods.stockgoodId}</td>
                            <td class="t_2">${stockgoods.commodityId}</td>
                            <td class="t_3" style="left:9px;">${stockgoods.inDate?date}</td>
                            <td class="t_4" style="left:9px;">${stockgoods.inPrice}</td>
                            <td class="t_5">${stockgoods.stockgoodNum}</td>
                            <td class="t_6" style="left:9px;">${stockgoods.buyer}</td>
                            <td class="t_7" colspan="2">
                                <div class="btn">
                                    <a href="#" class="detail" style="margin-left: 28px;">详情</a>
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
</html>
