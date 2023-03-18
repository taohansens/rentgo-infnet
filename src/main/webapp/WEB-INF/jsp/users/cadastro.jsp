<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cadastro de Usuário</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="text/javascript" src="/jquery/jquery-3.2.1.min.js"></script>
</head>
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp" />
    <div class="text-center">
        <h2>Cadastro de Usuário</h2>
    </div>
    <form action="/usuarios/registrar" method="post">
        <h4 class="mb-3">Informações do Usuário</h4>
                <div class="col-5">
                    <label for="email" class="form-label">Email</label>
                    <div class="input-group has-validation">
                        <span class="input-group-text">@</span>
                        <input type="email" class="form-control" id="email" name="emailForm" placeholder="Digite seu email" required>
                        <div class="invalid-feedback">
                            Esse não é um email válido.
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <label for="password" class="form-label">Senha</label>
                    <input type="text" class="form-control" id="password" name="passForm" placeholder="Senha" value="" required>
                    <div class="invalid-feedback">
                        Esse campo precisa estar preenchido.
                    </div>
                </div>
<%--        <input type="hidden" id="userID" name="idForm" value="0">--%>
            <button class="mt-5 w-100 btn btn-success btn-lg" type="submit">Cadastrar</button>
        </form>
            <a class="mt-2 mb-2 w-100 btn btn-outline-dark btn-lg" href="/usuarios/listar">Voltar</a>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>