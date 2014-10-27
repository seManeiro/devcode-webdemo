<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<script>

	function onload() {
		$("#password").keyup(checkPasswordMatch);
		$("#comfirmpass").keyup(checkPasswordMatch);

		$("#details").submit(canSubmit,setDob);
		
		
		
		
		
	}

	function canSubmit() {

		var password = $("#password").val();
		var comfirmpass = $("#comfirmpass").val();

		if (password != comfirmpass) {
			alert("<fmt:message key='UnmatchedPasswords.user.password' />");
			return false;
		} else {
			return true;
			
		}

	}

	function checkPasswordMatch() {
		var password = $("#password").val();
		var comfirmpass = $("#comfirmpass").val();

		if (password.length > 4 || comfirmpass.length > 4) {

			if (password == comfirmpass) {
				$("#matchpass").text(
						"<fmt:message key='MatchedPasswords.user.password' />");
				$("#matchpass").addClass("valid");
				$("#matchpass").removeClass("error");
			} else {
				$("#matchpass").text("Password do not match");
				$("#matchpass").addClass("error");
				$("#matchpass").removeClass("valid");
			}
		}
	}

	$(document).ready(onload);
	
	function setDob(){
		
		$('#dob').val($('#years').val() + '-' +
                $('#months').val() + '-' +
                $('#days').val());
	}
	
	
	
</script>