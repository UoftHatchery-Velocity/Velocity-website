$(document).ready(function(){
	$(window).on("scroll",function(){
  	var wn = $(window).scrollTop();
    if(wn > 600){
    	$(".navbar").css("background","white").css("transition","0.4s ease-in-out ");
		$(".navbar-default .navbar-nav > li > a ").css("color","black");
		$(".navbar-default .navbar-nav > li > a ").css("opacity",".6");
    }
    else{
    	$(".navbar").css("background","transparent").css("transition","0.4s ease-in-out ");
		$(".navbar-default .navbar-nav > li > a ").css("color","#fcf8e3");
		$(".navbar-default .navbar-nav > li > a ").css("opacity","1");
    }
  });
});