<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<nav class="navbar navbar-expand-lg bg-body-tertiary border-bottom mb-5">
    <div class="container-fluid">
            <a class="navbar-brand" href="/">RentGo</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
                    aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <div>
                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            Lojas
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/store/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/store/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            Ve&iacute;culos
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/vehicle/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/vehicle/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            Clientes
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/clientes/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/clientes/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            Usuários do Sistema
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/usuarios/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/usuarios/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        <div class="nav-right">
            <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" aria-current="page" href="/register">Sign Up</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" aria-current="page" href="/login">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" aria-current="page" href="#">Logout</a>
            </li>
            </ul>
        </div>
    </div>
</nav>