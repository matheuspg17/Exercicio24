# Resolução Exercicio24

## Descrição do problema
Escreva um programa em Java que leia uma quantidade n de números inteiros, sendo
que o valor de n deve ser informado como a primeira entrada do programa. Em seguida,
o programa deverá solicitar e ler os n números inteiros informados pelo usuário. Após
finalizar a leitura de todos os valores, o programa deverá apresentar o menor valor, o
maior valor, a soma de todos os valores lidos e a média aritmética dos números
informados. 

## Como Funciona
1. **Entrada da Quantidade:** O programa solicita e armazena o total de registros que serão digitados na variável `controle`.
2. **Laço de Repetição (`for`):** Executa um bloco de leitura exatamente `controle` vezes para obter individualmente cada `numero`.
3. **Cálculo Acumulado:** A cada iteração, o valor atual do número é adicionado à variável `soma`.
4. **Verificação de Limites:** 
   - Se for o primeiro número lido (`i == 1`), ele é definido inicialmente tanto como o `numeromaior` quanto o `numeromenor`.
   - Nas iterações seguintes, estruturas condicionais `if` atualizam dinamicamente os valores de `numeromaior` e `numeromenor` comparando-os com as novas entradas.
5. **Cálculo da Média:** Fora do laço, a média aritmética é calculada dividindo `soma` por `controle`, fazendo um cast para `(double)` para manter a precisão real.
6. **Saída de Dados:** O programa imprime o menor valor, o maior valor, a soma acumulada e a média formatada via `System.out.printf`.