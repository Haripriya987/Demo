<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 24/02/2024
  Time: 08:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int product(int a,int b){
        return a*b;
    }
%>
<%
    Integer aValue=(Integer) pageContext.getAttribute("aVal",PageContext.SESSION_SCOPE);
    int a=aValue!=null?aValue.intValue():0;

    Integer bValue=(Integer) pageContext.getAttribute("bVal",PageContext.SESSION_SCOPE);
    int b=bValue!=null?bValue.intValue():0;
%>

<h1>Product of Numbers : <%=product(a,b)%></h1>
<%@include file="footer.html"%>

</body>
</html>
