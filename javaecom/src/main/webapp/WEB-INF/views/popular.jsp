<!-- BEGIN SALE PRODUCT & NEW ARRIVALS -->
<div class="row margin-bottom-40">
	<!-- BEGIN SALE PRODUCT -->
	<div class="col-md-12 sale-product">
		<h2>Popular</h2>
		<div class="owl-carousel owl-carousel5">
			<c:forEach items="${popular}" var="plr">
				<div>
					<div class="product-item">
						<div class="pi-img-wrapper">
							<img src="${pages}/img/products/${plr.getImage() }.jpg"
								class="img-responsive" alt="Berry Lace Dress">
							<div>
								<a href="${pages}/img/products/${plr.getImage() }.jpg"
									class="btn btn-default fancybox-button">Zoom</a> <a
									href="#product-pop-up"
									class="btn btn-default fancybox-fast-view">View</a>
								
							</div>
						</div>
						<h3>
							<a href="${contextRoot}/javaecom/product/${plr.getId()}">${plr.getName()}</a>
						</h3>
						<div class="pi-price">$${String.format( "%.2f",
						plr.getPrice())}</div>
						<a href="javascript:;" class="btn btn-default add2cart">Add to
							cart</a>
						<div class="sticker sticker-sale"></div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<!-- END SALE PRODUCT -->
</div>
<!-- END SALE PRODUCT & NEW ARRIVALS -->