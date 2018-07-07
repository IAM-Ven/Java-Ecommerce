<!-- BEGIN TWO PRODUCTS -->
<div class="col-md-6 two-items-bottom-items">
	<h2>Summer</h2>
	<div class="owl-carousel owl-carousel2">
		<c:forEach items="${summer}" var="smr">
			<div>
				<div class="product-item">

					<div class="pi-img-wrapper">
						<img src="${smr}/img/products/${smr.getImage()}.jpg"
							class="img-responsive" alt="Berry Lace Dress">
						<div>
							<a href="${pages}/img/products/${smr.getImage()}.jpg"
								class="btn btn-default fancybox-button">Zoom</a> <a
								href="#product-pop-up"
								class="btn btn-default fancybox-fast-view">View</a>
						</div>
					</div>
					<h3>
						<a href="shop-item.html">Berry Lace Dress</a>
					</h3>
					<div class="pi-price">$29.00</div>
					<a href="javascript:;" class="btn btn-default add2cart">Add to
						cart</a>

				</div>
			</div>
		</c:forEach>
	</div>
</div>
<!-- END TWO PRODUCTS -->