<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="item" style="background-image: url('resources/img/BPM.png');background-repeat: no-repeat;background-position: right bottom;">
	<h3 align="center" class="success">

		<small>New Membership Account</small>

	</h3>

	<div class="addproduct">
		<sf:form id="details" method="post" action="${pageContext.request.contextPath}/createcustomeraccount" commandName="user">
			<table class="table table-condensed">

				<tr class="">
					<th>FirstName:
					<td><sf:input class="form-control" path="firstname"
							name="firstname" type="text" /><br /> <sf:errors
							path="firstname" cssClass="error"></sf:errors></td>
				</tr>
				<tr class="">
					<th>LastName:
					<td><sf:input class="form-control" path="lastname"
							name="lastname" type="text" /><br /> <sf:errors path="lastname"
							cssClass="error"></sf:errors></td>
				</tr>
				<tr class="info">
					<th>UserName:
					<td><sf:input class="form-control" path="username" 
							name="username" type="text" /><br /> <sf:errors path="username"
							cssClass="error"></sf:errors></td>
				</tr>
				<tr class="info">
					<th>Password:</th>
					<td><sf:input id="password" class="form-control" path="password"
							name="password" type="password" /> <br />
					<sf:errors path="password" cssClass="error"></sf:errors></td>
				</tr>
				<tr class="warning">
					<th>Confirm Password:</th>
					<td><input id="comfirmpass" class="form-control" name="confirmpass" type="password" /><br />
					<div id="matchpass"></div></td>
				</tr>
		
			    <tr>
					<th>Date of birth:</th> 
					<td>
						 <sf:select id="years" path=""  class="input-sm">
	                            <option value="-1">Year</option>
			                    <option value="2014">2014</option>
			                    <option value="2013">2013</option>
			                    <option value="2012">2012</option>
			                    <option value="2011">2011</option>
			                    <option value="2010">2010</option>
								<option value="2009">2009</option>
								<option value="2008">2008</option>
								<option value="2007">2007</option>
								<option value="2006">2006</option>
								<option value="2005">2005</option>
								<option value="2004">2004</option>
								<option value="2003">2003</option>
								<option value="2002">2002</option>
								<option value="2001">2001</option>
								<option value="2000">2000</option>
								<option value="1999">1999</option>
								<option value="1998">1998</option>
								<option value="1997">1997</option>
								<option value="1996">1996</option>
								<option value="1995">1995</option>
								<option value="1994">1994</option>
								<option value="1993">1993</option>
								<option value="1992">1992</option>
								<option value="1991">1991</option>
								<option value="1990">1990</option>
								<option value="1989">1989</option>
								<option value="1988">1988</option>
								<option value="1987">1987</option>
								<option value="1986">1986</option>
								<option value="1985">1985</option>
								<option value="1984">1984</option>
								<option value="1983">1983</option>
								<option value="1982">1982</option>
								<option value="1981">1981</option>
								<option value="1980">1980</option>
								<option value="1979">1979</option>
								<option value="1978">1978</option>
								<option value="1977">1977</option>
								<option value="1976">1976</option>
								<option value="1975">1975</option>
								<option value="1974">1974</option>
								<option value="1973">1973</option>
								<option value="1972">1972</option>
								<option value="1971">1971</option>
								<option value="1970">1970</option>
								<option value="1969">1969</option>
								<option value="1968">1968</option>
								<option value="1967">1967</option>
								<option value="1966">1966</option>
								<option value="1965">1965</option>
								<option value="1964">1964</option>
								<option value="1963">1963</option>
								<option value="1962">1962</option>
								<option value="1961">1961</option>
								<option value="1960">1960</option>
								<option value="1959">1959</option>
								<option value="1958">1958</option>
								<option value="1957">1957</option>
								<option value="1956">1956</option>
								<option value="1955">1955</option>
								<option value="1954">1954</option>
								<option value="1953">1953</option>
								<option value="1952">1952</option>
								<option value="1951">1951</option>
								<option value="1950">1950</option>
								<option value="1949">1949</option>
								<option value="1948">1948</option>
								<option value="1947">1947</option>
								<option value="1946">1946</option>
								<option value="1945">1945</option>
								<option value="1944">1944</option>
								<option value="1943">1943</option>
								<option value="1942">1942</option>
								<option value="1941">1941</option>			
                        </sf:select>
	                    <sf:select id="months" path="" class="input-sm custom">
	                     	    <option value="-1" >Month</option>
								<option value="1">01</option>
								<option value="2">02</option>
								<option value="3">03</option>
								<option value="4">04</option>
								<option value="5">05</option>
								<option value="6">06</option>
								<option value="7">07</option>
								<option value="8">08</option>
								<option value="9">09</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
	                     </sf:select>
                         <sf:select id="days" path="" class="input-sm custom">
						        <option class="dropdown-toggle" value="-1">Day</option>
								<option value="1">01</option>
								<option value="2">02</option>
								<option value="3">03</option>
								<option value="4">04</option>
								<option value="5">05</option>
								<option value="6">06</option>
								<option value="7">07</option>
								<option value="8">08</option>
								<option value="9">09</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<option value="13">13</option>
								<option value="14">14</option>
								<option value="15">15</option>
								<option value="16">16</option>
								<option value="17">17</option>
								<option value="18">18</option>
								<option value="19">19</option>
								<option value="20">20</option>
								<option value="21">21</option>
								<option value="22">22</option>
								<option value="23">23</option>
								<option value="24">24</option>
								<option value="25">25</option>
								<option value="26">26</option>
								<option value="27">27</option>
								<option value="28">28</option>
								<option value="29">29</option>
								<option value="30">30</option>
								<option value="31">31</option>
						 </sf:select>
	                     <sf:input id="dob" class="form-control" type="hidden" path="dob" name="dob"/><br /> 
	                     <sf:errors path="dob" cssClass="error"></sf:errors>
                    </td>
                 </tr>
				
				<tr>
					<th>Email:</th>
					<td>
					<sf:input class="form-control" path="email" name="email" type="text" /><br /> 
					<sf:errors path="email" cssClass="error"></sf:errors>
					</td>
				</tr>
				<tr>
					<th>Country:</th>
					<td><sf:input class="form-control" path="country" name="country"
							type="text" /> <br />
					<sf:errors path="country" cssClass="error"></sf:errors></td>
				</tr>
				<tr>
					<th>City:</th>
					<td><sf:input class="form-control" path="city" name="city"
							type="text" /> <br />
					<sf:errors path="city" cssClass="error"></sf:errors></td>
				</tr>
					<tr>
					<th>Street:</th>
					<td><sf:input class="form-control" path="street" name="street"
							type="text" /> <br />
					<sf:errors path="street" cssClass="error"></sf:errors></td>
				</tr>
					<tr>
					<th>ZipCode:</th>
					<td><sf:input class="form-control" path="zipcode" name="zipcode"
							type="text" /> <br />
					<sf:errors path="zipcode" cssClass="error"></sf:errors></td>
				</tr>
					<tr>
					<th>Phone:</th>
					<td><sf:input class="form-control" path="phone" name="phone"
							type="text" /> <br />
					<sf:errors path="phone" cssClass="error"></sf:errors></td>
				</tr>
				<tr>
					<td><input id="submitinput" value="Create Account"
						type="submit" class="btn btn-warning" /></td>
				</tr>

			</table>
		</sf:form>
	</div>
</div>