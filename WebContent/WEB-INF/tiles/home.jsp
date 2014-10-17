<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>
	<div class="carousel-inner">
		<div class="item active">
			<img
				src="resources/img/image003.jpg" alt="First slide">
			<div class="container">
				<div class="carousel-caption">
					<h1 style="color:black;text-border: 3px solid gray;">PaymentIQ fastest and more secure transactions.</h1>
					<p style="color:w;">
						Note: If you're viewing this page via a
						URL,<code> the "next" and "previous"</code> Glyphicon buttons on the left and
						right might not load/display properly due to web browser security
						rules.
					</p>
					<p>
						<a class="btn btn-success btn-primary" href="<c:url value="/newcustomeraccount"/>">Get Membership today!</a>
					</p>
				</div>
			</div>
		</div>
		<div class="item">
			<img src="resources/img/T-Bana.jpg" alt="Second slide">
			<div class="container">
				<div class="carousel-caption">
					<h1>Another example headline.</h1>
					<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam.
						Donec id elit non mi porta gravida at eget metus. Nullam id dolor
						id nibh ultricies vehicula ut id elit.</p>
					<p>
						<a class="btn btn-success btn-primary" href="#" role="button">Learn
							more</a>
					</p>
				</div>
			</div>
		</div>
		<div class="item">
			<img src="resources/img/payment.jpg" alt="Third slide">
			<div class="container">
				<div class="carousel-caption">
					<h1>One more for good measure.</h1>
					<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam.
						Donec id elit non mi porta gravida at eget metus. Nullam id dolor
						id nibh ultricies vehicula ut id elit.</p>
					<p>
						<a class="btn btn-success btn-primary" href="#" role="button">Browse
							gallery</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<a class="left carousel-control" href="#myCarousel" role="button"
		data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
	<a class="right carousel-control" href="#myCarousel" role="button"
		data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
</div>
<!-- /.carousel -->

<div class="jumbotron">

	<div class="container">
		<h1>DEVCODE</h1>
		<p>This is a template for a simple marketing or informational
			website. It includes a large callout called a jumbotron and three
			supporting pieces of content. Use it as a starting point to create
			something more unique.</p>
		<p>
			<a class="btn btn-success btn-lg" role="button"> Learn more » </a>
		</p>
	</div>

</div>