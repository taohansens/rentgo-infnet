<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cadastro - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/css/login.css" rel="stylesheet"/>
</head>
<body class="text-center">
<main class="form-signin w-100 m-auto">
    <h1>RentGo</h1>
    <h1 class="h3 mb-3 fw-normal">Faça o cadastro.</h1>
    <form action="/usuarios/registrar" method="post">>
        <div class="form-floating">
            <input type="email" class="form-control" id="email" name="emailForm" placeholder="email@dominio.com" value="admin@rentgo.com">
            <label for="email">Email</label>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="password" name="passForm" placeholder="Senha" value="admin123@">
            <label for="password">Senha</label>
        </div>

        <button class="w-100 btn btn-lg btn-primary" type="submit">Cadastrar</button>
        <p class="mt-5 mb-3 text-muted">&copy; RentGo 2023</p>
    </form>
    <a class="mt-2 mb-2 w-100 btn btn-outline-dark btn-lg" href="/">Voltar</a>
</main>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>