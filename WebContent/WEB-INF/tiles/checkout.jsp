<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div class="check_a">
<div>
	<div class ="">
		<div class ="thumbnail">
             <sec:authorize access='isAuthenticated()'>
               <h4 >Customer:&nbsp; <sec:authentication property="principal.username"/></h4>
          
             </sec:authorize >

             <sec:authorize access='!isAuthenticated()'>
	            <p class="btn btn">For purchase you must be inlogged or<a class="btn btn" href="<c:url value="/newcustomeraccount"/>">Create Customer</a></p>
	        </sec:authorize >
	    </div>
	</div>
 </div>
</div>


<div class="cart-container">
    <div class="cart">	

	  <table class="table checkout">	
		  <c:forEach var="orderline" items="${cart.orderLines}">

		       <tr class="min-cart">				
		    
					<td><img align="right" src="${orderline.product.img}" height="120" width="120"border="0" /></td>
					<td>${orderline.product.brand}</td>
					<td>${orderline.product.name}</td>			
					<td><mark> ${orderline.quantity}</mark> units.</td>			
					<td>Price ${orderline.product.price} EUR</td>			
					<td>	<sf:form method="GET"
									action="${pageContext.request.contextPath}/remove">
									<input type="hidden" name="productId" value="${orderline.product.id}">
								<input class="btn btn-xs btn-danger btn-remove" type="submit" value="X">
							</sf:form>
					</td>			
			
			    </tr>
		
			</c:forEach>
				<tr class="min-cart">
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td></td>
					<td><h4>Total price: <b>${cart.totalPrice} EUR</b></h4></td>
					
		  		</tr>
      </table>

   </div>
</div>



<sec:authorize access='isAuthenticated()'>
	<div class="">
		
			<div class="jumbotron">

				<h4><b>Shipmnet</b></h4>
				<hr/><br/>
				<form class="form" action="submitshipment">

					<div class="row">
						<input type="radio" name="shipment" value="male"> Posten 
						<img src="resources/img/posten.png"> Through the Post service,  	would your costs be 12 EUR. Shipment between 3-5 working days
					</div>
					<br/>
					<div class="row">
						<input type="radio" name="shipment" value="male"> Bring
                         <img src="resources/img/bring.png"> Through the Post service, would your costs be 15 EUR. Shipment between 2-3 working days 
					</div>
					<br/>
					<div class="row">
						<input type="radio" name="shipment" value="male"> Shenker
						<img src="resources/img/shenker.png"> Through the Post service, would your costs be 20 EUR. Shipment between 1-3 working
						days
					</div>

				</form>
			</div>
		
	</div>
</sec:authorize>


<div class="payments">

	<div  class="jumbotron">

		<div class="container">
			<sec:authorize access="isAuthenticated()">
				
				<h3 align="center" style="color:gray">Payment Methods</h3>

<button id="creditCard" class="btn btn-default navbar-btn" type="button">Creditcard</button>

<%-- <a id="bank" class="btn btn-default navbar-btn" onclick="setIframe(this,'${exUrl}')" type="button" href="${pageContext.request.contextPath}/bankPayment" >Bank</a> --%>

<a  id="bank" class="btn btn-default navbar-btn" type="button" href="javaScript:{openNewWindow();}" >Bank</a>

<a  id="paypal" class="btn btn-default navbar-btn" type="button" href="${pageContext.request.contextPath}/paypal">PayPal</a>

<a  id="" class="btn btn-default navbar-btn" href="${pageContext.request.contextPath}/qrsepayment" type="button" >SEQR</a>

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
							        <input class="btn btn-warning continue" id="submitinput" value="Continue" type="submit" class="btn btn-warning" />
							        
							        </td>
						        </tr>
	
				    	</table>
					</sf:form>
				</div>
				
<div id="target2" style="display: none">
				
						 <table class="table2">
						       <h4 align="center" style="color:gray;">SEQR payment</h4>
							  <tr class="">
							    <h5>Start your SEQR APP and scan this code</h5>
									
									<td>
									
									<img src="resources/img/DEVCODE_QR_Code.PNG">
							 	   </td>
							  </tr>
							  <tr>
							       <td><label>After scaning click <a id="qrcode" class="btn btn-default navbar-btn" href="${pageContext.request.contextPath}/checkqrpaymentstatus" type="button">here.</a></label>
					               </td>
							        
						      </tr>					
						  </table>
					
</div>			
					
			</sec:authorize>

		</div>
	</div>

</div>

<div>

<script>


	function openNewWindow() {
		window.open("${pageContext.request.contextPath}/bankPayment");
	}
	
	$("#creditCard").click(function() {
		$("#target1").slideToggle("800");
	});
	

	function setIframe(element, location) {
		var theIframe = document.createElement("iframe");
		theIframe.src = location;
		element.appendChild(theIframe);
	}
</script>

