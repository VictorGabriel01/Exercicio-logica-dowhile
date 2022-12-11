
do {
    var valor = parseInt(prompt("Digite um valor positivo inteiro (valor negativo para encerrar):"));
    if (valor > 1) {
        var maior = valor;
        alert(maior);
    }
} while (valor <= 0);