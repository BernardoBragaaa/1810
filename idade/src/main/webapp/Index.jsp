<html>
<head>
<title>Formul�rio de cadastro</title>
</head>
<body>

<form action="CadastroServlet" method="get">

<label for="ano_nascimento">Ano de nascimento:</label>
<input type="number" name="ano_nascimento" id="ano_nascimento">

<label for="fez_aniversario">J� fez anivers�rio?</label>
<input type="radio" name="fez_aniversario" value="sim"> Sim
<input type="radio" name="fez_aniversario" value="nao"> N�o

<label for="nome">Nome:</label>
<input type="text" name="nome" id="nome">

<label for="endereco">Endere�o:</label>
<input type="text" name="endereco" id="endereco">

<input type="submit" value="Enviar">

</form>

</body>
</html>