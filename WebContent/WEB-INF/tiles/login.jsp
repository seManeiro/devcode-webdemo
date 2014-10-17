<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


	<script type="text/javascript">
		$(document).ready(function() {
			document.f.j_username.focus();
		});
	</script>


	<h3 align="center">

		<small>Login</small>

	</h3>
	<br />


	<form class="form-horizontal" name='f' action='${pageContext.request.contextPath}/j_spring_security_check' method='POST'>

		<div class="form-group">
			<label for="user" class="col-sm-2 control-label">User:</label>
			<div class="col-sm-10">
				<input type="text" name="j_username" />
			</div>
		</div>
		<div class="form-group">
			<label for="password" class="col-sm-2 control-label">Password:</label>
			<div class="col-sm-10">
				<input type='password' name='j_password'/>
			</div>
		</div>
		<c:if test="${param.error != null}">

			<p class="error" style="padding: 10px;">
				<small>Login Error!. Check that your username and password
					are correct.</small>
			</p>

		</c:if>
		<div class="form-group">
			<label for="rememberme" class="col-xs-2 control-label">remember
				me:</label>
			<div class="col-sm-10">
				<input type='checkbox' name='_spring_security_remember_me'
					checked="checked" />
			</div>
		</div>

		<div class="form-group">
			<label for="" class="col-sm-2 control-label"></label>
			<div class="col-sm-10">
				<input class="btn btn-warning" name="submit" type="submit"
					value="Login" />
			</div><br/>
			<label for="" class="col-sm-2 control-label"></label>
			<div class="col-sm-8">
			<br/>
				<a class="btn btn-xs btn-default" href="<c:url value="/newcustomeraccount"/>">Create new Account</a>
			</div>
		</div>
		
		<div class="form-group">
			
		</div>

	</form>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>



