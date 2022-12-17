var numero = 1;
var fatorial = 1;
do {
    var fatorial = fatorial*numero;
    if (numero % 2 == 1) {
        alert(numero+" : "+fatorial);
    }
    numero++;
} while (numero > 10);