<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Lista Clientes - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="d-flex h-100 text-center bg-light">
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
    <header class="mb-auto">
        <div>
            <h3 class="float-md-start mb-0">RentGo - Listar Clientes</h3>
            <nav class="nav nav-masthead justify-content-center float-md-end">
                <a class="nav-link fw-bold py-1 px-0 m-2 text-black btn-link" aria-current="page"
                   href="/">Voltar para Home</a>
            </nav>
        </div>
    </header>
    <main class="px-3">
        <a class="btn btn-primary mt-1 mb-2" href="/clientes/registrar" role="button">Novo
            Cliente</a>
        <c:if test="${empty clientes}">
            <div class="alert alert-danger" role="alert">Nenhum usuário foi encontrado.</div>
        </c:if>

        <c:if test="${not empty clientes}">
            <p>Número de usuários cadastrados: ${clientes.size()}</p>
        </c:if>

        <table class="table table-striped table-hover table-bordered">
            <thead>
            <tr>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Tefone</th>
                <th>RG</th>
                <th>CPF</th>
                <th>CNH</th>
                <th>Endereço</th>
                <th>Complemento</th>
                <th>Bairro</th>
                <th>Cidade</th>
                <th>Estado</th>
                <th>CEP</th>
                <th>Verificado?</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="client" items="${clientes}">
                <tr>
                    <td>${client.nameForm}</td>
                    <td>${client.emailForm}</td>
                    <td>${client.telForm}</td>
                    <td>${client.rgForm}</td>
                    <td>${client.cpfForm}</td>
                    <td>${client.cnhForm}</td>
                    <td>${client.endForm}</td>
                    <td>${client.compForm}</td>
                    <td>${client.bairroForm}</td>
                    <td>${client.cidadeForm}</td>
                    <td>${client.estadoForm}</td>
                    <td>${client.cepForm}</td>
                    <td>${client.verifiedForm}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>