<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Listar Usu&uacute;rios do Sistema - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="text-center">
        <h2>Lista de Usu&aacute;rios</h2>
    </div>
    <main class="px-3">
        <a class="btn btn-primary mt-1 mb-2" href="/usuarios/registrar" role="button">Novo
            Usu&aacute;rio</a>
        <c:if test="${empty usuarios}">
            <div class="alert alert-danger" role="alert">Nenhum usuário foi encontrado.</div>
        </c:if>

        <c:if test="${not empty usuarios}">
            <p>Número de usuários cadastrados: ${usuarios.size()}</p>
        </c:if>

        <table class="table table-striped table-hover table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>E-mail</th>
                <th>Senha</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="usuario" items="${usuarios}">
                <tr>
                    <td>${usuario.idForm}</td>
                    <td>${usuario.emailForm}</td>
                    <td>${usuario.passForm}</td>
                    <td><a href="/usuarios/${usuario.idForm}/delete">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>