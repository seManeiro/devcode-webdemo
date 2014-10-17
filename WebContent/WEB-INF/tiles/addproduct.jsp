<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>



<div class="addproduct">
	<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="product">
		<table class="table table-condensed" >
				<tr class="info"><th>Category</th>
					<td ><sf:input class="form-control" path ="category" name="category" type="text" /><br/>
					<sf:errors path ="category" cssClass="error"></sf:errors></td>
				</tr>
				<tr><th>Brand:</th>
					<td ><sf:input class="form-control" path ="brand" name="brand" type="text" /><br/>
					<sf:errors path ="brand" cssClass="error"></sf:errors></td>
				</tr>
				<tr><th>Name:
					<td ><sf:input class="form-control" path ="name" name="name" type="text" /><br/>
					<sf:errors path ="name" cssClass="error"></sf:errors></td>
				</tr>
				<tr class="success"><th>Origin:</th>
					<td ><sf:input class="form-control" path ="origin" name="origin" type="text" /><br/>
					<sf:errors path ="origin" cssClass="error"></sf:errors></td>
				</tr>
				<tr ><th>Code:</th>
					<td ><sf:input class="form-control" path ="code" name="code" type="text" /><br/>
					<sf:errors path ="code" cssClass="error"></sf:errors></td>
				</tr>
				<tr><th>Quantity:</th>
					<td ><sf:input class="form-control" path ="quantity" name="quantity" type="text" />
					<br/><sf:errors path ="quantity" cssClass="error"></sf:errors></td>
				</tr>
				<tr class="warning">
				<th>Price:</th>
					<td ><sf:input class="form-control" path ="price" name="price" type="text" /><br/>
					<sf:errors path ="price" cssClass="error"></sf:errors></td>
				</tr>
				<tr class="tr bg-danger">
				<th>Description:</th>
					<td><sf:textarea class="form-control" path ="description"  name="description" rows="10"
							cols="10"></sf:textarea><br/><sf:errors path ="description" cssClass="error">
								</sf:errors></td>
				</tr>
				<tr>
				<th>Photo:</th>
					<td><sf:input class="btn btn-default" path="img" type="file" alt="product image"  /></td>
				</tr>
				<tr >
					<td><input id ="submitinput" value="Add Product" type="submit" class="btn btn-success" /></td>
				</tr>

		</table>
	</sf:form>
</div>
