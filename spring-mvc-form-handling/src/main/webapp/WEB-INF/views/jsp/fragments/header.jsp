<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
<title>Spring MVC Form Handling Example</title>

<spring:url value="/resources/core/css/main.css" var="coreCss" />
<spring:url value="/webjars/bootstrap/5.2.0/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>

<spring:url value="/" var="urlHome" />

<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">

    <div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">Spring MVC Form</a>
		</div>
	</div>

</nav>