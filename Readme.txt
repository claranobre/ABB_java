Universidade Federal do Rio Grande do Norte, 2017.1
Estrutura de Dados B�sicas II

Alunos:
Gisleude Linhares
Ana Clara Nobre

Complexidades:
	insert() -> Complexidade O(h), por que no pior caso o algoritmo descer� at� a altura da arvore(h)
	search() -> Complexidade O(h), por que no pior caso o algoritmo descer� at� a altura da arvore(h)
	median() -> Complexidade O(h), por que no pior caso o algoritmo descer� at� a altura da arvore(h)
	treeHeight() -> Complexidade O(n), por que o algoritmo est� em fun��o da quantidade de n�s da arvore e
se somarmos os elementos da esquerda e direita da arvore, temos n-1, logo temos T(n) = n -1, assim, a complexidade
� de O(n).
	toString() ->
	isFull() ->	Complexidade O(n), por que o algoritmo roda em fun��o da outra fun��o treeHeight() que tem
complexidade O(n)
	ifComplete() -> Complexidade O(n), por que o algoritmo roda em fun��o da outra fun��o treeHeight() que tem
complexidade O(n)
	nElement() -> Complexidade O(n), por que o algoritmo ir� diminuir o valor de n em 1 toda vez que for chamada
recursivamente at� o valor de n ser 0.

Observa��es sobre as fun��es:
	N�o implementamos as fun��es de remover e posi��o.
	
Observa�oes sobre execu��o:
	Para executar o projeto em Java, � necess�rio ter uma IDE java como Eclipse ou NetBeans ou compilar o arquivo
	Principal.java atrav�s do terminal.
	
	Pela IDE basta importar o projeto.
	
	Pelo terminal voc� deve executar o comando para compilar:
		"javac Principal.java"
	E o comando para executar:
		"java Principal"
	
