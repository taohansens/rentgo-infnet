<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
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
    <nav class="navbar navbar-expand-lg bg-body-tertiary border-bottom mb-5">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">RentGo</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link active dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Lojas
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/store/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/store/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Ve&iacute;culos
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/vehicle/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/vehicle/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Clientes
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/clientes/listar">Listar</a></li>
                            <li><a class="dropdown-item" href="/clientes/registrar">Cadastrar</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="text-center">
        <h2>Cadastro de Loja</h2>
    </div>
    <form action="/store/registrar" method="post">
        <h4 class="mb-3">Informações da Loja</h4>
            <div class="row g-3">
                <div class="col-6">
                    <label for="nameForm" class="form-label">Nome da Loja</label>
                    <input type="text" class="form-control" id="nameForm" name="nameForm" placeholder="Nome" value="" required>
                    <div class="invalid-feedback">
                        Esse campo precisa estar preenchido.
                    </div>
                </div>

                <h4 class="mb-2 mt-4">Endereço do Cliente</h4>
                <div class="col-md-3">
                    <label for="cepForm" class="form-label">CEP<span class="text-muted"> *Apenas números</span> </label>
                    <input type="text" class="form-control" id="cepForm" name="cepForm" placeholder="" required>
                    <div class="invalid-feedback">
                        CEP é obrigatório.
                    </div>
                </div>

                <div class="col-4">
                    <label for="endForm" class="form-label">Endereço</label>
                    <input type="text" class="form-control" id="endForm" name="endForm" placeholder="Rua ABC" required>
                    <div class="invalid-feedback">
                        O endereço é obrigatório.
                    </div>
                </div>

                <div class="col-4">
                    <label for="compForm" class="form-label">Complemento</label>
                    <input type="text" class="form-control" id="compForm" name="compForm" placeholder="Casa/Apartamento">
                </div>


                <div class="col-3">
                    <label for="bairroForm" class="form-label">Bairro</label>
                    <input type="text" class="form-control" id="bairroForm" name="bairroForm" placeholder="Bairro">
                </div>

                <div class="col-md-5">
                    <label for="cidadeForm" class="form-label">Cidade</label>
                    <input type="text" class="form-control" id="cidadeForm" name="cidadeForm" placeholder="Cidade" required>
                    <div class="invalid-feedback">
                        A cidade é obrigatória.
                    </div>
                </div>

                <div class="col-md-4">
                    <label for="estadoForm" class="form-label">Estado</label>
                    <select class="form-select" id="estadoForm" name="estadoForm" required>
                        <option value="">Selecione</option>
                        <option value="AC">Acre</option>
                        <option value="AL">Alagoas</option>
                        <option value="AP">Amapá</option>
                        <option value="AM">Amazonas</option>
                        <option value="BA">Bahia</option>
                        <option value="CE">Ceará</option>
                        <option value="DF">Distrito Federal</option>
                        <option value="ES">Espirito Santo</option>
                        <option value="GO">Goiás</option>
                        <option value="MA">Maranhão</option>
                        <option value="MS">Mato Grosso do Sul</option>
                        <option value="MT">Mato Grosso</option>
                        <option value="MG">Minas Gerais</option>
                        <option value="PA">Pará</option>
                        <option value="PB">Paraíba</option>
                        <option value="PR">Paraná</option>
                        <option value="PE">Pernambuco</option>
                        <option value="PI">Piauí</option>
                        <option value="RJ">Rio de Janeiro</option>
                        <option value="RN">Rio Grande do Norte</option>
                        <option value="RS">Rio Grande do Sul</option>
                        <option value="RO">Rondônia</option>
                        <option value="RR">Roraima</option>
                        <option value="SC">Santa Catarina</option>
                        <option value="SP">São Paulo</option>
                        <option value="SE">Sergipe</option>
                        <option value="TO">Tocantins</option>
                    </select>
                    <div class="invalid-feedback">
                        Selecione o Estado.
                    </div>
                </div>
            </div>

            <hr class="my-4">
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="verifiedForm" name="verifiedForm" required>
                <label class="form-check-label" for="verifiedForm">Todas as informações declaradas são verdadeiras.</label>
            </div>

            <button class="mt-5 w-100 btn btn-success btn-lg" type="submit">Cadastrar</button>
        </form>
            <a class="mt-2 mb-2 w-100 btn btn-outline-dark btn-lg" href="/store/listar">Voltar</a>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
    $("#cepForm").focusout(function(){
        $.ajax({
            url: 'https://viacep.com.br/ws/'+$(this).val()+'/json',
            dataType: 'json',
            success: function(resposta){
                $("#endForm").val(resposta.logradouro);
                $("#complemento").val(resposta.complemento);
                $("#bairroForm").val(resposta.bairro);
                $("#cidadeForm").val(resposta.localidade);
                $("#estadoForm").val(resposta.uf);
                $("#compForm").focus();
            }
        });
    });
</script>
</body>
</html>