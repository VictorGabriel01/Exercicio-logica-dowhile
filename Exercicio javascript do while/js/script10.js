var numero1 = parseInt(prompt("Digite um número"));
var numero2 = parseInt(prompt("Digite um número"));
var numero3 = 1;
var contadora = 1;
do {
    var numero3 = numero3+numero2;
    contadora++;
} while (numero3 == numero1);

alert(numero1+" / "+numero2+ " = "+ contadora);