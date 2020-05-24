$(function(){
	/*菜单收缩样式 经测试三级菜单栏也适用*/
	$('.menu a').on('click',function(){
        if (!$(this).hasClass('active')) {
            //展开未展开
            var aClassNames = $(this).attr('class');
            var aClassName = aClassNames.split(" ")[0];
        	$("."+aClassName+"_submenu").slideUp(300);
        	$("."+aClassName).removeClass('active');
        	$("."+aClassName+"_submenu a").removeClass('active');
            $(this).next('ul').slideDown(300);
            $(this).addClass('active');
        }else{
            //收缩已展开 已展开不管是点击的一级还是二级 所有ul都收缩
            $(this).next('ul').slideUp(300);
            $(this).removeClass('active');
        }
    })

    /*bootstrap下拉框选中样式*/
	$(".dropdown-toggle").bind('click',  function(event) {
		$(".dropdown-toggle").removeClass('active');
		$(this).addClass('active');
	});
})