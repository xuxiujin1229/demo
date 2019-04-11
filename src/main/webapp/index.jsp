<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <div>
        <table>
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>密码</td>
                <td>性别</td>
            </tr>
            <c:forEach var="user" items="${requestScope.userList}">
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.userName}</td>
                    <td>${user.password}</td>
                    <td>
                        <c:choose>
                            <c:when test="${user.sex == 0}">
                                女
                            </c:when>
                            <c:otherwise>
                                男
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </c:forEach>
        </table>
      </div>
  </body>
</html>
