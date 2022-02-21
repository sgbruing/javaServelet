<%
   String numAgencia = (String)request.getAttribute("agencia");
%>
<html>
<head>
    <title>Agência Cadastrada</title>
</head>
<body>
    <h1> <%= numAgencia%> Cadastrada com sucesso</h1>
    <a href="/">Voltar para banco</a>
</body>
</html>
