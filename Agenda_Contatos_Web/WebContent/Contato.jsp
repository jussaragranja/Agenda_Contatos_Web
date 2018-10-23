<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contato</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<div>
		<form role="form" action="ContatoServlet">
			<h2>Cadastro de Contato</h2>
			
			<div>
				<label for="nome_">Nome: *</label> <input type="text" name="nome"
					class="form-control" id="nome" style="min-width: 50%;"
					placeholder="Digite o NOME" /><br />
			</div>
			
			<div>
				<label for="cpf_">CPF: *</label> <input type="text" name="cpf"
					class="form-control" id="cpf" style="min-width: 50%;"
					placeholder="Digite o CPF" /><br />
			</div>
			
			<div>
				<label for="email_">Email 1: *</label> <input type="text" name="email1"
					class="form-control" id="email1" style="min-width: 50%;"
					placeholder="Digite o EMAIL" /><br />
			</div>
			
			<div>
				<label for="email_">Email 2: *</label> <input type="text" name="email2"
					class="form-control" id="email2" style="min-width: 50%;"
					placeholder="Digite o EMAIL" /><br />
			</div>
			
			<div>
				<label for="telefone_">Telefone 1: *</label> <input type="text"
					name="telefone1" class="form-control" id="telefone1"
					style="min-width: 50%;" placeholder="Digite o NÚMERO" /><br />
			</div>
			
			<div>
				<label for="telefone_">Telefone 2: *</label> <input type="text"
					name="telefone2" class="form-control" id="telefone2"
					style="min-width: 50%;" placeholder="Digite o NÚMERO" /><br />
			</div>
			
			<div align="center">
				<button type="submit" class="btn btn-success">Salvar</button>
				<button type="reset" class="btn btn-danger">Limpar</button>
			</div>
		</form>
	</div>
</body>
</html>