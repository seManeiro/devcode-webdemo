<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>



<button id="cartview" class="btn toggle" type="button">View
	ShoppingCart</button>
<div id="target" class="CartView">



	<table class="table table-condensed">

		<tr>
			<th>Product</th>
			<th>Quantity</th>
			<th>Price</th>
			<th></th>
		</tr>
		<c:forEach var="orderline" items="${cart.orderLines}">
			<tr>
				<td>${orderline.product.brand}<br />${orderline.product.name}</td>
				<td>${orderline.quantity}</td>
				<td>${orderline.product.price}.kr</td>
				<td> 
				    <sf:form method="GET" action="${pageContext.request.contextPath}/removeproduct">
						<input type="hidden" name="productId" value="${orderline.product.id}">
						<input class="btn btn-xs btn-danger" style="-webkit-border-top-left-radius: 3090px; -webkit-border-top-right-radius: 34px; -webkit-border-bottom-right-radius: 7367263px; -webkit-border-bottom-left-radius: 3px; -moz-border-radius-topleft: 3090px; -moz-border-radius-topright: 34px; -moz-border-radius-bottomright: 7367263px; -moz-border-radius-bottomleft: 3px; border-top-left-radius: 3090px; border-top-right-radius: 34px; border-bottom-right-radius: 7367263px; border-bottom-left-radius: 3px;"
							type="submit" value="X">
					</sf:form></td>
			</tr>

			<script>
				$("#cartview").click(function() {
					$("#target").slideToggle("400");
				});
			</script>
		</c:forEach>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>Total Price:</td>
			<td class="form-control">${cart.totalPrice}kr</td>
		</tr>


	</table>

</div>


