<!DOCTYPE html>
<html class=" js csstransforms3d"><head>
	<meta charset="utf-8">
	<meta name="renderer" content="webkit">
	<title>修改密码</title>
</head>

<body style="background: #f6f5fa;">
<form action="doChangepwd" method="post">
	<!--content S-->
	<div class="super-content">
		<div class="superCtab">
			<div class="publishArt">
				<h4>修改密码</h4>
				<div class="pubMain">
					<h5 class="pubtitle">旧密码</h5>
					<div class="pub-txt-bar">
						<input type="password" class="shuruTxt shuruTxt2" id="oldPwd">
					</div>
					<h5 class="pubtitle">新密码</h5>
					<div class="pub-txt-bar">
						<input type="password" class="shuruTxt shuruTxt2" id="newPwd">
					</div>
					<h5 class="pubtitle">确认密码</h5>
					<div class="pub-txt-bar">
						<input type="password" class="shuruTxt shuruTxt2" id="again" name="password">
					</div>
					<div class="pub-btn">
						<input type="submit" value="保存" class="saveBtn" onclick="get()">
						<#--<input type="submit" value="重置" class="resetBtn" formtarget="Mainindex">-->
					</div>
				</div>
			</div>
		</div>
		<!--main-->
	</div>
	<!--content E-->
</form>
</body>
<link rel="stylesheet" href="/css/base.css">
<link rel="stylesheet" href="/css/page.css">
<script type="text/javascript">
	function get() {
		var oldpwd=document.getElementById("oldPwd").value();
		var newpwd=document.getElementById("newPwd").value();
		var again=document.getElementById("again").value();
		if(oldpwd!=${user.password}){
			alert("请输入正确的旧密码！")
		}else if(newpwd!=again){
			alert("密码不一致！")
		}else{
			alert("请重新输入")
		}
	}
</script>
</html>