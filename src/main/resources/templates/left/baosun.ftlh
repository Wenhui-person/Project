<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>报损管理</title>
</head>

<body>
<div class="superCtab">
    <div class="ctab-title clearfix">
        <h3>报损管理</h3>
        <a href="baosun_add" class="sp-column"><i class="ico-mng"></i>添加</a>
    </div>
    <div class="ctab-Mian-cont">
        <div class="Mian-cont-btn clearfix">
            <h class="BsearchText1">按商品编号查询：</h>
            <div class="BsearchBar1">
                <input type="text" id="" value="" class="form-control srhTxt" placeholder="输入商品编号">
                <input type="button" class="srhBtn" value="">
            </div>
            <h class="BsearchText2">按报损日期查询：</h>
            <div class="BsearchBar2">
                <input type="date" id="" value="" class="form-control srhTxt">
                <input type="button" class="srhBtn" value="">
            </div>
        </div>

        <div class="Mian-cont-wrap">
            <div class="defaultTab-T">
                <table border="0" cellspacing="0" cellpadding="0" class="defaultTable">
                    <tbody>
                    <tr>
                        <th class="t_1">报损单号</th>
                        <th class="t_2">商品编号</th>
                        <th class="t_3">报损日期</th>
                        <th class="t_4">报损数量</th>
                        <th class="t_5">报损原因</th>
                        <th class="t_7" colspan="2">操作</th>
                    </tr>
                    </tbody>
                </table>
            </div>
            <table border="0" cellspacing="0" cellpadding="0" class="defaultTable defaultTable2">
                <tbody>
                <#if loss ??>
                   <#list loss as losses>
                       <tr>
                           <td class="t_1" style="left:9px;">${losses.lossId}</td>
                           <td class="t_2">${losses.commodityId}</td>
                           <td class="t_3" style="left:9px;">${losses.lossDate?date}</td>
                           <td class="t_4" style="left:9px;">${losses.lossNum}</td>
                           <td class="t_5">${losses.state}</td>
                           <td class="t_7" colspan="2">
                               <div class="btn">
                                   <a href="#" class="detail">详情</a>
                                   <a href="#" class="modify">修改</a>
                               </div>
                           </td>
                       </tr>
                   </#list>
                </#if>
                </tbody>
            </table>
            <!--pages S-->
            <div class="pageSelect">
                <span>共 <b>188</b> 条 每页 <b>10 </b>条   1/18</span>
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
