<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cadastro de Veículo - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="container">
    <div class="py-2 text-center">
        <h2>Cadastro de Veículo</h2>
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
            <button class="mt-5 w-100 btn btn-success btn-lg" type="submit">Cadastrar</button>
        </form>
            <a class="mt-2 mb-2 w-100 btn btn-outline-dark btn-lg" href="/vehicle/listar">Voltar</a>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>