<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h3 align="center">
	<small>Authorised Administrator.</small>
</h3>


<div class="form-group">
	<div class="col-sm-8">
		<p>
			<a class="btn btn-default"
				href="${pageContext.request.contextPath}/addproduct">Add Product</a>
		</p>
	</div>
</div>

<sec:authorize access="hasRole('ROLE_ADMIN')">
	<div class="form-group">
		<div class="col-sm-8">
			<a class="btn btn-default" href="<c:url value='/newaccount'/>">Create
				new Admin account</a>
		</div>
	</div>
</sec:authorize>


<div class="userlist">
	<table class="table table-condensed">
		<tr class="info">
			<th>Username</th>
			<th>Email</th>
			<th>Enabled</th>
			<th>Authority</th>
		</tr>

		<c:forEach items="${users}" var="user">
			<tr>
				<td><c:out value="${user.username}"></c:out></td>
				<td><c:out value="${user.email}"></c:out></td>
				<td><c:out value="${user.enabled}"></c:out></td>
				<td><c:out value="${user.authority}"></c:out></td>
			</tr>
		</c:forEach>

	</table>

</div>









