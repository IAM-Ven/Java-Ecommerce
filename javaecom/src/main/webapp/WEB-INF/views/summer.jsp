<!-- BEGIN TWO PRODUCTS -->
<div class="col-md-6 two-items-bottom-items">
	<h2>Summer</h2>
	<div class="owl-carousel owl-carousel2">
		<c:forEach items="${summer}" var="smr">
			<div>
				<div class="product-item">

					<div class="pi-img-wrapper">
						<img src="${pages}/img/products/${smr.getImage()}.jpg"
							class="img-responsive" alt="${smr.getName()}">
						<div>
							<a href="${pages}/img/products/${smr.getImage()}.jpg"
								class="btn btn-default fancybox-button">Zoom</a> <a
								href="${contextRoot}/javaecom/product/${smr.getId()}"
								class="btn btn-default fancybox-fast-view">View</a>
						</div>
					</div>
					<h3>
						<a href="${contextRoot}/javaecom/product/${smr.getId()}">${smr.getName()}</a>
					</h3>
					<div class="pi-price">$${String.format( "%.2f", smr.getPrice())}</div>
					<a href="javascript:;" class="btn btn-default add2cart">Add to
						cart</a>

				</div>
			</div>
		</c:forEach>
	</div>
</div>
<!-- END TWO PRODUCTS -->