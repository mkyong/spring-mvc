<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="fragments/header.jsp" />

<div class="container">

	<c:choose>
		<c:when test="${userForm['new']}">
			<h1>Add User</h1>
		</c:when>
		<c:otherwise>
			<h1>Update User</h1>
		</c:otherwise>
	</c:choose>

	<form:form method="post" modelAttribute="userForm" action="/users">

		<form:hidden path="id" />

        <spring:bind path="name">
            <div class="mb-3 row">
                <label for="name" class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm-10">
                    <form:input path="name" type="text" id="name"
                        class="form-control ${status.error ? 'is-invalid' : ''}"
                        aria-describedby="validationNameFeedback" />
                    <form:errors path="name" id="validationNameFeedback" class="invalid-feedback" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="email">
            <div class="mb-3 row">
                <label for="email" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10">
                    <form:input path="email" type="text" id="email"
                        class="form-control ${status.error ? 'is-invalid' : ''}"
                        aria-describedby="validationEmailFeedback" />
                    <form:errors path="email" id="validationEmailFeedback" class="invalid-feedback" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div class="mb-3 row">
                <label for="password" class="col-sm-2 control-label">Password</label>
                <div class="col-sm-10">
                    <form:password path="password" id="password"
                        class="form-control ${status.error ? 'is-invalid' : ''}"
                        aria-describedby="validationPasswordFeedback" />
                    <form:errors path="password" id="validationPasswordFeedback" class="invalid-feedback" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="confirmPassword">
            <div class="mb-3 row">
                <label for="confirmPassword" class="col-sm-2 control-label">Confirm Password</label>
                <div class="col-sm-10">
                    <form:password path="confirmPassword" id="confirmPassword"
                        class="form-control ${status.error ? 'is-invalid' : ''}"
                        aria-describedby="validationConfirmPasswordFeedback" />
                    <form:errors path="confirmPassword" id="validationConfirmPasswordFeedback" class="invalid-feedback" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="address">
            <div class="mb-3 row">
                <label for="address" class="col-sm-2 control-label">Address</label>
                <div class="col-sm-10">
                    <form:textarea path="address" rows="5" id="address"
                        class="form-control ${status.error ? 'is-invalid' : ''}"
                        aria-describedby="validationAddressFeedback" />
                    <form:errors path="address" id="validationAddressFeedback" class="invalid-feedback" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="acceptTOS">
            <div class="mb-3 row">
                <div class="col-12">
                <div class="form-check">
                    <form:checkbox path="acceptTOS" id="acceptTOS"
                        class="form-check-input ${status.error ? 'is-invalid' : ''}"
                        aria-describedby="validationAcceptTosFeedback" />
                    <label for="acceptTOS" class="form-check-label">Agree to terms and conditions</label>
                    <form:errors path="acceptTOS" id="validationAcceptTosFeedback" class="invalid-feedback" />
                </div>
                </div>
            </div>
        </spring:bind>

		<div class="form-group">
		  <div class="col-sm-offset-2 col-sm-10">
			<c:choose>
			  <c:when test="${userForm['new']}">
			     <button type="submit" class="btn-lg btn-primary pull-right">Add
                             </button>
			  </c:when>
			  <c:otherwise>
			     <button type="submit" class="btn-lg btn-primary pull-right">Update
                             </button>
			  </c:otherwise>
			</c:choose>
		  </div>
		</div>
	</form:form>

</div>

<jsp:include page="fragments/footer.jsp" />

</body>
</html>