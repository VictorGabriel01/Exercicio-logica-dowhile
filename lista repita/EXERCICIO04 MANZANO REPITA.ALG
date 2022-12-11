Algoritmo "EXERCICIO 4  "
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/10/2022
Var
   // Seção de Declarações das variáveis
   contador,grao,soma,quadrado:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   quadrado<- 1
   soma<- quadrado
   grao<- 2
   escreval(" 1")
   repita
      escreval(grao)
      contador<- contador +1
      grao<- grao *2
      quadrado<- quadrado + 1
      soma<- soma + grao

   ate contador = 64
   escreval(soma)

Fimalgoritmo