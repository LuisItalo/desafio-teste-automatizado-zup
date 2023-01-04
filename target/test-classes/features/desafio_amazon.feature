# language: pt
  Funcionalidade: pesquisar produto
    Como usuario
    Desejo fazer pesquisa de produto
    Confirmar pesquisa


    Cenario: Deve pesquisar por nome com acento
      Dado que estou no site a Amazon
      Quando digitar "panela de pressão"
      Entao retorna lista de produtos
      Entao adiciona no carrinho


