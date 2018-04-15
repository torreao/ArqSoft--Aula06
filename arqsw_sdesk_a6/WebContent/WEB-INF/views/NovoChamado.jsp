<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Novo Chamado</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>
	<!-- Barra superior com os menus de navegação -->
	<c:import url="Menu.jsp" />
	<!-- Container Principal -->
	<div id="main" class="container">
		<h3 class="page-header">Consultar Chamados</h3>
		<form action="salvarChamado">
			<div class="row">
				<div class="form-group col-md-6">
					<label for="fila">Escolha a Fila:</label> <select
						class="form-control" name="id">
						<c:forEach var="fila" items="${filas}">
							<option value="${fila.id}">${fila.nome}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label for="comment">Descrição:</label>
						<textarea class="form-control" name="descricao" rows="5" minlength="10" required></textarea>
					</div>
				</div>
			</div>

			<input type="submit" class="btn btn-success" value="enviar" />
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>