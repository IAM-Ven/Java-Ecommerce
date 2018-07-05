<!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->


<script src="${plugins}/jquery.min.js" type="text/javascript"></script>
<script src="https://code.jquery.com/ui/1.10.3/jquery-ui.js"
	type="text/javascript"></script>
<script src="${plugins}/jquery-migrate.min.js" type="text/javascript"></script>
<script src="${plugins}/bootstrap/js/bootstrap.min.js"
	type="text/javascript"></script>
<script src="${corporate}/scripts/back-to-top.js" type="text/javascript"></script>
<script src="${plugins}/jquery-slimscroll/jquery.slimscroll.min.js"
	type="text/javascript"></script>

<!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
<script src="${plugins}/fancybox/source/jquery.fancybox.pack.js"
	type="text/javascript"></script>
<!-- pop up -->
<script src="${plugins}/owl.carousel/owl.carousel.min.js"
	type="text/javascript"></script>
<!-- slider for products -->
<script src='${plugins}/zoom/jquery.zoom.min.js' type="text/javascript"></script>
<!-- product zoom -->
<script src="${plugins}/bootstrap-touchspin/bootstrap.touchspin.js"
	type="text/javascript"></script>
<!-- Quantity -->
<!-- <script src="http://maps.google.com/maps/api/js?sensor=true"
	type="text/javascript"></script> -->
<script src="${pages}/scripts/bs-carousel.js" type="text/javascript"></script>
<script src="${plugins}/uniform/jquery.uniform.min.js"
	type="text/javascript"></script>
<script src="${pages}/scripts/checkout.js" type="text/javascript"></script>
<script src="${plugins}/respond.min.js"></script>
<script src="${pages}/scripts/contact-us.js" type="text/javascript"></script>
<%-- <script src="${plugins}/gmaps/gmaps.js" type="text/javascript"></script>
 --%>
<script src="${plugins}/rateit/src/jquery.rateit.js"
	type="text/javascript"></script>
<script src="${corporate}/scripts/layout.js" type="text/javascript"></script>

<script type="text/javascript">
	jQuery(document).ready(function() {
		Layout.init();
		//ContactUs.init();
		Layout.initOWL();
		Layout.initImageZoom();
		Layout.initTouchspin();
		Layout.initTwitter();
		Layout.initUniform();
		Checkout.init();
		Layout.initSliderRange();
	});
</script>
<!-- END PAGE LEVEL JAVASCRIPTS -->