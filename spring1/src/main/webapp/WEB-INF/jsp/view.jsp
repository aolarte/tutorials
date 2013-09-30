<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  <%-- 1 --%>
<html>
    <body>
        <table border="1">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>


            <c:forEach items="${persons}" var="person"> <%-- 2 --%>
                <tr>
                    <td>${person.firstName}</td>    <%-- 3 --%>
                    <td>${person.lastName}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>