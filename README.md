# Cooknary

## Sobre

Sistema voltado para o gerenciamento na criação de receitas, avaliação de qualidade das mesma e produção de exemplares
contendo uma vasta coleção de receitas criadas por diferentes chefes de cozinha. 

O sistema conta com requisitos de autenticação, visto que o projeto é voltado para o gerenciamento interno dos restaurantes, 
onde os chefes de cozinha são pagos para elaborar receitas diversificadas e de alta qualidade no sabor. 

Além do chefe de cozinha, esse sistema contém outros dois roles, sendo eles, degustador e editor. Cada um desses roles tem funções e privilégios diferentes no sistema, 
sendo liberado fazer somente aquilo que seu nível de acesso o atribui a fazer.

<p>

  
</p>

## Tecnologias

- Spring Boot (Framework Java, Back-end)
- MySql (Base de dados)
- React (Framework js/typescript, Front-end)
- Tailwind (Estilos)
- JWT (Autenticação por token)
- Postman (Teste de APIs)

## Requisitos

- Maven
- Spring Boot 3.4.4
- Java 21
- React 18.2.0

## Rotas da API

## Autenticação

### Método de Autenticação
<p>
Autenticação através do token com JWT, onde a API recebe uma request para validar o email e senha do usuário, caso a validação seja bem sucedida um token JWT será gerado e enviado na response. Nesse token contém informações do usuário logado, nome da aplicação e tempo de validade do token.
</p>

### Rotas de Autenticação

<p>
  Para autenticar deverá ser informado o email e a senha do usuário no formato json, com o verbo HTTP POST.
  Um usuário só pode ser autenticado se ele já estiver cadastrado no sistema. Para cadastrar siga o tópico (Rotas usuário).
</p>

<p>
  Exemplo: {"email":"kevigo@gmail.com","senha":"123"}
</p>

<table>
  <tr>
    <th>Verbo Http</th>
    <th>Rota</th>
    <th>Descrição</th>
    <th>Permição</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/auth</td>
    <td>Autenticar usuário</td>
    <td>permitAll</td>
  </tr>
</table>

### Rotas Usuário
<p>
  Para autenticar deverá ser informado o email e a senha do usuário no formato json, com o verbo HTTP POST.
</p>

<table>
  <tr>
    <th>Verbo Http</th>
    <th>Rota</th>
    <th>Descrição</th>
    <th>Permição</th>
  </tr>
  <tr>
    <td>GET</td>
    <td>/user/{id}</td>
    <td>Buscar usuário pelo ID</td>
    <td>authenticated</td>
  </tr>
  <tr>
    <td>POST</td>
    <td>/user</td>
    <td>Cadastrar usuário</td>
    <td>permitAll (temporariamente para teste)</td>
  </tr>
  <tr>
    <td>PUT</td>
    <td>/user/{id}</td>
    <td>Alterar dados do usuário</td>
    <td>authenticated</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/user/{id}</td>
    <td>Exclír usuário</td>
    <td>authenticated</td>
  </tr>
</table>
