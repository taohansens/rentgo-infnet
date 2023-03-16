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
<body class="d-flex h-100 text-center bg-light">
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
    <header class="mb-auto">
        <div>
            <h3 class="float-md-start mb-0">RentGo - Listar Lojas</h3>
            <nav class="nav nav-masthead justify-content-center float-md-end">
                <a class="nav-link fw-bold py-1 px-0 m-2 text-black btn-link" aria-current="page"
                   href="/home">Voltar para Home</a>
            </nav>
        </div>
    </header>
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
                <th>Nome</th>
                <th>Endereço</th>
                <th>Complemento</th>
                <th>Bairro</th>
                <th>Cidade</th>
                <th>Estado</th>
                <th>CEP</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="store" items="${stores}">
                <tr>
                    <td>${store.nameForm}</td>
                    <td>${store.endForm}</td>
                    <td>${store.compForm}</td>
                    <td>${store.bairroForm}</td>
                    <td>${store.cidadeForm}</td>
                    <td>${store.estadoForm}</td>
                    <td>${store.cepForm}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>