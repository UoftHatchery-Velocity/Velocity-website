// $(document).ready(function(){       
   // var scroll_start = 0;
   // var startchange = $('.navbar-fixed-top');
   // var offset = startchange.offset();
   // $(document).scroll(function() { 
      // scroll_start = $(this).scrollTop();
      // if(scroll_start > offset.top) {
          // $('.navbar-fixed-top').css('background-color', 'rgba(34,34,34,0.9)');
       // } else {
          // $('.navbar-fixed-top').css('background-color', 'transparent');
       // }
   // });
// });


// $(document).ready(function(){
      // $(window).scroll(function() { // check if scroll event happened
        // if ($(document).scrollTop() > 10) { // check if user scrolled more than 50 from top of the browser window
          // $(".navbar-fixed-top").css("background-color", "transparent"); // if yes, then change the color of class "navbar-fixed-top" to white (#f8f8f8)
        // } else {
          // $(".navbar-fixed-top").css("background-color", "transparent"); // if not, change it back to transparent
        // }
      // });
    // });
	
// Drupal.behaviors.headerScrool={
	// attach: function (context) {
		// $(window).on("scroll", function() {
			// if ($(window).scrollTop()>50) {
				// $(".navbar-fixed-top").addClass("activeScrool",1000);
			// } else {
				// $(".navbar-fixed-top").removeClass("activeScrool", 1000);
			// }
		// }
	// }
// }

var $document = $(document),
	$element = $('.navbar'),
	navbarDefault = 'navbar-default';
	navbarTransparent = 'navbar-transparent';
	fadeInDown = 'fadeInDown';

$document.scroll(function(){
	if ($document.scrollTop()> 100) {
		$element.addClass(navbarDefault);
		$element.removeClass(navbarTransparent);
		$element.addClass(fadeInDown);
	} else {
		$element.addClass(navbarTransparent);
		$element.removeClass(navbarDefault);
		$element.removeClass(fadeInDown);
	}
});