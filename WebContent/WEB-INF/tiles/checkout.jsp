<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>


<div>
	<div class ="row">
		<div class ="thumbnail">
             <sec:authorize access='isAuthenticated()'>
               <h4>Customer:&nbsp; <sec:authentication property="principal.username"/></h4>
          
             </sec:authorize >

             <sec:authorize access='!isAuthenticated()'>
	            <p class="btn btn">For purchase you must be inlogged or<a class="btn btn" href="<c:url value="/newcustomeraccount"/>">Create Customer</a></p>
	        </sec:authorize >
	    </div>
	</div>
</div>

<hr>

<div>
	<div class="product-list">	
	
		<c:forEach var="orderline" items="${cart.orderLines}">
				
		    <div class="jumbotron">

				<div class="container">
					<div class="">			
						<h2 style="color:red;">${orderline.product.brand}</h2>
						<img align="right" src="${orderline.product.img}" height="120" width="120"border="0" />
						<h3>${orderline.product.name}</h3>
						
						&nbsp; &nbsp; &nbsp;<spam style="color:gray" ><b><mark> ${orderline.quantity}</mark></b></spam> units.
						<h3 class="warning"> Price ${orderline.product.price} USD</h3>

						<sf:form method="GET"
							action="${pageContext.request.contextPath}/remove">
							<input type="hidden" name="productId" value="${orderline.product.id}">
							<input class="btn btn-xs btn-danger" style="align: right; -webkit-border-top-left-radius: 400px; -webkit-border-top-right-radius: 34px; -webkit-border-bottom-right-radius: 200px; -webkit-border-bottom-left-radius: 3px; -moz-border-radius-topleft: 400px; -moz-border-radius-topright: 34px; -moz-border-radius-bottomright: 200px; -moz-border-radius-bottomleft: 3px; border-top-left-radius: 400px; border-top-right-radius: 34px; border-bottom-right-radius: 200px; border-bottom-left-radius: 3px;"
								type="submit" value="X">
						</sf:form>
					 </div>
				</div>
			</div>	
			<hr>
		</c:forEach>

			 <h3 class="tolalprice">&nbsp;Total Price: <spam style="color:gray">${cart.totalPrice}</spam> USD</h3>
	
	</div>
</div>

<hr>
<sec:authorize access='isAuthenticated()'>
	<div class="shipmnet">
		
			<div class="jumbotron">

				<h4 align="center"><b>Shipmnet</b></h4>
				<form class="form" action="submitshipment">

					<div class="row">
						<input type="radio" name="shipment" value="male"> Posten 
						<img src="resources/img/posten.png"> Through the Post service,  	would your costs be 45 SEK.Shipment between 3-5 working days
					</div>
					
					<div class="row">
						<input type="radio" name="shipment" value="male"> Bring
                         <img src="resources/img/bring.png"> Through the Post service, would your costs be 55 SEK.Shipment between 2-3 working days 
					</div>
					
					<div class="row">
						<input type="radio" name="shipment" value="male"> Shenker
						<img src="resources/img/shenker.png"> Through the Post service, would your costs be 65 SEK.Shipment between 1-3 working
						days
					</div>

				</form>
			</div>
		
	</div>
</sec:authorize>
<hr>

<div>

	<div  class="jumbotron">

		<div class="container">
			<sec:authorize access="isAuthenticated()">
				
				<h3 align="center" style="color:gray">Payment Methods</h3>

<button id="creditCard" class="btn btn-default navbar-btn" type="button">Creditcard</button>

<a id="bank" class="btn btn-default navbar-btn" onclick="setIframe(this,'${paymentService.url}')" type="button" href="${pageContext.request.contextPath}/bankPayment" >Bank</a>

<a  id="paypal" class="btn btn-default navbar-btn" type="button" href="${pageContext.request.contextPath}/paypal">PayPal</a>

<a  id="paypal" class="btn btn-default navbar-btn" type="button" href="${pageContext.request.contextPath}/qrcodepayment">SEQR</a>

				<div id="target1" style="display: none">
				
           	       <sf:form action="${pageContext.request.contextPath}/verifyCustomerCreditcard" method="POST" commandName="customerCreditcard">
					
						<table class="table">
						  
						  <tr class="">
								<th>Card Number:</th>
								<td>
								
								<sf:input path="amount" name="amount" type="hidden" value="${cart.totalPrice}"/><br />
									<sf:input path="userId" name="userId" type="hidden" value='${principal.username}'/><br />
								    <sf:input class="input-sm" path="creditcardNumber" name="creditcardNumber" type="text" /><br /> 
								   <sf:errors path="creditcardNumber" cssClass="error"></sf:errors>
							   </td>
							</tr>
						    <tr class="">
								    <th>Name:</th>
								    <td>
								        <sf:input class="input-sm" path="cardHolder" name="cardHolder"
										type="text" /><br /> 
										<sf:errors path="cardHolder" cssClass="error"></sf:errors>
								   </td>
							 </tr>
							 <tr class="">
								    <th>Valid to:</th>
								    <td>
								    <sf:select id="expiryYear" path="expiryYear" class="input-sm">
												<sf:option value="-1" selected="selected">Year</sf:option>
												<sf:option value="2014">2014</sf:option>
												<sf:option value="2015">2015</sf:option>
												<sf:option value="2016">2016</sf:option>
												<sf:option value="2017">2017</sf:option>
												<sf:option value="2018">2018</sf:option>
												<sf:option value="2019">2019</sf:option>
												<sf:option value="2020">2020</sf:option>
												<sf:option value="2021">2021</sf:option>
												<sf:option value="2022">2022</sf:option>
					                            <sf:option value="2023">2023</sf:option>
					                            <sf:option value="2024">2024</sf:option>
					                            <sf:option value="2025">2025</sf:option>
					                            <sf:option value="2026">2026</sf:option>
					                            <sf:option value="2027">2027</sf:option>
					                            <sf:option value="2028">2028</sf:option>
					                            <sf:option value="2029">2029</sf:option>
					                            <sf:option value="2030">2030</sf:option>			                            
			                          </sf:select>&nbsp; 
                                      <sf:select id="months" path="expiryMonth" class="input-sm" >
					                     	    <sf:option value="-1" selected="selected">Month</sf:option>
												<sf:option value="1">01</sf:option>
												<sf:option value="2">02</sf:option>
												<sf:option value="3">03</sf:option>
												<sf:option value="4">04</sf:option>
												<sf:option value="5">05</sf:option>
												<sf:option value="6">06</sf:option>
												<sf:option value="7">07</sf:option>
												<sf:option value="8">08</sf:option>
												<sf:option value="9">09</sf:option>
												<sf:option value="10">10</sf:option>
												<sf:option value="11">11</sf:option>
												<sf:option value="12">12</sf:option>
	                     				</sf:select>
								       
								     </td>
							   </tr>
							    <tr class="">
								    <th>Security Code:</th>
								    <td>
								        <sf:input class="input-sm" path="cvv" name="cvv"
										type="text" /><br /> 
										<sf:errors path="cvv" cssClass="error"></sf:errors>
								    </td>
							    </tr>
								<tr>
							        <td >
							        <input style="align:right;" id="submitinput" value="Proceed Buy" type="submit" class="btn btn-warning" />
							        
							        </td>
						        </tr>
	
				    	</table>
					</sf:form>
					</div>
					
					
			</sec:authorize>

		</div>
	</div>

</div>

<script>
	$("#creditCard").click(function() {
		$("#target1").slideToggle("400");
	});

	function setIframe(element,location){
	    var theIframe = document.createElement("iframe");
	    theIframe.src = location;
	   element.appendChild(theIframe);
	}
</script>

