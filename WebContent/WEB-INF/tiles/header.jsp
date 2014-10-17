<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="navbar-wrapper">
	<div class="container">

		<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<a class="title devcode"href="<c:url  value='/'/> "><img class="devcode"
				src="resources/img/logotyp.png" alt="logo"></a>
				<a class="title" href="#"></a>
				</div>
				<div class="navbar-collapse collapse">

					<ul class="nav navbar-nav">
						<li><a href="${pageContext.request.contextPath}/products">Products
						</a></li>
						<li><a href="#contact">Contact</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">More<span class="caret"></span></a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li class="divider"></li>
								<li class="dropdown-header">Nav header</li>
								<li><a href="#">Separated link</a></li>
								<li><sec:authorize access="hasRole('ROLE_ADMIN')">
										<a href="<c:url  value='/admin'/> ">Administrator</a>
									</sec:authorize></li>
							</ul></li>
					</ul>

					<form class="navbar-form navbar-right" name='f' role="form"
						action='${pageContext.request.contextPath}/j_spring_security_check'
						method='POST'>
						<sec:authorize access="!isAuthenticated()">
							<c:if test="${param.error != null}">
								<p style="padding: 10px;">
									<small class="loginerror">Login Error!. Check that your
										username and password are correct.</small>
								</p>

							</c:if>
							<div class="form-group">
								<input type="text" placeholder="Email" class="form-control"
									name="j_username">
							</div>
							<div class="form-group">
								<input type="password" placeholder="Password"
									class="form-control" name='j_password'>
							</div>

							<button type="submit" class="btn btn-success" value="Login">Sign
								in</button>
							<div class="form-group">
								<label class="navbar-form">remember me</label> <input
									type='checkbox' name='_spring_security_remember_me'
									checked="checked" />
							</div>
							<div class="form-group">
								<a class="btn" href="<c:url value="/newcustomeraccount"/>">Create
									new Account</a>

							</div>
						</sec:authorize>
						<sec:authorize access="isAuthenticated()">

							<c:url value="/logout" var="logoutUrl" />
							<a class="btn btn-xs btn-success" href="${logoutUrl}">Sign out</a>
						</sec:authorize>
						<div class="form-group">
							<a id="viewcart" class="btn btn-xs btn-success2" href="<c:url value="/checkout"/>"><small>ShoppingCart</small></a>
						</div>
					</form>
				</div>
				<!--/.navbar-collapse -->
			</div>
		</div>
	</div>
</div>