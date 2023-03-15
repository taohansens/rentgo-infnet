<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cadastro de Cliente RentGo</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="container">
    <div class="py-2 text-center">
        <h2>Cadastro de Cliente</h2>
    </div>
    <form action="/clientes/registrar" method="post">
        <h4 class="mb-3">Informações do cliente</h4>
            <div class="row g-3">
                <div class="col-6">
                    <label for="nameForm" class="form-label">Nome Completo</label>
                    <input type="text" class="form-control" id="nameForm" name="nameForm" placeholder="" value="" required>
                    <div class="invalid-feedback">
                        Esse campo precisa estar preenchido.
                    </div>
                </div>
                <div class="col-5">
                    <label for="emailForm" class="form-label">Email</label>
                    <div class="input-group has-validation">
                        <span class="input-group-text">@</span>
                        <input type="email" class="form-control" id="emailForm" name="emailForm" placeholder="Digite seu email" required>
                        <div class="invalid-feedback">
                            Esse não é um email válido.
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <label for="telForm" class="form-label">Telefone</label>
                    <input type="text" class="form-control" id="telForm" name="telForm" placeholder="Telefone" value="" required>
                    <div class="invalid-feedback">
                        Esse campo precisa estar preenchido.
                    </div>
                </div>
                <h4 class="mt-4 mb-1">Documentação do cliente</h4>
                <div class="col-md-5">
                    <label for="rgForm" class="form-label">RG</label>
                    <input type="text" class="form-control" id="rgForm" name="rgForm" placeholder="Registro Geral" required>
                    <div class="invalid-feedback">
                        O campo RG é obrigatório.
                    </div>
                </div>

                <div class="col-md-4">
                    <label for="cpfForm" class="form-label">CPF</label>
                    <input type="text" class="form-control" id="cpfForm" name="cpfForm" placeholder="CPF" required>
                    <div class="invalid-feedback">
                        O campo CPF é obrigatório.
                    </div>
                </div>

                <div class="col-md-3">
                    <label for="cnhForm" class="form-label">CNH</label>
                    <input type="text" class="form-control" id="cnhForm" name="cnhForm" placeholder="Carteira de Habilitação" required>
                    <div class="invalid-feedback">
                        A carteira de habilitação é obrigatória.
                    </div>
                </div>

                <h4 class="mb-2 mt-4">Endereço do Cliente</h4>
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

                <div class="col-md-3">
                    <label for="cepForm" class="form-label">CEP<span class="text-muted"> *Apenas números</span> </label>
                    <input type="text" class="form-control" id="cepForm" name="cepForm" placeholder="" required>
                    <div class="invalid-feedback">
                        CEP é obrigatório.
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
            <a class="mt-2 mb-2 w-100 btn btn-outline-dark btn-lg" href="/clientes/listar">Voltar</a>
</div>
<script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>