<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Lista Lojas - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="text-center">
        <h2>Cadastro de Loja</h2>
    </div>
    <main class="px-3">
        <a class="btn btn-primary mt-1 mb-2" href="/store/registrar" role="button">Nova
            Loja</a>
        <c:if test="${empty stores}">
            <div class="alert alert-danger" role="alert">Nenhuma loja foi encontrado.</div>
        </c:if>

        <c:if test="${not empty stores}">
            <p>Número de lojas cadastrados: ${stores.size()}</p>
        </c:if>

        <table class="table table-striped table-hover table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Endereço</th>
                <th>Complemento</th>
                <th>Bairro</th>
                <th>Cidade</th>
                <th>Estado</th>
                <th>CEP</th>
                <th>Carros</th>
                <th>Qtd. de Carros</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="store" items="${stores}">
                <tr>
                    <td>${store.idForm}</td>
                    <td>${store.nameForm}</td>
                    <td>${store.endForm}</td>
                    <td>${store.compForm}</td>
                    <td>${store.bairroForm}</td>
                    <td>${store.cidadeForm}</td>
                    <td>${store.estadoForm}</td>
                    <td>${store.cepForm}</td>
                    <td>${store.vehicleDTOS}</td>
                    <td>${store.vehicleDTOS.size()}</td>
                    <td><a href="/store/${store.idForm}/delete">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>