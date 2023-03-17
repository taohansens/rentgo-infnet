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
    <nav class="navbar navbar-expand-lg bg-body-tertiary border-bottom mb-5">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">RentGo</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
                    aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link active dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            Lojas
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/store/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/store/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            Ve&iacute;culos
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/vehicle/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/vehicle/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            Clientes
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/clientes/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/clientes/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="text-center">
        <h2>Cadastro de Loja</h2>
    </div>
    <nav class="nav nav-masthead justify-content-center float-md-end">
        <a class="nav-link fw-bold py-1 px-0 m-2 text-black btn-link" aria-current="page"
           href="/">Voltar para Home</a>
    </nav>
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