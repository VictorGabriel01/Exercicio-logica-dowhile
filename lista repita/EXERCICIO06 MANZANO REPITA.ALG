Algoritmo "Exercicio 6"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/10/2022
Var
   // Seção de Declarações das variáveis
   contador, numero:inteiro
   soma:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   escreval("Digite um numero positivo: ")
   leia(numero)
   se numero <= 0 entao
      repita
         escreval("Digite um numero positivo: ")
         leia(numero)
      ate numero <= 0
      fimse

Fimalgoritmo