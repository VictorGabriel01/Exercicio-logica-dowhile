var contadora = 1;
var acumuladora = 0;

do {
    if (contadora % 2 == 0) {
       acumuladora=acumuladora+contadora; 
    }
    contadora++;

   
}  while (contadora<501); 
document.write("o valor total é"+acumuladora);