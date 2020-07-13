<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="renderer" content="webkit">
	<title>公共头部</title>
</head>

<body>
<div class="super-header clearfix">
	<h2>进销存管理系统1.0</h2>
	<div class="head-right">
		<i class="ico-user"></i>当前用户：
		<div class="userslideDown">
			<a href="javascript:;" class="superUser">${user.name}<i class="ico-tri"></i></a>
			<div class="slidedownBox">
				<ul>
					<li><a href="toChangepwd?password=${user.password}&userid=${user.userid}" target="Mainindex">修改密码</a></li>
					<li><a href="" target="_parent">退出</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!--header-->
</body>
<link rel="stylesheet" href="/css/base.css">
<link rel="stylesheet" href="/css/page.css">
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/main.js"></script>
<script type="text/javascript" src="/js/modernizr.js"></script>
</html>