<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<button id ="target3" class ="btn-primary btn-xs target3">Cart Content</button>
<div id = "minicart" class ="rigthtd">

<a class="cartitem" href="<c:url value='/cart'/>">CartItems (<spam id="numberitems">0</spam> )</a>

</div>


<div class ="bodyprod">
  <div class="jumbotron">
	
	<c:forEach var="product" items="${products}">
		
			<div class="col-sm-4 col-md-4">
				<div class="container">
					<div class="thumbnail2">
						<img class="imgprod" src="${product.img}"></img>
						<div class="caption">
	
							<c:out value="${product.name}"></c:out>
							<br />
							<h3>
								<c:out value="${product.brand}"></c:out>
							</h3>
							<br />
							<h5 class="warning">
								USD
								<c:out value="${product.price}"></c:out>
							</h5>
							<c:out value="${product.description}"></c:out>
							<br />
	
							<div>
								<c:if test="${product.quantity != 0}">
	
	
									<sf:form method="GET" action="${pageContext.request.contextPath}/addtocart">
	
										<input id="txtboxToFilter" name="qty" value="1" size="4" />
										<input type="hidden" name="productId" value="${product.id}">
										<input class="btn btn-xs btn-success" type="submit"
											value="add to cart">
	
									</sf:form>
	
								</c:if>
	
							</div>
						</div>
					</div>
				</div>
			</div>
	</c:forEach>
  </div>
</div>




<script>
 function updateCart(data){
	$("#numberitems").text(data.number);
 }

function onLoad(){
	 updatePage();
	window.setInteval(5000, updatePage);
	
}

function updatePage(){
	$.getJSON("<c:url value="/minicart" />", updateCart);
}

$ (document).ready(onLoad);

$("#target3").click(function() {
	$("#minicart").slideToggle("800");
});

</script>

