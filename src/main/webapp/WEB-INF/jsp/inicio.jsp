<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>RentGo</title>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="css/index.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="col-lg-8 mx-auto p-4 py-md-2">
    <c:import url="/WEB-INF/jsp/menu.jsp" />
    <main>
        <h1>RentGo. Reservas.</h1>
        <p class="fs-5 col-md-8">Verifique as reservas dos clientes por aqui.</p>

        <div class="mb-5">
            <a href="/booking/listar" class="btn btn-primary btn-lg px-4">Listar
                Reservas</a>
        </div>

        <hr class="col-3 col-md-2 mb-5">

        <div class="row g-5">
            <div class="col-md-6">
                <h2>RentGo Rotas</h2>
                <p>Rotas da aplica&ccedil;&atilde;o RentGo.</p>
                <ul class="icon-list ps-0">
                    <li class="d-flex align-items-start mb-1"><a
                            href="store/listar" target="_blank">Listar
                        Lojas</a></li>
                    <li class="d-flex align-items-start mb-1"><a
                            href="store/registrar" target="_blank">Registrar
                        Lojas</a></li>
                </ul>
            </div>

            <div class="col-md-6">
                <h2>RentGo Rotas</h2>
                <p>Rotas da aplica&ccedil;&atilde;o RentGo.</p>
                <ul class="icon-list ps-0">
                    <li class="d-flex align-items-start mb-1"><a href="/"
                                                                 target="_blank">Login</a></li>
                    <li class="d-flex align-items-start mb-1"><a href="/home"
                                                                 target="_blank">Home</a></li>
                    <li class="d-flex align-items-start mb-1"><a
                            href="clientes/listar" target="_blank">Listar
                        Clientes</a></li>
                    <li class="d-flex align-items-start mb-1"><a
                            href="clientes/registrar" target="_blank">Registrar
                        Clientes</a></li>
                    <li class="text-muted d-flex align-items-start mb-1">(Em breve, outras!)</li>
                </ul>
            </div>

            <div class="col-md-6">
                <h2>Links</h2>
                <p>Links &Uacute;teis</p>
                <ul class="icon-list ps-0">
                    <li class="d-flex align-items-start mb-1"><a
                            href="https://lms.infnet.edu.br/moodle/login/index.php">Infnet</a></li>
                    <li class="d-flex align-items-start mb-1"><a href="https://github.com/taohansens/">Github
                        @taohansens</a></li>
                </ul>
            </div>
        </div>
    </main>
    <footer class="pt-5 my-5 text-muted border-top">
        RentGo. Tao Hansen. Infnet.
    </footer>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>