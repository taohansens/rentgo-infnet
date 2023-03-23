<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Listar Clientes - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="text-center">
        <h2>Cadastro de Cliente</h2>
    </div>
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
                <th>Client ID</th>
                <th>Credential ID</th>
                <th>Credential Email</th>
                <th>Nome</th>
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
                    <td>${client.idForm}</td>
                    <td>${client.credentialIdForm}</td>
                    <td>${client.credentialEmailForm}</td>
                    <td>${client.nameForm}</td>
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
                    <td><a href="/clientes/${client.idForm}/delete">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>