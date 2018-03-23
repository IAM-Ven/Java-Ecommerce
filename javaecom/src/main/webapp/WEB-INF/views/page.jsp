<!-- HEAD GADGETS -->
<%@include file="./shared/head.jsp"%>

<body class="ecommerce">

	<!-- PRE-HEADER -->
	<%@include file="./shared/preheader.jsp"%>

	<!--HEADER -->
	<div class="header">
		<div class="container">
			<a class="site-logo" href="${contextRoot}/javaecom/home"><img
				src="${corporate}/img/logos/logo-shop-red.png" width="48px"
				height="32px" alt="Metronic Shop UI">
			</a> 
			<a
				href="javascript:void(0);" class="mobi-toggler"><i
				class="fa fa-bars"></i> 
			</a>

			<!-- CART ICON -->
			<%@include file="./shared/carticon.jsp"%>

			<!-- NAVBAR -->
			<%@include file="./shared/nav.jsp"%>

		</div>
	</div>


	<!-- -----------------------------Display Inside Changes------------------------------------------------------- -->

	<c:if test="${homeactive ==true}">
		<!-- SLIDER -->
		<%@include file="slider.jsp"%>

		<div class="main">
			<div class="container">

				<!-- NEW ARRIVAL -->
				<%@include file="newarrival.jsp"%>

				<!-- SIDEBAR & POPULAR -->
				<div class="row margin-bottom-40 ">
					<%@include file="sidebarmenu.jsp"%>
					<%@include file="popular.jsp"%>
				</div>

				<!-- SUMMER & SLIDER -->
				<div class="row margin-bottom-35 ">
					<%@include file="summer.jsp"%>
					<%@include file="btmrightslider.jsp"%>
				</div>
			</div>
		</div>
	</c:if>
	
	<c:if test="${loginactive ==true}">
		<%@include file="./account/login.jsp"%>
	</c:if>
	<c:if test="${accountactive==true}">
		<%@include file="./account/account.jsp"%>
	</c:if>
	
	<c:if test="${checkoutactive==true}">
		<%@include file="./products/checkout.jsp"%>
	</c:if>

	<!-- -----------------------------Display Inside Changes------------------------------------------------------- -->

	<!-- BRANDS -->
	<%@include file="./shared/brand.jsp"%>

	<!-- FREE SHIPPING -->
	<%@include file="./shared/freeshipping.jsp"%>

	<!-- FOOTER -->
	<%@include file="./shared/footer.jsp"%>

	<!-- FAST VIEW PRODUCTS -->
	<%@include file="fastview.jsp"%>

	<!-- Load javascripts at bottom, this will reduce page load time -->
	<%@include file="./shared/jsplugins.jsp"%>

</body>
<!-- END BODY -->
</html>