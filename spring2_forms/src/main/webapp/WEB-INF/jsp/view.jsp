<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <body>
        <table border="1">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>


            <c:forEach items="${persons}" var="person">
                <tr>
                    <c:url var="personUrl" value="view/${person.id}.html"/>  <%-- 2 --%>
                    <td>
                        <a href="${personUrl}">
                            ${person.firstName}
                        </a>
                    </td>
                    <td>
                        <a href="${personUrl}">
                            ${person.lastName}
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="new.html">Click here to add a new entry</a>  <%-- 3 --%>
    </body>
</html>