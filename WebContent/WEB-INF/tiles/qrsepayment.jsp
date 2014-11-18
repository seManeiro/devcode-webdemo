<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div id="target2">



	<table class="table">
		<h4 align="center" style="color: gray;">SEQR payment</h4>
		<tr class="">
			<h5>Start your SEQR APP and scan this code</h5>

			<td><img src="resources/img/DEVCODE_QR_Code.PNG"></td>
		</tr>
		<tr>
			<td><label>After scaning click <a id="qrcode" class="btn btn-default navbar-btn" href="${pageContext.request.contextPath}/checkqrpaymentstatus"
					type="button">here.</a></label></td>
		</tr>
	</table>



</div>





