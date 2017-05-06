Universidade Federal do Rio Grande do Norte, 2017.1
Estrutura de Dados Básicas II

Alunos:
Gisleude Linhares
Ana Clara Nobre

Complexidades:
	insert() -> Complexidade O(h), por que no pior caso o algoritmo descerá até a altura da arvore(h)
	search() -> Complexidade O(h), por que no pior caso o algoritmo descerá até a altura da arvore(h)
	median() -> Complexidade O(h), por que no pior caso o algoritmo descerá até a altura da arvore(h)
	treeHeight() -> Complexidade O(n), por que o algoritmo está em função da quantidade de nós da arvore e
se somarmos os elementos da esquerda e direita da arvore, temos n-1, logo temos T(n) = n -1, assim, a complexidade
é de O(n).
	toString() ->
	isFull() ->	Complexidade O(n), por que o algoritmo roda em função da outra função treeHeight() que tem
complexidade O(n)
	ifComplete() -> Complexidade O(n), por que o algoritmo roda em função da outra função treeHeight() que tem
complexidade O(n)
	nElement() -> Complexidade O(n), por que o algoritmo irá diminuir o valor de n em 1 toda vez que for chamada
recursivamente até o valor de n ser 0.

Observações sobre as funções:
	Não implementamos as funções de remover e posição.
	
Observaçoes sobre execução:
	Para executar o projeto em Java, é necessário ter uma IDE java como Eclipse ou NetBeans ou compilar o arquivo
	Principal.java através do terminal.
	
	Pela IDE basta importar o projeto.
	
	Pelo terminal você deve executar o comando para compilar:
		"javac Principal.java"
	E o comando para executar:
		"java Principal"
	
