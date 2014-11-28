<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>


<h2 align="center">Thanks for your purchasing</h2>
<br/> 

    <div class="cart">	

	  <table class="table checkout">
	    <caption>Your receipt:</caption>	
		  <c:forEach var="orderline" items="${cart.orderLines}">
				
		       <tr class="min-cart">				
		    
					<td><img align="right" src="${orderline.product.img}" height="120" width="120"border="0" /></td>
					<td>${orderline.product.brand}</td>
					<td>${orderline.product.name}</td>			
					<td><mark> ${orderline.quantity}</mark> units.</td>			
					<td>${orderline.product.price} EUR</td>			
							
			
			    </tr>
		
			</c:forEach>
				<tr class="min-cart">
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td><h4>Total price: <b>${cart.totalPrice} EUR</b></h4></td>
					
		  		</tr>
      </table>

   </div>

<div class="cart">	
			 <table  class="table checkout">
			 <caption>A packet will be send to:</caption>
				  <tr>
					    <th>Name:</th>
					    <th>Address</th>
					     <th>Phone</th>
					    
				  </tr>
				  <tr>
					    <td>${user.firstname} ${user.lastname} </td>
					    <td>${user.street} <br /> ${user.zipcode} ${user.city}</td>
					     <td>${user.phone}</td>
				  </tr>
			</table>
</div>

<div>
	<div>
		<div>
			
			<h4 align="center">Your order will reach you in a few days.</h4>
			<hr>
			<a class="btn btn-warning" href="${pageContext.request.contextPath}/products">Continue shopping</a> 
			<a class="btn btn-info" href="${pageContext.request.contextPath}/">Home page</a>
		</div>
	</div>
</div>