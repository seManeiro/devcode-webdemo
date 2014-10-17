<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<h3 align="center" class="success">

	<small>Create Administrator Account</small>

</h3>

<div class="addproduct">
	<sf:form id="details" method="post" action="${pageContext.request.contextPath}/createaccount" commandName="user">
		<table class="table table-condensed">

			<tr class="info">
				<th>UserName:
				<td><sf:input class="input-lg" path="username" name="username"
						type="text" /><br /> <sf:errors path="username" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><sf:input class="input-lg" path="email" name="email"
						type="text" /><br /> <sf:errors path="email" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><sf:input id="password" class="input-lg" path="password"
						name="password" type="password" /> <br /> <sf:errors
						path="password" cssClass="error"></sf:errors></td>
			</tr>
			<tr class="warning">
				<th>Confirm Password:</th>
				<td><input id="comfirmpass" class="input-lg" name="confirmpass"
					type="password" />
					<div id="matchpass"></div></td>
			</tr>
			<tr>
				<td><input id="submitinput" value="Create Account"
					type="submit" class="btn btn-warning" /></td>
			</tr>

		</table>
	</sf:form>
</div>
