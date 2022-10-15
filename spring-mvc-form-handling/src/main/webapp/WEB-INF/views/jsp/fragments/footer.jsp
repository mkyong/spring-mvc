<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="container">
	<hr>
	<footer>
		<p>&copy; Mkyong.com</p>
	</footer>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<spring:url value="/resources/core/js/main.js" var="coreJs" />
<spring:url value="/webjars/bootstrap/5.2.0/js/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>


