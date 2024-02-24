<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 24/02/2024
  Time: 07:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%
  int a=Integer.parseInt(request.getParameter("num1"));
  int b=Integer.parseInt(request.getParameter("num2"));

  pageContext.setAttribute("aVal",a,PageContext.SESSION_SCOPE);
  pageContext.setAttribute("bVal",b,PageContext.SESSION_SCOPE);
%>

<form action="sum.jsp">
    <input type="submit" value="Add">
</form>

<form action="sub.jsp">
    <input type="submit" value="Sub">

</form>

<form action="mul.jsp">
    <input type="submit" value="Mul">

</form>

<form action="div.jsp">
    <input type="submit" value="Div">

</form>

<form action="modulo.jsp">
    <input type="submit" value="Mod">

</form>

</body>
</html>
