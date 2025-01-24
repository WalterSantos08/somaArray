Programa de Soma de Elementos de um Array
Este programa em Java calcula a soma de todos os elementos de um array de números inteiros fornecido pelo usuário.

Como funciona?
O programa solicita ao usuário o tamanho do array.
Em seguida, o usuário insere os números que compõem o array.
O programa calcula e exibe a soma de todos os números inseridos.
Requisitos
Java instalado no seu computador.
Ambiente de execução ou IDE para executar o código (por exemplo: Eclipse, IntelliJ IDEA ou terminal).
Como usar?
Compile o programa:

bash
Copiar
Editar
javac somaArray.java
Execute o programa:

bash
Copiar
Editar
java somaArray
Insira o tamanho do array quando solicitado.

Insira os números um por um conforme as instruções na tela.

O programa exibirá a soma dos números inseridos.

Exemplo de execução
Entrada:

yaml
Copiar
Editar
Digite o tamanho do array:
3
digite os numeros do array:
numero 1:
5
numero 2:
10
numero 3:
15
Saída:

c
Copiar
Editar
A soma dos elementos do array é: 30
Estrutura do Código
Entrada de Dados: O programa usa a classe Scanner para capturar a entrada do usuário.
Loop para Inserção: Um for é utilizado para preencher o array com os números fornecidos pelo usuário.
Cálculo da Soma: Um laço for-each itera sobre os elementos do array e soma todos os valores.
Saída: Exibe a soma no console.
