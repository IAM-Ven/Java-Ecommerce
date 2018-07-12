
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
				
			</li>

		</c:forEach>
	</ul>
</div>
<!-- END NAVIGATION -->
