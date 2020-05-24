
// 密码隐藏展示功能
function showHidePsw(){
	var type = $("#login_form #password").attr("type");
	var $img = $("#login_form #eye");
	var $pw = $("#login_form #password");
	if (type=='password') {
		$pw.attr('type', 'text');
	}else{
		$pw.attr('type', 'password');
	}
}
