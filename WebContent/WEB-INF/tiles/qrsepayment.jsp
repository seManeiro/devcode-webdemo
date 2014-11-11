<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div id="target2" >
				
           	       <sf:form action="${pageContext.request.contextPath}/PayPalPayment" method="POST" commandName="customerPayPal">
           	             
           	             <table class="table">
						   <h4 align="center" style="color:gray;">SEQR payment</h4>
							  <tr class="">
							    <h5>Start your SEQR app.</h5>
									<th><small style="color:red;"></small> Scan code:</th>
									<td>
									
									<img src="resources/img/DEVCODE_QR_Code.PNG">
								   </td>
							</tr>
							<tr>
							        
						    </tr>					
						</table>
					</sf:form>
</div>

