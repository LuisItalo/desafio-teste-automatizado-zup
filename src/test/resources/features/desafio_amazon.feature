# language: pt
  Funcionalidade: pesquisar produto
    Como usuario
    Desejo fazer pesquisa de produto
    Confirmar pesquisa

    Cenario: Deve pesquisar por nome com acento
      Dado que estou no site a Amazon
      Quando digitar "panela de pressão"
      Entao retorna lista de produtos com acento

    Cenario: Deve pesquisar por nome sem acento
      Dado que estou no site a Amazon
      Quando digitar "panela de pressao"
      Entao retorna lista de produtos sem acento

#  Funcionalidade: Acessar site
#    Como cliente
#    Quero acessar site Amazon
#    Adicionar o produto no carrinho

#  Cenario: Deve acessar site
#    Dado que acesso o site Amazon
#    Quando escolher por "panela de pressao"
#    Entao adiciona no carrinho

#@ignore
#    Cenario: Deve acessar site
#      Dado que acesso o site Amazon
#      Quando digito por "naoqueroproduto"
#      Entao retorna erro