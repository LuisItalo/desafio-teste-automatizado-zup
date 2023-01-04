$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/desafio_amazon.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "pesquisar produto",
  "description": "Como usuario\nDesejo fazer pesquisa de produto\nConfirmar pesquisa",
  "id": "pesquisar-produto",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Deve pesquisar por nome com acento",
  "description": "",
  "id": "pesquisar-produto;deve-pesquisar-por-nome-com-acento",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "que estou no site a Amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "digitar \"panela de pressão\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "retorna lista de produtos",
  "keyword": "Entao "
});
formatter.step({
  "line": 12,
  "name": "adiciona no carrinho",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaTeste.que_estou_no_site_a_Amazon()"
});
formatter.result({
  "duration": 14886966252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "panela de pressão",
      "offset": 9
    }
  ],
  "location": "PesquisaTeste.digitar(String)"
});
formatter.result({
  "duration": 3320869978,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaTeste.retorna_lista_de_produtos()"
});
formatter.result({
  "duration": 3751031090,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaTeste.adicionaNoCarrinho()"
});
formatter.result({
  "duration": 10247757426,
  "status": "passed"
});
});