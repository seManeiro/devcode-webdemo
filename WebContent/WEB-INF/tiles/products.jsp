<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<button id ="target3" class ="btn-primary btn-xs target3">Cart Content [ <spam id="numberitems">0</spam> ]</button>
<div id = "minicart" class ="rigthtd">

		
				<table class="table table-condensed">			
					<tr>
						<th>Product</th>
						<th>Quantity</th>
						<th>Price</th>
						<th></th>
					</tr>
					<c:forEach var="orderline" items="${cart.orderLines}">
						<tr>
							<td>${orderline.product.brand} <br />${orderline.product.name}</td>
							<td align="center" ="padding-left: 22px;">${orderline.quantity}</td>
							<td>${orderline.product.price} EUR</td>
							<td> 
							    <sf:form method="GET" action="${pageContext.request.contextPath}/removeproduct">
									<input type="hidden" name="productId" value="${orderline.product.id}">
									<input class="btn btn-xs btn-danger" style="-webkit-border-top-left-radius: 3090px; -webkit-border-top-right-radius: 34px; -webkit-border-bottom-right-radius: 7367263px; -webkit-border-bottom-left-radius: 3px; -moz-border-radius-topleft: 3090px; -moz-border-radius-topright: 34px; -moz-border-radius-bottomright: 7367263px; -moz-border-radius-bottomleft: 3px; border-top-left-radius: 3090px; border-top-right-radius: 34px; border-bottom-right-radius: 7367263px; border-bottom-left-radius: 3px;"
										type="submit" value="X">
								</sf:form></td>
						</tr>
							
					</c:forEach>
					<tr>
						<td>&nbsp;</td>
						<td>total:</td>					
						<td><h5><b>${cart.totalPrice} EUR</b></h5></td>
					</tr>			
				</table>

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
								EUR
								<c:out value="${product.price}"></c:out>
							</h5>
							<c:out value="${product.description}"></c:out>
							<br />
	
							<div>
								<c:if test="${product.quantity != 0}">
	
	
									<sf:form id="updatecart" method="GET" action="${pageContext.request.contextPath}/addtocart">
	
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
	$.getJSON("<c:url value="/updatecart" />", updateCart);
}

$ (document).ready(onLoad);

$("#target3").click(function() {
	$("#minicart").fadeToggle("slow");
});

 $(document).ready(function(){
	  $("#updateCart").submit(function(){
		  $.ajax({
			  url:'updatecart',
			  type:'POST',
		  dataType:'Json',
		  data: $('updatecart').serialize(),
		  success: function(data){
			
			  
		     }  
		  })
		  return false;
	  });
	  
	  });

</script>

