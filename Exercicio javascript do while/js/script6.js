var numero = parseInt(prompt("Digite um número positivo:"));
if (numero <= 0) {
    do {
        var numero = parseInt(prompt("Digite um número positivo:"));
    } while (numero <= 0);
}