<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<c:forEach var="product" items="${products}">
	<div class="jumbotron">

		<div class="col-sm-3 col-md-4">
			<div class="container">
				<div class="thumbnail">
					<img class="imgprod" align="right" src="${product.img}"
						height="100" width="100"></img>
					<div class="caption">

						<c:out value="${product.name}"></c:out>
						<br />
						<h3>
							<c:out value="${product.brand}"></c:out>
						</h3>
						<br />
						<h5 class="warning">
							SEK
							<c:out value="${product.price}"></c:out>
						</h5>
						<c:out value="${product.description}"></c:out>
						<br />

						<div>
							<c:if test="${product.quantity != 0}">

								<!-- 	<button class="addbutt" id="down" onclick="modify_qty(-1)">-</button>
		
									<button class="addbutt" id="up" onclick="modify_qty(1)">+</button>
							 -->


								<sf:form method="GET"
									action="${pageContext.request.contextPath}/addtocart">

									<input id="txtboxToFilter" name="qty" value="0" size="4" />
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
	</div>
</c:forEach>



