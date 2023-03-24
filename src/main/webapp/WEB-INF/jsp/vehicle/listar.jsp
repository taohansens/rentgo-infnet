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
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="text-center">
        <h2>Lista de Ve&iacute;culos</h2>
    </div>
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
                <th>ID</th>
                <th>Placa</th>
                <th>Loja</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="vehicle" items="${vehicles}">
                <tr>
                    <td>${vehicle.idForm}</td>
                    <td>${vehicle.placaForm}</td>
                    <td>${vehicle.nameStoreForm}</td>
                    <td><a href="/vehicle/${vehicle.idForm}/delete">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>