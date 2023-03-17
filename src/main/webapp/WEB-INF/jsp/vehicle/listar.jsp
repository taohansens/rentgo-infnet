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
    <script type="text/javascript" src="/jquery/jquery-3.2.1.min.js"></script>
</head>
<body class="d-flex h-100 text-center bg-light">
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
    <header class="mb-auto">
        <div>
            <h3 class="float-md-start mb-0">RentGo - Listar Veículos</h3>
            <nav class="nav nav-masthead justify-content-center float-md-end">
                <a class="nav-link fw-bold py-1 px-0 m-2 text-black btn-link" aria-current="page"
                   href="/">Voltar para Home</a>
            </nav>
        </div>
    </header>
    <main class="px-3">
        <a class="btn btn-primary mt-1 mb-2" href="/vehicle/registrar" role="button">Novo Carro</a>
        <c:if test="${empty vehicles}">
            <div class="alert alert-danger" role="alert">Nenhum carro foi encontrado.</div>
        </c:if>

        <c:if test="${not empty vehicles}">
            <p>Número de carros cadastrados: ${vehicles.size()}</p>
        </c:if>

        <table class="table table-striped table-hover table-bordered">
            <thead>
            <tr>
                <th>Placa</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="vehicle" items="${vehicles}">
                <tr>
                    <td>${vehicle.placaForm}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>