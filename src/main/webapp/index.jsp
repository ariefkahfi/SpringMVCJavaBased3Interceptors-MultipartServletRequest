<%--
  Created by IntelliJ IDEA.
  User: arief
  Date: 27/01/18
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index Page</title>
</head>
<body>


    <div>
        <%--serving images from file system using /contextPath/YOUR_SERVLET_MAPPING_URL/YOUR_RESOURCE_HANDLER/url/to/images--%>
        <img src="${pageContext.servletContext.contextPath}/mvc/images/index.jpeg" alt="no Image"/>
    </div>

    <ul>
        <li><a href="${pageContext.servletContext.contextPath}/mvc/upload">Form Upload Page</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/mvc/pages/hello">Hello Page</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/mvc/pages/hello-world">Hello World Page</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/mvc/get-pdf">get PDF Page</a></li>
    </ul>
</body>
</html>
