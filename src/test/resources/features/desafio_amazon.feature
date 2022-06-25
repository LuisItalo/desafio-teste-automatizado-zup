# language: pt
  Funcionalidade: Acessar site
    Como cliente
    Quero acessar site Amazon
    Adicionar o produto no carrinho

  Cenario: Deve acessar site
    Dado que acesso o site Amazon
    Quando escolher por "panela de pressao"
    Entao adiciona no carrinho

#@ignore
#    Cenario: Deve acessar site
#      Dado que acesso o site Amazon
#      Quando digito por "naoqueroproduto"
#      Entao retorna erro