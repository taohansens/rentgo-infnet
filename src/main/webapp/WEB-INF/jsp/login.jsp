<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login - RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/css/login.css" rel="stylesheet"/>
</head>
<body class="text-center">
<main class="form-signin w-100 m-auto">
    <h1>RentGo</h1>
    <h1 class="h3 mb-3 fw-normal">Faça o login.</h1>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <div class="form-floating">
            <input type="email" class="form-control" id="email" name="email" placeholder="email@dominio.com" value="admin@rentgo.com">
            <label for="email">Email</label>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="password" name="password" placeholder="Senha" value="admin123@">
            <label for="password">Senha</label>
        </div>

        <button class="w-100 btn btn-lg btn-primary" type="submit">Login</button>
        <p class="mt-5 mb-3 text-muted">&copy; RentGo 2023</p>
    </form>
</main>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>