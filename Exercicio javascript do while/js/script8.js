do {
    

var nome = prompt("Digite o nome do cômodo que deseja calcular a area: ");
var largura = parseInt(prompt("Digite o valor da largura do cômodo :"));
var comprimento = parseInt(prompt("Digite o valor do comprimento do cômodo : "));
var area = comprimento*largura;
var opcao = prompt("Deseja calcular novo cômodo?");
alert("A area do(a) "+ nome+" é "+ area);
var soma = soma + area
} while (opcao == "nao");
alert("A somatoria das area calculadas é"+ soma);
