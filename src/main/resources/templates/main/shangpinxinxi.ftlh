<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>商品</title>

</head>

<body style="background: #f6f5fa;">
	<form action="" method="post">
	<!--content S-->
	<div class="super-content RightMain" id="RightMain">
		
		<!--header-->
		<div class="superCtab">
			<div class="ctab-title clearfix">
				<h3>首页</h3>
				<a href="toCommodity_add" target="Mainindex" class="sp-column"><i class="ico-mng"></i>添加</a>
			</div>
				<div class="ctab-Mian-cont">
					<div class="Mian-cont-btn clearfix">
						<p class="searchText">条件查询：</p>
							<div class="searchBar">
								<input type="text"  name="commodityTitle" class="form-control srhTxt" placeholder="输入商品名称关键字搜索">
								<input type="button" class="srhBtn">
							</div>
					</div>
					<div class="Mian-cont-wrap">
						<div class="defaultTab-T">
							<table border="0" cellspacing="0" cellpadding="0" class="defaultTable">
								<tbody>
									<tr>
										<th class="t_1">商品编号</th>
										<th class="t_2">商品名称</th>
										<th class="t_3">商品类别</th>
										<th class="t_4">生产日期</th>
										<th class="t_5">上架时间</th>
										<th class="t_6">保质期/(月)</th>
										<th class="t_7">操作</th>
									</tr>
							</tbody>
							</table>
						</div>
						<table border="0" cellspacing="0" cellpadding="0" class="defaultTable defaultTable2">
							<tbody>
							<#if com ??>
								<#list com as commodity>
									<tr>
									<td class="t_1">${commodity.commodityId}</td>
									<td class="t_2">${commodity.commodityTitle}</td>
									<td class="t_3">${commodity.commodityType}</td>
									<td class="t_4" style="left:9px;">${commodity.manuDate?date}</td>
									<td class="t_5" style="left:9px;">${commodity.groundDate?date}</td>
									<td class="t_6">${commodity.qualityPeriod}</td>
									<td class="t_7">
										<div class="btn">
											<!--<a class="Top">置顶</a>-->
											<a href="toCommodityChange?commodityId=${commodity.commodityId}" class="modify">修改</a>
											<a href="doDeleteCommodity?commodityId=${commodity.commodityId}" class="delete" onclick="javascript: return delcfm();">删除</a>
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
		</div>
 </form>
</body>
<link rel="stylesheet" href="/css/base.css">
<link rel="stylesheet" href="/css/page.css">
<script type="text/javascript">
	$(function(){
		$("input[type='button']").click(function () {
			$("form").attr("action","doSelectCommodity").submit();
		});
	});
</script>
<script type="text/javascript">
	function delcfm() {
		if (!confirm("确认要删除？")) {
			return false;
		}
	}
</script>
</html>