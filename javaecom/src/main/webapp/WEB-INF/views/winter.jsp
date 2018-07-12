<!-- BEGIN CONTENT -->
<div class="col-md-12">
	<h2>Winter</h2>
	<div class="owl-carousel owl-carousel3">
		<c:forEach items="${winter}" var="wntr">
			<div>
				<div class="product-item">
					<div class="pi-img-wrapper">
						<img src="${pages}/img/products/${wntr.getImage()}.jpg"
							class="img-responsive" alt="Berry Lace Dress">
						<div>
							<a href="${pages}/img/products/${wntr.getImage()}.jpg"
								class="btn btn-default fancybox-button">Zoom</a> <a
								href="#product-pop-up"
								class="btn btn-default fancybox-fast-view">View</a>
						</div>
					</div>
					<h3>
						<a href="shop-item.html">Berry Lace Dress</a>
					</h3>
					<div class="pi-price">$${String.format( "%.2f",
						wntr.getPrice())}</div>
					<a href="javascript:;" class="btn btn-default add2cart">Add to
						cart</a>
					<!--<div class="sticker sticker-new"></div>-->
				</div>
			</div>
		</c:forEach>

	</div>
</div>
<!-- END CONTENT -->