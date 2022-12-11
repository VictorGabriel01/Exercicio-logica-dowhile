Algoritmo "exercicio2 manzano repita"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Jailson
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Victor
// Data atual  : 28/09/2022
Var
// Seção de Declarações das variáveis 
contadora,somadora:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
contadora<-1
repita
se contadora mod 2  = 0 entao
somadora<-somadora+contadora
fimse
contadora<-contadora+1
ate contadora>500
escreval("A soma é:",somadora)

Fimalgoritmo