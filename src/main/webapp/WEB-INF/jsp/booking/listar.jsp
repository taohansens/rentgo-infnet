<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Lista Reservas - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="text-center">
        <h2>Lista de Reservas</h2>
    </div>
    <main class="px-3">
        <a class="btn btn-primary mt-1 mb-2" href="/booking/registrar" role="button">Nova
            Reserva</a>
        <c:if test="${empty bookings}">
            <div class="alert alert-danger" role="alert">Nenhuma reserva foi encontrada.</div>
        </c:if>

        <c:if test="${not empty bookings}">
            <p>Número de reservas encontradas: ${bookings.size()}</p>
        </c:if>

        <table class="table table-striped table-hover table-bordered">
            <thead>
            <tr>
                <th>ID Reserva</th>
                <th>Loja</th>
                <th>Cliente ID</th>
                <th>Cliente</th>
                <th>CPF</th>
                <th>Inicio</th>
                <th>Fim</th>
                <th>Carro ID</th>
                <th>Placa</th>
                <th>Observação</th>
                <th>Preço</th>
                <th>Pago?</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="booking" items="${bookings}">
                <tr>
                    <td>${booking.idForm}</td>
                    <td>${booking.storeIdForm}</td>
                    <td>${booking.clientIdForm}</td>
                    <td>${booking.clientNameForm}</td>
                    <td>${booking.clientCPFForm}</td>
                    <td>${booking.dinicioForm}</td>
                    <td>${booking.dfimForm}</td>
                    <td>${booking.vehicleIdForm}</td>
                    <td>${booking.vehiclePlacaForm}</td>
                    <td>${booking.infoForm}</td>
                    <td>${booking.priceForm}</td>
                    <td>${booking.paydForm}</td>
                    <td><a href="/booking/${booking.idForm}/delete">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>