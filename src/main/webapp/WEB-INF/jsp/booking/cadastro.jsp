<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cadastro de Loja - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="text/javascript" src="/jquery/jquery-3.2.1.min.js"></script>
</head>
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="text-center">
        <h2>Incluir Reserva</h2>
    </div>
    <form action="/booking/registrar" method="post">
        <h4 class="mb-3">Informações da Reserva</h4>
        <div class="form-group">
        </div>

<button class="mt-5 w-100 btn btn-success btn-lg" type="submit">Cadastrar</button>
</form>
<a class="mt-2 mb-2 w-100 btn btn-outline-dark btn-lg" href="/booking/listar">Voltar</a>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>