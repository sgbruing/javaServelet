<%@ page import="com.example.santander.model.ContaModel" %>
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
    <title>Contas</title>
</head>
<body>
    <ul>
        <%
            List<ContaModel> contas = (List)request.getAttribute("contas");
            for(ContaModel contaModel: contas){
        %>
                <li><%= contaModel.getNum()%></li>

      <%
          }
      %>
    </ul>
    <a href="/">Voltar para banco</a>
</body>
</html>
