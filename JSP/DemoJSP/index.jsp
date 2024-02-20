<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--Dirrective tag :Used to import packages or classes--%>
<%@page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<%--JSP Expressions : These are used to to print data on web page--%>
<%= " Hello Learners , go deep dive to understand JSP"%>

<%--Directive tags : To declare variables methods related to java code--%>
<%!
    int arr[]=new int[5];
%>

<%--Scriplet tags : Used to insert Java code in JSP file--%>
<%
    int n=arr.length;
  for(int i=0;i<n;i++)  {
      arr[i]=i+1;
  }

%>
<%=Arrays.toString(arr)%>

</body>
</html>