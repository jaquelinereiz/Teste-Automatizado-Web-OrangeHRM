#language: pt
#enconding: UTF-8

Funcionalidade: Login

Cenario: usuario invalido
   Quando eu informar o usuario "Ad"
   E informar a senha "asd"
   E clicar no botao login
   Entao o sistema exibe a mensagem de usuario invalido
 
@loginSucesso
Cenario: Realizar login
   Quando eu informar o usuario "Admin"
   E informar a senha "admin123"
   E clicar no botao login
   Entao o sistema exibe o usuario logado exibindo pagina contendo o Dashboard
