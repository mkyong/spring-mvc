<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring Web MVC and JSP</title>

<spring:url value="/resources/core/css/main.css" var="coreCss" />
<spring:url value="/webjars/bootstrap/5.2.0/css/bootstrap.min.css" var="bootstrapCss" />

<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>

<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
  <a class="navbar-brand" href="#">Mkyong.com</a>
</nav>

<main role="main" class="container">

  <div class="starter-template">
      <h1>Spring Web MVC JSP Example</h1>
      <h2>
            <c:if test="${not empty message}">
                Hello ${message}
            </c:if>

            <c:if test="${empty message}">
                Welcome!
            </c:if>
      </h2>
  </div>

</main>

<spring:url value="/resources/core/js/main.js" var="coreJs" />
<spring:url value="/webjars/bootstrap/5.2.0/js/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>

</body>
</html>