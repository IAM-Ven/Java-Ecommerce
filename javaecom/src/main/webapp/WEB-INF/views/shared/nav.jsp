
<!-- BEGIN NAVIGATION -->
<div class="header-navigation">
	<ul>
		<c:forEach items="${categories}" var="clothcats">

			<li class="">
				<a 
				class=""
				href="${contextRoot}/javaecom/category/${clothcats.getId()}/products">
					<i class=""></i> ${clothcats.getName()}
				</a> 
				<!-- BEGIN DROPDOWN MENU --> <%-- <ul class="dropdown-menu">
					<!-- This bellow is going to be the whole thing -->
					<li><a
						href="${contextRoot}/javaecom/category/${clothcats.getId()}/products">All</a>
					</li>
					<li><a
						href="${contextRoot}/javaecom/category/${clothcats.getId()}/products">Popular</a>
					</li>
					<li><a
						href="${contextRoot}/javaecom/category/${clothcats.getId()}/products">Summer</a>
					</li>
					<li><a
						href="${contextRoot}/javaecom/category/${clothcats.getId()}/products">New
							Arrivals</a></li>
				</ul> --%>
			</li>

		</c:forEach>
	</ul>
</div>
<!-- END NAVIGATION -->
