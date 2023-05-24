
<h1>Desafio ZUP Automa&ccedil;&atilde;o Web</h1>

<p>Este &eacute; um&nbsp;<strong>Projeto Maven</strong>&nbsp;e foi criado conforme requisito abaixo, utilizando os seguintes recursos:</p>

<ul>
	<li>Java;</li>
	<li>Maven;</li>
	<li>JUnit;</li>
	<li>Selenium;</li>
	<li>Cucumber (BDD);</li>
	<li>Padr&atilde;o PageObjects;</li>
	<li>Git (git-flow).</li>
</ul>

<h2>Requisito</h2>

<p>Utilizando as ferramentas que preferir crie um teste automatizado que fa&ccedil;a o fluxo de ponta a ponta de um cliente que:</p>

<p><em>1 - Entre em um grande portal de com&eacute;rcio online</em>&nbsp;<em>(Exemplo: Americanas, Submarino, Magazine Luiza)</em></p>

<p><em>2 - Fa&ccedil;a uma busca por um produto</em></p>

<p><em>3 - Valide o retorno da busca</em></p>

<p><em>4 - Escolha um produto na lista</em></p>

<p><em>5 - Adicione o carrinho</em></p>

<p><em>6 - Valide o produto no carrinho</em></p>

<p>Para a cria&ccedil;&atilde;o dos cen&aacute;rios de testes devem ser considerados casos de sucesso e fluxos alternativos</p>

<p>&nbsp;</p>

<h2>Planejamento dos Testes</h2>

<p><strong>Mapeando Cen&aacute;rios de Teste</strong></p>

<p><em>Funcionalidade: Busca de Produtos</em></p>

<ul>
	<li>Cen&aacute;rio: Buscar por produto - Valido</li>
	<li>Cen&aacute;rio: Buscar por produto - Invalido</li>
	<li>Cen&aacute;rio: Buscar por produto - Nome aproximado</li>
	<li>Cen&aacute;rio: Buscar por produto - Campo de pesquisa vazio</li>
</ul>

<p><em>Funcionalidade: Sacola de Compras</em></p>

<ul>
	<li>Cen&aacute;rio: Sacola de Compras - Adicionar produto</li>
	<li>Cen&aacute;rio: Sacola de Compras - Excluir produto</li>
</ul>

<p><strong>Criando as Features de Teste</strong></p>

<p>Tendo em m&atilde;os os Cen&aacute;rios de cada fluxos de teste (fluxo base e alternativos), comecei a escrita das features em&nbsp;<strong>gherkin</strong>&nbsp;tendo como base o&nbsp;<strong>BDD</strong></p>
