Algoritmo "Exercicio 6"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/10/2022
Var
   // Se??o de Declara??es das vari?veis
   contador, numero:inteiro
   soma:real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...

   escreval("Digite um numero positivo: ")
   leia(numero)
   se numero <= 0 entao
      repita
         escreval("Digite um numero positivo: ")
         leia(numero)
      ate numero <= 0
      fimse

Fimalgoritmo