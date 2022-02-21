<%@ page import="com.example.santander.model.AgenciaModel" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: cinth
  Date: 16/02/2022
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Agências</title>
</head>
<body>
    <ul>
        <%
            List<AgenciaModel> agencias = (List)request.getAttribute("agencias");
            for(AgenciaModel agenciaModel: agencias){
        %>
                <li><%= agenciaModel.getNum()%></li>

      <%
          }
      %>
    </ul>
    <a href="/">Voltar para banco</a>
</body>
</html>
