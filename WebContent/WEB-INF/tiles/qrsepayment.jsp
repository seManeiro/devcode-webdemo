<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div class="qr-conteiner">
		<div id="target2">
		
			<table class="table checkout">
			
				       <h4 align="center" style="color: black;">SEQR payment</h4>
				<tr class="">
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
				        <h5>Start your SEQR APP and scan this code</h5>
						<td>
						    <img align="right" src="resources/img/DEVCODE_QR_Code.PNG">
						</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>			
				</tr>
				<tr>
					    <td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td><label>After scaning click <a id="qrcode" class="btn btn-default navbar-btn" href="${pageContext.request.contextPath}/checkqrpaymentstatus"
								type="button">here.</a></label>
						</td>
				</tr>
			</table>	
		
		</div>
</div>




