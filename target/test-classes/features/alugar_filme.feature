Feature: Alugar Filme
	Como um usuário 
	Eu quero cadastrar alguéis de filmes
	Para controlar preços e datas de entrega
	
Scenario: Não deve alugar filme sem estoque
	Given um filme com estoque de 0 unidades
	When alugar
	Then não será possivel por falta de estoque
	And o estoque do filme será 0 unidade
	
Scenario Outline: Deve dar condições conforme tipo de aluguel
	Given um filme com estoque de 2 unidades
	And que o preço de aluguel seja R$ <preco>
	And que o tipo do aluguel seja <tipo>
	When alugar
	Then o preço do aluguel será R$ <valor>
	And a data de entrega será em <qtdDias> dias
	And a pontuação será de <pontuacao> pontos
	
Examples:	
	| preco |   tipo    | valor | qtdDias | pontuacao |
	|   4   | extendido |   8   |    3    |      2    |
	|   4   | comum     |   4   |    1    |      1    |
	|   10  | extendido |   20  |    3    |      2    |
	
