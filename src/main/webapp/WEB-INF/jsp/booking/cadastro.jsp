<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cadastro de Loja - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="text/javascript" src="/jquery/jquery-3.2.1.min.js"></script>
</head>
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="text-center">
        <h2>Incluir Reserva</h2>
    </div>
    <form action="/booking/registrar" method="post">
        <h4 class="mb-3">Informações da Reserva</h4>
        <div class="form-group">
            <label for="storeIdForm">Selecione a Loja</label>
            <select class="form-control" id="storeIdForm" name="storeIdForm">
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
        <div class="form-group">
            <label for="vehicleIdForm">Selecione o Veículo</label>
            <select class="form-control" id="vehicleIdForm" name="vehicleIdForm">
                <c:if test="${empty vehiclesAvailable}">
                    <div class="alert alert-danger" role="alert">Nenhum veículo encontrado.</div>
                </c:if>
                <c:if test="${not empty vehiclesAvailable}">
                    <c:forEach var="vehicle" items="${vehiclesAvailable}">
                        <option value="${vehicle.idForm}">${vehicle.placaForm}</option>
                    </c:forEach>
                </c:if>
            </select>
        </div>
        <div class="form-group">
            <label for="clientIdForm">Selecione o Cliente</label>
            <select class="form-control" id="clientIdForm" name="clientIdForm">
                <c:if test="${empty clientsAvailable}">
                    <div class="alert alert-danger" role="alert">Nenhum Cliente encontrado.</div>
                </c:if>
                <c:if test="${not empty clientsAvailable}">
                    <c:forEach var="client" items="${clientsAvailable}">
                        <option value="${client.idForm}">${client.nameForm}</option>
                    </c:forEach>
                </c:if>
            </select>
        </div>

        <div class="row g-3">
            <div class="col-6">
                <label for="priceForm" class="form-label">Preço da Reserva</label>
                <input type="number" class="form-control" id="priceForm" name="priceForm" placeholder="Preço da Reserva" value="" required>
                <div class="invalid-feedback">
                    Esse campo precisa estar preenchido.
                </div>
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="paydForm" name="paydForm" required>
                <label class="form-check-label" for="paydForm">Reserva Paga.</label>
            </div>
        </div>
        <div class="row g-3">
            <div class="col-6">
                <label for="dinicioForm" class="form-label">Data Início da Reserva</label>
                <input type="date" class="form-control" id="dinicioForm" name="dinicioForm" placeholder="Data Inicial" value="" required>
                <div class="invalid-feedback">
                    Esse campo precisa estar preenchido.
                </div>
            </div>
        </div>
        <div class="row g-3">
            <div class="col-6">
                <label for="dfimForm" class="form-label">Data Fim da Reserva</label>
                <input type="date" class="form-control" id="dfimForm" name="dfimForm" placeholder="Data Final" value="" required>
                <div class="invalid-feedback">
                    Esse campo precisa estar preenchido.
                </div>
            </div>
        </div>
        <div class="row g-3">
            <div class="col-6">
                <label for="infoForm" class="form-label">Informações Adicionais</label>
                <input type="date" class="form-control" id="infoForm" name="infoForm" placeholder="Informações" value="" required>
                <div class="invalid-feedback">
                    Esse campo precisa estar preenchido.
                </div>
            </div>
        </div>

<button class="mt-5 w-100 btn btn-success btn-lg" type="submit">Cadastrar</button>
</form>
<a class="mt-2 mb-2 w-100 btn btn-outline-dark btn-lg" href="/booking/listar">Voltar</a>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>