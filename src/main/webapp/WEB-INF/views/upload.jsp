<%--
  Created by IntelliJ IDEA.
  User: arief
  Date: 27/01/18
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload Page</title>
</head>
<body>



    <form action="${pageContext.servletContext.contextPath}/mvc/upload" method="post" enctype="multipart/form-data">
        <input type="text" name="name" id=""/>
        <input type="file" name="file" />
        <input type="submit" value="Upload File"/>
    </form>

    <div>
        <a href="${pageContext.servletContext.contextPath}">Index Page</a>
    </div>


</body>
</html>
