Como um Colaborador
Eu posso Efetuar Login
Para garantir a segurança

Cenário: Sucesso
Dado que não estou logado
E estou na página "/login"
Quando digito "admin" no campo login
E digito "teste123" no campo senha
E clico no botão login
Então eu vejo "O que está rolando na PRW Energia?"

Cenário: Falha
Dado que não estou logado
E estou na página "/login"
Quando digito "admin" no campo login
E digito "blablabla" no campo senha
E clico no botão login
Então eu vejo "Usuário senha inválidos!"
