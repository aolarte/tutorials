<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  <%-- 1 --%>
<html>
    <body>

        <c:url var="postUrl" value="/post.html"/>  <%-- 2 --%>
        <form:form method="POST" commandName="person" action="${postUrl}">  <%-- 3 --%>
            <form:input path="firstName" />  <%-- 4 --%>
            <br/>
            <form:input path="lastName" />
            <br/>
            <form:input path="email" />
            <br/>
            <form:hidden path="id" />  <%-- 5 --%>
            <input type="submit" value="Submit">  <%-- 6 --%>
        </form:form>
    </body>
</html>