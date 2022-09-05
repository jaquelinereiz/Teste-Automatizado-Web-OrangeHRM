#language: pt
#enconding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastar Usuario

 @cadastro
 Cenario: cadastrar usuario
   Quando acionar a aba admin
   E acionar o botao Add
   E informar no campo employee name "Fiona Grace"
   E informar no campo username "Gabriel"
   E informar no campo password "12345678"
   E informar no campo confirmar password "12345678"
   E acionar o botao salvar
   Entao o sistema cadastra o usuario "Gabriel"
 