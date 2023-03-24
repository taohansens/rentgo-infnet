<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cadastro de Veículo - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="text-center">
        <h2>Cadastro de Ve&iacute;culo</h2>
    </div>
    <form action="/vehicle/registrar" method="post">
        <h4 class="mb-3">Informações do Carro</h4>
            <div class="row g-3">
                <div class="col-6">
                    <label for="placaForm" class="form-label">Placa do Carro</label>
                    <input type="text" class="form-control" id="placaForm" name="placaForm" placeholder="Placa do Carro" value="" required>
                    <div class="invalid-feedback">
                        Esse campo precisa estar preenchido.
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label for="idStoreForm">Selecione a Loja</label>
                <select class="form-control" id="idStoreForm" name="idStoreForm">
                    <c:if test="${empty storesAvailable}">
                        <div class="alert alert-danger" role="alert">Nenhuma loja foi encontrada.</div>
                    </c:if>
                    <c:if test="${not empty storesAvailable}">
                        <c:forEach var="store" items="${storesAvailable}">
                            <option value="${store.idForm}">${store.nameForm}</option>
                        </c:forEach>
                    </c:if>
                </select>
            </div>
            <button class="mt-5 w-100 btn btn-success btn-lg" type="submit">Cadastrar</button>
        </form>
            <a class="mt-2 mb-2 w-100 btn btn-outline-dark btn-lg" href="/vehicle/listar">Voltar</a>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>