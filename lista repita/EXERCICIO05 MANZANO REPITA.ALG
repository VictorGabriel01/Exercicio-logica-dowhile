Algoritmo "exercicio 5 manzano repita"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/10/2022
Var
   // Se??o de Declara??es das vari?veis
   contador,numero,fatorial,soma : inteiro

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...


   repita

      escreval("Digite um numero: ")
      leia(numero)
      contador <- contador + 1
      fatorial <- 1
      para contador de 1 ate numero faca
         fatorial <- fatorial * contador
      fimpara
      soma <- soma + fatorial
      escreval(fatorial)

   ate contador = 15
   escreval(soma)

Fimalgoritmo