<%
   String numConta = (String)request.getAttribute("conta");
%>
<html>
<head>
    <title>Conta Cadastrada</title>
</head>
<body>
    <h1> <%= numConta%> Cadastrada com sucesso</h1>
    <a href="/">Voltar para banco</a>
</body>
</html>
