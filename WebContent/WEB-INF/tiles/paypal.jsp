<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div id="target2">

	<sf:form action="${pageContext.request.contextPath}/PayPalPayment"
		method="POST" commandName="customerPayPal">

		<table class="table">
			<h4 align="center" style="color: gray;">PayPal</h4>
			<tr class="">

				<td><sf:input path="amount" name="amount" type="hidden"
						value="${cart.totalPrice}" /><br /> <sf:input path="userId"
						name="userId" type="hidden" value='${principal.username}' /><br />

				</td>
			</tr>
			<tr>
				<td><input style="align: right;" id="submitinput"
					value="continue" type="submit" class="btn btn-warning" /></td>
			</tr>
		</table>
	</sf:form>
</div>

